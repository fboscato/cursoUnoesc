package ExemplosUteis;

public class FOR {

	public static void main(String[] args) {
		int contador;
		
		//LAÇO CONTADO INCREMENTAL		
		for (contador = 1; contador <= 10; contador++) {
			System.out.println(contador);
		}

		//LAÇO CONTADO INCREMENTAL DE 2 EM 2
		for (contador = 1; contador <= 10; contador += 2) {
			System.out.println(contador);
		}

		//LAÇO CONTADO DECREMENTAL
		for (contador = 10; contador >= 1; contador--) {
			System.out.println(contador);
		}
	}

}
