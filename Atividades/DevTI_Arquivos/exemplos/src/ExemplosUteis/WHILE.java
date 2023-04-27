package ExemplosUteis;

public class WHILE {

	public static void main(String[] args) {
		int contador;
		
		//LAÇO CONDICIONAL INCREMENTAL
		contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;
		}

		//LAÇO CONDICIONAL INCREMENTAL DE 2 EM 2
		contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 2;
		}

		//LAÇO CONDICIONAL DECREMENTAL
		contador = 10;
		while (contador >= 1) {
			System.out.println(contador);
			contador = contador - 1;
		}

	}

}
