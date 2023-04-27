package tipoDados;

import java.text.DecimalFormat;
import java.util.Locale;

public class TesteCalculos {

	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 3;
		double resultado = n1/n2;
		
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de 10/3 é iagual a = %.5f\n",resultado);

		Locale.setDefault(Locale.GERMANY);
		System.out.printf("Valor de 10/3 é iagual a = %.2f\n",resultado);

		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valor1 = 9.999;
		String resultado2 = df.format(valor1);
		
		System.out.println(resultado2);
	}

}

