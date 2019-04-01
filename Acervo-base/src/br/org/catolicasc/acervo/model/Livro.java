package br.org.catolicasc.acervo.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.org.catolicasc.acervo.dao.util.AdaptadorData;

@XmlSeeAlso(Ebook.class)
@XmlAccessorType(XmlAccessType.FIELD)
public class Livro {

	private String nome;
	@XmlElementWrapper(name = "autores")
	@XmlElement(name = "autor")
	private List<String> autores;
	private String editora;
	private Integer anoDePublicacao;
	private String resumo;
	@XmlJavaTypeAdapter(AdaptadorData.class)
	private Date dataCriacao = new Date();

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
}
