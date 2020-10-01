package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(1234, 555);
	}
	

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
