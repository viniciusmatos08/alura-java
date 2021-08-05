package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.loja.models.Livro;



//Usando a anotacao @Named é possivel fazer com que o jsf consiga enchergar o Bean

/*
 * O CDI mantem o objeto vivo apenas enquanto o JSF estiver precisando dele, 
 * apos isso o objeto é descartado. Caso ainda seja necessario exibir/manipular os 
 * dados do objeto apos o mesmo ter sido usado no bean atraves do JSF é necessario 
 * usar a anotação @RequestScoped, assim os dados ainda ficam disponiveis apos o 
 * objeto ser usado
 */

//Anotações do CDI
@Named
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro = new Livro();
	
	public void salvar() {
		System.out.println("Livro Cadastrado: " + livro);
		System.out.println("Livro salvo com sucesso!");
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
