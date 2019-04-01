package br.org.catolicasc.acervo.model;

public class Ebook extends Livro {

	private FormatoArquivo formato = FormatoArquivo.PDF;

	
	
	public FormatoArquivo getFormato() {
		return formato;
	}

	public void setFormato(FormatoArquivo formato) {
		this.formato = formato;
	}	
	
}
