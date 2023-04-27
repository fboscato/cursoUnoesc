package Ex2;

import org.junit.Assert;
import org.junit.Test;

import Ex1.Calculadora;

public class CalculadoraTest {
	@Test
	public void deveriaSubtrairDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc = new Calculadora();

		// Execu��o (act)
		int subtrair = calc.subtrair(41, 1);

		// Verifica��o (assert)
		Assert.assertEquals(40, subtrair);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc2 = new Calculadora();

		// Execu��o (act)
		int Multiplicar = calc2.multiplicar(41, 1);

		// Verifica��o (assert)
		Assert.assertEquals(41, Multiplicar);
	}

	@Test
	public void deveriaSubtrairUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(10, 0);
		Assert.assertEquals(10, subtrair);
	}
	
	@Test
	public void deveriaSubtrairUmNumeroPositivoUmNegativo() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(5, -5);
		Assert.assertEquals(10, subtrair);
	}
	
	@Test
	public void deveriaSubtrairDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(-2,-3);
		Assert.assertEquals(1, subtrair);
	}
	
	@Test
	public void deveriaMultiplicarUmNumeroPositivoComZero() {
		Calculadora calc2 = new Calculadora();
		int Multiplicar = calc2.multiplicar(10, 0);
		Assert.assertEquals(0, Multiplicar);
	}
	
	@Test
	public void deveriaMultiplicarUmNumeroPositivoUmNegativo() {
		Calculadora calc2 = new Calculadora();
		int Multiplicar = calc2.multiplicar(5, -5);
		Assert.assertEquals(-25, Multiplicar);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumerosNegativos() {
		Calculadora calc2 = new Calculadora();
		int Multiplicar = calc2.multiplicar(-2,-3);
		Assert.assertEquals(6, Multiplicar);
	}
}
