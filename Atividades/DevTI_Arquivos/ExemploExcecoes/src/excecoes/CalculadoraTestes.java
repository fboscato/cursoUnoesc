package excecoes;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora calc  = new Calculadora();
		int soma = 0;
		
		soma = calc.somar(-2, 1);
		if (soma == -1) {
			System.out.println("Correto");
		} else {
			System.out.println("Problema");
		}
		//Maior valor inteiro: 2147483647
	try {
		soma = calc.somar(Integer.MAX_VALUE, 1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
