package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1eSolucao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		try {
			int[] numeros = new int[2];

			System.out.print("Digite o 1o. n�mero inteiro: ");
			numeros[0] = ler.nextInt();

			System.out.print("Digite o 2o. n�mero inteiro: ");
			numeros[1] = ler.nextInt();

			System.out.println(numeros[0] / numeros[1]);
		} catch (ArithmeticException e) {
			System.out.println("Erro de divis�o por zero");
			System.out.println(e.getMessage());
		} catch (InputMismatchException ex) {
			System.out.println("O valor inserido nao e um numero inteiro!");
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro capturado!!!");
			System.out.println(e.getMessage());
		} finally {
			ler.close();
		}
	}

}
