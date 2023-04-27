package excecoes;

public class Calculadora {
	public int somar(int num1, int num2) {
		long resultado = (long)num1 + (long)num2;
		
		if (resultado > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("\nPROBLEMA DETECTADO ***\n" +
					"Resultado fora da faixa dos números inteiro!");
		}
		return num1 + num2;
	}

}
