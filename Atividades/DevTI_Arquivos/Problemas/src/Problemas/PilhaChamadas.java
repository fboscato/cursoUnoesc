package Problemas;

public class PilhaChamadas {

	public static void main(String[] args) {
		System.out.println("** In�cio do m�todo main() ***");
		metodo1();
		System.out.println("** Fim do m�todo main() ***");
	}

	private static void metodo1() {
		System.out.println("\t** In�cio do m�todo metodo1() ***");
		metodo2();
		System.out.println("\t** Fim do m�todo metodo1() ***");
	}
	
	private static void metodo2() {
		System.out.println("\t\t** In�cio do m�todo metodo2() ***");
		metodo3();
		System.out.println("\t\t** Fim do m�todo metodo2() ***");
	}
	
	private static void metodo3() {
		System.out.println("\t\t\t** In�cio do m�todo metodo3() ***");
		
		try {		
		Double.parseDouble("10,5");
		} catch (NumberFormatException e) {
			System.out.println("Problema detectado");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("\t\t\t** Fim do m�todo metodo3() ***");
	}

}
