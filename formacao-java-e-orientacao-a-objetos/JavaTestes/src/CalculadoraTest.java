import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos(){
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,  7);
			
		/*
		 * Valida a igualdade entre dois valores, caso seja True, o teste passa, caso False, o teste não passa.
		 * A classe Assert é usada para validar o valor dos testes.
		 */
		Assert.assertEquals(10, soma);
	}

}
