package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno aluno1 = new Aluno("Vinicius", 12312);
		Aluno aluno2 = new Aluno("Pedro", 12454);
		Aluno aluno3 = new Aluno("Joao", 35345);
		
		curso.matricula(aluno1);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		System.out.println(curso.buscaMatriculado(12312));
		
	}

}
