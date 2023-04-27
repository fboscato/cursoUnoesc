package tipoDados;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ProblemaPontoFlutuante {
	public static void main(String[] args) {
		// Problema com n�meros em ponto flutuante
		double a = 0.1;
		double b = 0.2;
		double c = a + b;

		if (c != 0.3) {
			System.out.println("Algo estranho est� acontecendo: 0,1 + 0,2 != " + c);
		}

		// 1a. solu��o: Arredondamento 'manual'
		c = Math.round((a + b) * 100) / 100.;
		
		if (c == 0.3) {
			System.out.println("M�todo 1, ok! 0,1 + 0,2 = " + c);
		}

		// 2a. solu��o: String.format()
		String str = String.format(Locale.US, "%.2f", (a + b));
		c = Double.valueOf(str);
		
		if (c == 0.3) {
			System.out.println("M�todo 2, ok! 0,1 + 0,2 = " + c);
		}
		
		// 3a. solu��o: DecimalFormat.format()
		DecimalFormat formato = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US)); 
		String res = formato.format(a + b);
		c = Double.valueOf(res);

		if (c == 0.3) {
			System.out.println("M�todo 3, ok! 0,1 + 0,2 = " + c);
		}
	}
}

