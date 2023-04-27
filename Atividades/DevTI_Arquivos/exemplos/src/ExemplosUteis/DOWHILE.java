package ExemplosUteis;

public class DOWHILE {

	public static void main(String[] args) {
		int contador;
		
		//LAÇO CONDICIONAL INCREMENTAL
		contador = 1;
		do {
			System.out.println(contador);
			contador = contador + 1;
		} while (contador <= 10);

		//LAÇO CONTADO INCREMENTAL DE 2 EM 2
		contador = 1;
		do {
			System.out.println(contador);
			contador = contador + 2;
		} while (contador <= 10);

		//LAÇO CONTADO DECREMENTAL
		contador = 10;
		do {
			System.out.println(contador);
			contador = contador - 1;
		} while (contador >= 1);

	}

}
