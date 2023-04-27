package Ex3;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void deveriaDividirDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calcular calc = new Calcular();

		// Execu��o (act)
		int divisao = calc.divisao(41, 1);

		// Verifica��o (assert)
		Assert.assertEquals(41, divisao);
	}

	
	@Test
	public void deveriaDividirUmNumeroPositivoUmNegativo() {
		Calcular calc = new Calcular();
		int divisao = calc.divisao(5, -5);
		Assert.assertEquals(-1, divisao);
	}
	
	@Test
	public void deveriaDividirDoisNumerosNegativos() {
		Calcular calc = new Calcular();
		int divisao = calc.divisao(-2,-3);
		Assert.assertEquals(0, divisao);
	}
	
}
