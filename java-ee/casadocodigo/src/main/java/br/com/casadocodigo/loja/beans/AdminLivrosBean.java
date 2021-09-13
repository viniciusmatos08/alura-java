package br.com.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.casadocodigo.loja.daos.AutorDao;
import br.com.casadocodigo.loja.daos.LivrosDao;
import br.com.casadocodigo.loja.models.Autor;
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
	
	//CDI
	@Inject
	private LivrosDao dao;
	@Inject
	private AutorDao autorDao;
	@Inject
	private FacesContext context;	

	private List<Integer> autoresId = new ArrayList<Integer>();
	
	//JTA
	@Transactional
	public String salvar() {
		for (Integer autorId : autoresId) {
			livro.getAutores().add(new Autor(autorId));
		}
		
		dao.salvar(livro);
		/*
		 * o getFlash() seria para que a ação de mostrar a mensagem seja iniciada
		 * no primero request, e, ao final do segundo request, a mensagem seja exibida.
		 * o conceito de Flash seria esse tempo entre um request e o outro.
		 * 
		 *  leitura: Externo ao contexto atual, dentro do escopo do Flash, mantenha as mensagens
		 */ 
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage("Livro cadastrado com sucesso!"));
		
		return "/livros/lista?faces-redirect=true";
	}
	
	public List<Autor> getAutores(){
		return autorDao.listar();	
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Integer> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

}
