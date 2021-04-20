import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		// Consumidor instanciado a partir de uma classe que foi criada que implementa a
		// inteface Consumer
		Consumer<String> consumidor = new ImprimeNaLinha();

		// Compador instanciado a partir de uma classe que implementa a inteface
		// Comparator
		// Com ela podemos passar para o metodo sort() uma condição especifica para
		// odenar uma lista de Strings
		// Desta maneira evitamos que a ordenação padrão da classe String seja usada
		Comparator<String> comparador = new ComparaStringPorTamanho();

		// Aplicando o comparador no metodo sort da lista palavras
		// este metodo, antes do java 8, era usado a partir da classe Collections, que
		// possuia diversos metodos staticos para manipular listas
		palavras.sort(comparador);

		// Aplicando o uso do comparator, porem usando como classe anonima
		palavras.sort(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				}
				if (s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}

		});

		// Aplicando o uso do camparator, porem usando uma expressao lambda e o criterio
		// de comparação da Classe Integer
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//uma maneira ainda mais simples de usar o lambda, utilizando um metodo statico da classe
		//(alternativa para usar os metodos sem informar a interface todas as vezes: import static java.util.Comparator.*;)
		//Comparator, e passando como criterio de comparação o metodo lenght da String
		palavras.sort(Comparator.comparing(s -> s.length()));

		//Utilizando method reference para deixar o codigo ainda mais curto,
		//alem de curto, fica bem legivel.
		//basicamente esta informando quer usar o metodo lenght da classe String como parametro.
		palavras.sort(Comparator.comparing(String::length));
		

		// forEach recebendo um cosumidor de Strings que foi instanciado no codigo
		palavras.forEach(consumidor);

		// forEach recebendo uma classe anonima como parametro
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);

			}
		});

		// forEach usando a expressão lambda (a ideia e parecida com a da classe
		// anonima)
		// exemplo com apenas um comando dentro do foreach (nao precisa de chaves nem
		// ponto e virgula)
		palavras.forEach(s -> System.out.println(s));
		
		
		//Utilizando method reference para mostrar no console cada item iterado pelo forEach na lista de palavras
		//e uma maneira mais enxuta de se usar lambdas
		palavras.forEach(System.out::println);


		// Exemplo com mais de comando dentro do foreach (nesse caso precisa de chaves e
		// tambem ponto e virgula)
		palavras.forEach(s -> {
			System.out.println(s);
			System.out.println(s);
		});

		// Exemplo fora de contexo sobre como usar uma expressão lambda em casos onde
		// o metodo da interface funcional não recebe nenhum tipo de parametros

		// Usando classe anonima
		new Thread(new Runnable() {

			@Override
			public void run() {

			}

		}).start();

		// Usando expressão lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}

//Classe criada para implementar um cosumidor de Strings para ser instanciada e usado como parametro de um forEach
//Este e o modo mais extenso para se usar um consumidor, podemos tambem usar uma 
//classe anonima ou usar a sintaxe especial para cosumers do forEach (melhor opção)
class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);

	}
}

//Classe que implementa a interface Comparator, para que seja definido uma condição especida de ordenação de uma lista de Strings
class ComparaStringPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}
