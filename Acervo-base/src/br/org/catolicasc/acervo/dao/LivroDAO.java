package br.org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import br.org.catolicasc.acervo.model.Autor;
import br.org.catolicasc.acervo.model.Ebook;
import br.org.catolicasc.acervo.model.Livro;

public class LivroDAO {
	
	private static List<Livro> Livros = 
			new ArrayList<Livro>();
	
	
	static {
		Livro livro = new Livro();
		livro.setNome(" Como fazer amigos e influênciar pessoas");
		livro.setAnoDePublicacao(1923);
		livro.setEditora(" Princeton ");
		
		Autor dale = new Autor();
		dale.setNome("Dale Carnegie");
		dale.setDataNascimento(new Date());
		Autor marie = new Autor();
		marie.setNome("Marie Carnegie");
		marie.setDataNascimento(new Date());
		livro.setAutores(Arrays.asList(dale, marie));
		
		Livros.add(livro);
		
		

		livro = new Ebook();
		livro.setNome(" Como fazer amigos e influênciar pessoas - EBOOK");
		livro.setAnoDePublicacao(1900);
		livro.setEditora(" Princeton ");
		
		Autor denise = new Autor();
		denise.setNome("Desine Carnegie");
		denise.setDataNascimento(new Date());
		livro.setAutores(Arrays.asList(denise, dale));
		
		Livros.add(livro);
		
	}
	
	public static List<Livro> ObterLivros(){
		return Livros;
	}

	public static void CriarLivro(Livro livro) {
		Livros.add(livro);
		
	}
	
}
