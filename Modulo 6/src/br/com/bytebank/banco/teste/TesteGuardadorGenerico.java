package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorGenerico;

public class TesteGuardadorGenerico {

	public static void main(String[] args) {
		
		GuardadorGenerico guardador = new GuardadorGenerico();
		
		Cliente cliente = new Cliente();
		Conta conta = new ContaCorrente(22,33);
		
		cliente.setNome("Vinicius");
		
		guardador.adicionar(cliente);
		guardador.adicionar(conta);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Tamanho "+tamanho);
		
		ContaCorrente ref = (ContaCorrente) guardador.getReferencias(1);
		Cliente ref1 = (Cliente) guardador.getReferencias(0);

		
		System.out.println(ref.getNumero());
		System.out.println(ref1.getNome());
		
		
		
	}

}
