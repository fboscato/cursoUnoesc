package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio6_11_06_2022 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Informe qual � a sua idade: ");
		idade = ler.nextInt();

		if (idade >= 18 && idade <= 67) {
			System.out.println("Voc� pode ser doador de sangue!");
		} else {
			System.out.println("Voc� n�o pode ser doador de sangue!");
		}

	}
}
