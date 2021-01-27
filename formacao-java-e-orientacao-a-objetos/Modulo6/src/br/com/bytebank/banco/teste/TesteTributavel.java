package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {
	
	public static void main(String[] args) {
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		
		contaCorrente.deposita(100);
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		
		calculadorImposto.registra(contaCorrente);
		calculadorImposto.registra(seguroDeVida);

		System.out.println(calculadorImposto.getTotalImpostos());
	}

}
