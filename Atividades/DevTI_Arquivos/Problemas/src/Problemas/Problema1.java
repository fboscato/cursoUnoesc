package Problemas;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.print("Informe uma posição: ");
				Scanner ler = new Scanner(System.in);
				int posicao = ler.nextInt();

				if (posicao == -1) {
					break;

				}
				int[] arranjo = { 10, 20, 30 };

				System.out.println("Array:");
				System.out.println(arranjo[posicao]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro de acesso ao array");
			}
		}

		System.out.println("Programa finalizado!");
	}
}