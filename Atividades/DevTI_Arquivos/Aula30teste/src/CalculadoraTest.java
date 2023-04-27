import org.junit.Test;
import org.junit.Assert;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc = new Calculadora();

		// Execu��o (act)
		int soma = calc.somar(41, 1);

		// Verifica��o (assert)
		Assert.assertEquals(42, soma);
	}

	@Test
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoUmNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		Assert.assertEquals(0, soma);
	}
	
	@Test
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2,-3);
		Assert.assertEquals(-5, soma);
	}
}
