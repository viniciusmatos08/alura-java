package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		
		//Calculo que define o valor do bonus, sendo que ele é igual a 10% do valor do salario
		//Caso o bonus seja maior que 1000, o funcionario não é bonificado.
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salario maior que R$10000 nao pode receber bonus");
		}
		
		//Define que o valor tera 2 casas decimais e sera arredondado para cima
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
