package excecoes;

public class Ex1bSolucao {

	public static void main(String[] args) {
		try {
			int[] numeros = {10, 0};
			
			System.out.println(numeros[0] / numeros[1]);	 
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado");
		} catch (Exception e) {
			System.out.println("Erro capturado!!!");
			System.out.println(e.getMessage());
		}
	}

}
