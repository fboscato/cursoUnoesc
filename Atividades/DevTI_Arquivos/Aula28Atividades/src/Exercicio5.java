
public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Fiz o cálculo manual de:  "+
				   "\n2 * 3,1415 = 6,283"+
				   "\ndepois multipliquei por 5000"+
				   "\nResultado manual = 31415");
		System.out.println();
		
		int raio = 5000;
		int circunferencia = (int) (2 * Math.PI * raio);
		
		System.out.println("Resultado programa = "+circunferencia);

	}

}
