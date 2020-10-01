package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Joao"; //Object literal
		String outro = new String("Alura"); //má pratica, sempre preferir a sintaxe literal
		
		String novo = outro.replace("A","a");
		System.out.println(novo);
		
		String novoMaiusculo = novo.toUpperCase();
		System.out.println(novoMaiusculo);
		
		String novoMinusculo = novo.toLowerCase();
		System.out.println(novoMinusculo);
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("ao");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
