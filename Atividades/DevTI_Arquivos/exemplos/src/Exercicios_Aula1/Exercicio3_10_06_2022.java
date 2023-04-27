package Exercicios_Aula1;

import java.util.Scanner;

public class Exercicio3_10_06_2022 {

	public static void main(String[] args) {

		String sexo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe qual é o seu sexo (M) ou (F) : ");
		sexo = entrada.next();

		switch (sexo) {
		case "M":
			System.out.println("Masculino");
			break;
		case "F":
			System.out.println("Feminino");
			break;
		default:
			System.out.println("Opção Inválida");
			break;

		}

	}
}
