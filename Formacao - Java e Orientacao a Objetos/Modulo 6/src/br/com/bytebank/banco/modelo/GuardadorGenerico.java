package br.com.bytebank.banco.modelo;

public class GuardadorGenerico {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorGenerico() {
		 referencias = new Object[10];
		 posicaoLivre = 0;
	}
	
	public void adicionar(Object o) {
		referencias[this.posicaoLivre] = o;
		posicaoLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencias(int ref) {
		return referencias[ref];
	}
	
	

}
