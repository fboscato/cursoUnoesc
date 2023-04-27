public class Exercicio3 {
	
	static double seno = Math.toRadians(90);
	static double cosseno = Math.toRadians(90);
	static double tangente = Math.toRadians(45);

	public static void main(String[] args) {
		System.out.println("(A) 2 elevado 10 = "+Math.pow(2,10));
		System.out.println("(B) Raiz quadrada de 1000 = "+Math.sqrt(1000));
		System.out.println("(C) Valor absoluto de -10 = "+Math.abs(-10));
		System.out.println("(D) Valor máximo de 42 e 666 é = "+Math.max(42,666));
		System.out.println("(E) Valor máximo de 42 e 666 é = "+Math.min(42,666));
		System.out.println("(F) Arredondamento de 4,9 para cima = "+Math.ceil(4.9));
		System.out.println("(G) Arredondamento de 4,9 para baixo = "+Math.floor(4.9));
		System.out.println();
		System.out.println("(H) Calcular o seno (sin) e cosseno (cos) de 90° e a tangente (tan) de 45°");
		System.out.println(""+
						   " \n (I) Calcular Seno, cosseno e tangente:"+
						   " \n     Seno = "+Math.sin(90)+
						   " \n     Cosseno = "+Math.cos(90)+
						   " \n     Tangente = "+Math.tan(45));
		System.out.println();
		System.out.println(" \n (II) Converter Seno, cosseno e tangente:"+
				   		   " \n      Seno = "+seno+
				           " \n      Cosseno = "+cosseno+
				           " \n      Tangente = "+tangente);
		System.out.println();
		System.out.println(" \n (III) Usar radianos e calcular Seno, cosseno e tangente:"+
		   		   		   " \n       Seno = "+Math.sin(seno)+
		                   " \n       Cosseno = "+Math.cos(cosseno)+
		                   " \n       Tangente = "+Math.tan(tangente));
		System.out.println();
		System.out.println(" \n (IV) Arredondar Seno, cosseno e tangente:"+
		   		   		   " \n      Seno = "+Math.round(seno)+
		                   " \n      Cosseno = "+Math.round(cosseno)+
		                   " \n      Tangente = "+Math.round(tangente));
	}

}
