package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        //return funcionario.getIdade() - outroFuncionario.getIdade();

		return Integer.compare(funcionario.getIdade(), outroFuncionario.getIdade());
			
	}

}
