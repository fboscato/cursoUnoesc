package exemplos;

public class RepeticaoPara {

	public static void main(String[] args) {
		int contador;
		
		for (contador = 1; contador <= 10; contador++) {
			System.out.println(contador);
		}
		
		for (contador = 10; contador >= 1; contador--) {
			System.out.println(contador);
		}
		
		for (contador = 1; contador <= 10; contador+=2) {
			System.out.println(contador);
		}

	}

}
