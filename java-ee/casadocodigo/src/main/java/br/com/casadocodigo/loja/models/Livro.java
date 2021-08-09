package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

//Usado para que o JPA consiga relacionar o objeto com o banco de dados
@Entity
public class Livro {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	@Lob //iforma que este campo pode ter um conteudo muito extenso
	private String descricao;
	private BigDecimal preco;
	private Integer numeroPaginas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", numeroPaginas="
				+ numeroPaginas + "]";
	}

}
