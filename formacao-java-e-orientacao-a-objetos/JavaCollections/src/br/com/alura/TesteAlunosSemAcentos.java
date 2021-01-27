package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        
        alunos.add("Joao Alberto");
        alunos.add("Lucas Oliveira");
        alunos.add("Matheus Marques");
        alunos.add("Marcos Rogerio");
        
        System.out.println(alunos.size());
        
        alunos.add("Marcos Rogerio");
        
        System.out.println(alunos.size());
        
        boolean adicionou = alunos.add("Marcos Rogerio");
        System.out.println("Marcos Rogerio foi adicionado ao Set? " + adicionou);
    }
}