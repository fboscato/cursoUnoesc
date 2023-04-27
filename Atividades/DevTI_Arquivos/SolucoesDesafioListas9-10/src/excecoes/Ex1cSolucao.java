package excecoes;

public class Ex1cSolucao {

	public static void main(String[] args) {
		try {
			int[] numeros = {10, 0};
			
			System.out.println(numeros[0] / numeros[1]);	 
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero");
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro capturado!!!");
			System.out.println(e.getMessage());
		} 
	}

}
