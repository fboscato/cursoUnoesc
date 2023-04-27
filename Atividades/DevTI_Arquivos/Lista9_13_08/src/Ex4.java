import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			try {
				int[] numeros = new int[2];
				
				System.out.println("Digite o 1� n�mero inteiro: ");
				numeros[0] = ler.nextInt();
				
				System.out.println("Digite o 2� n�mero inteiro: ");
				numeros[1] = ler.nextInt();
				
				System.out.println(numeros[0] / numeros[1]);
			} catch (ArithmeticException e) {
				System.out.println("Erro de divis�o por zero");
				System.out.println(e.getMessage());
				
			} catch (InputMismatchException e) {
				System.out.println("Erro de caracter inv�lido");
				System.out.println(e.getMessage());
				
			} catch (RuntimeException e) {
				System.out.println("Erro de runtime identificado");
				System.out.println(e.getMessage());
				
			} catch (Exception e) {
				System.out.println("Erro capturado");
				System.out.println(e.getMessage());
			}
		}
	}
}
