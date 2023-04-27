package tipoDados;

public class Constantes {
	
	final static float NUMERO = 42.42f;
	
	final static long NUMERO_LONGO = 10_550_430_001L;
	
	final static double PI = 3.14159;
	
	final float TESTE = 10;

	public static void main(String[] args) {
			
		System.out.println(NUMERO);
		System.out.println(NUMERO_LONGO);
		System.out.println(PI);
		
		Constantes problema = new Constantes();
		System.out.println(problema.TESTE);
	
	}

}
