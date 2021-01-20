package br.com.bytebank.banco.modelo;

public class CalculadorImposto {
	
	double totalImpostos;
	
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		
		this.totalImpostos += valor;
		
	}
	
	
	public double getTotalImpostos() {
		return this.totalImpostos;
	}

}
