package br.com.alura;

public class TesteCursoComAlunos {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleÃ§Ãµes do Java", "Paulo Silveira");
        
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno aluno1 = new Aluno("Vinicius", 12312);
		Aluno aluno2 = new Aluno("Pedro", 12454);
		Aluno aluno3 = new Aluno("Joao", 35345);
		
		curso.matricula(aluno1);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		curso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		Aluno vinicius = new Aluno("Vinicius", 12312);
		
		System.out.println("O aluno Vinicius está matriculado?");
		System.out.println(curso.estaMatriculado(vinicius));
		
		System.out.println("O aluno1 é igual ao Vinicius?");
		System.out.println(curso.estaMatriculado(vinicius));
		

	}

}
