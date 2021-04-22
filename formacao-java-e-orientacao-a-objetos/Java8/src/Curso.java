import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		/*
		 * Ordenando a lista usando o metodo estatuco comparing passando como criterio
		 * de comparacao a quantidade de alunos (getAlunos()) utilizando lambda
		 */
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));

		// Mostrando no console o nome de cada curso utilando forEach da prorpia lista e
		// usando lambda
		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("-----------------------------------");

		/*
		 * Exatamente a mesma situação acima, porem utilizando method reference; uma
		 * maneira mais enxuta de se usar as expressões lambda
		 */
		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("-----------------------------------");

		/*
		 * Utilizando o metodo stream() para manipular a lista. Neste caso, usamos
		 * filter para definir uma condição que deve ser atentida, para que assim possa
		 * ser possivel capturar apenas os dados desejados. Usamos tambem o map, para
		 * espeficicar que queremos apenas os dados do metodo getNome, e não o objeto
		 * todo; a leitura seria a seguinte: dado um objeto Curso, retorne pra mim os
		 * nomes dos cursos (String) (é como uma Function). E por fim, o metodo forEach,
		 * para imprimir no console cada nome adquirido com o map. (Obs.: map e forEach
		 * estão usando a sintaxe mais enxuta, o method reference.
		 */
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.map(Curso::getNome)
			.forEach(System.out::println);
		
		/*
		 * Dentro do metodo stream, temos diversas funcionalidades, neste caso, usamos o findFirst() 
		 * que retorna um objeto do tipo Optional. O Optional possui deversos metodos para tratarmos o 
		 * conteudo que e retornado pelo fintFirst, com esses metodos evitamos de ficar enchendo o 
		 * codigo de if's para veridicar se o que foi retornado e nulo, por exemplo. 
		 */
	
		Optional<Curso> primeiroElemeto = cursos.stream()
						.filter(c -> c.getAlunos() >= 50)
						.findFirst();
		
		
		
		/*
		 * Aqui usamos o metodo collect, que como o proprio nome diz, coleta os dados, de forma 
		 * que possamos manipular eles. Neste trecho de codigo estamos pegando os dados e os transformando
		 * em uma lista, atraves da classe com metodos estaticos Collectors.
		 */
		List<Curso> listaComCollect = cursos.stream()
					.filter(c -> c.getAlunos() >= 50)
					.collect(Collectors.toList());
		
		
		
		/*
		 * Estamos usando o metodo averagingInt da classe Collectiors, para retornar a media de alunos
		 */
		Double media = cursos.stream()
				 	   .collect(Collectors.averagingInt(Curso::getAlunos));
		
		
		/*
		 * A ideia e a mesma do codigo acima, porem usando o metodo especifico para ints mapToInt
		 * que possui o metodo average. A diferenca e que desta forma, o retorno e uma objeto do tipo
		 * OptionalDouble, onde podemos tratar o retorno, para evitar nulos, por exemplo.
		 */
		OptionalDouble opMedia = cursos.stream()
						.mapToInt(c -> c.getAlunos())
						.average();
		
	}
}