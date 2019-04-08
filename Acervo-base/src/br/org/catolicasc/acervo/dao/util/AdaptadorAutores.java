package br.org.catolicasc.acervo.dao.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.org.catolicasc.acervo.model.Autor;

//XmlAdapter<[RETORNO QUE VAI DAR], [O QUE VAI RECEBER]>
public class AdaptadorAutores extends XmlAdapter<String, Autor> {


	// Marshal: apresenta ao cliente;
	@Override
	public String marshal(Autor v) throws Exception {
		return v.getNome();
	}


	// Unmarshal: armazena no server;
	@Override
	public Autor unmarshal(String v) throws Exception {
		Autor autor = new Autor();
		autor.setNome(v);
		
		return autor;
	}	
	
}
