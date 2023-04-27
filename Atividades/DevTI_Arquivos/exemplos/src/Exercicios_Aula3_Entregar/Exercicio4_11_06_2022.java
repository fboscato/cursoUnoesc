package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio4_11_06_2022 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int maior, num1, num2;

		System.out.println("Informe o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			maior = num1;
			System.out.println("O número "+num1+" é o maior!");
		} else if (num2 > num1) {
			maior = num2;
			System.out.println("O número "+num2+" é o maior!");
		} else {
			System.out.println("O números informados são iguais!");
		}
	}
}
