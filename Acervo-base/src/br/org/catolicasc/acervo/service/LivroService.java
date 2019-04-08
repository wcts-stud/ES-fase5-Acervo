package br.org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.org.catolicasc.acervo.dao.LivroDAO;
import br.org.catolicasc.acervo.model.Livro;
import br.org.catolicasc.acervo.model.Usuario;

@WebService
public class LivroService {
	
	private static final String CAT = "cat";

	@WebResult(name="livro")
	public List<Livro> listarLivros(){
		return 	LivroDAO.ObterLivros();
	}
	
	public void criarLivro(@WebParam(name="livro") Livro livro, 
			@WebParam(name="usuario", header=true) Usuario usuario) 
					throws UsuarioNaoAutenticadoException {
		
		if(CAT.equals(usuario.getLogin())
				&& CAT.equals(usuario.getPassword())){	
			LivroDAO.CriarLivro(livro);
		} else {
			throw new UsuarioNaoAutenticadoException();
		}
		
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/livros"
				, new LivroService());
		System.out.println(" Serviço iniciado! \n\t"
				+ "Acesse: http://localhost:8081/livros?wsdl");
	}
	
}
