package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio8_11_06_2022 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2;
		double pot = 0;

		System.out.println("Informe o valor da base: ");
		num1 = ler.nextInt();
		System.out.println("Informe o valor do expoente: ");
		num2 = ler.nextInt();

			pot = Math.pow(num1, num2);

		System.out.println(num1+" elavado a "+num2+" é = "+pot);
	}

}
