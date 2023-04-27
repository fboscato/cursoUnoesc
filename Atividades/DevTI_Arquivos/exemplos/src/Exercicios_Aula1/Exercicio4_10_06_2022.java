package Exercicios_Aula1;

import java.util.Scanner;

public class Exercicio4_10_06_2022 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int nota1, nota2, nota3, media;
		
		System.out.println("Informe qual é o seu nome : ");
		nome = entrada.next();
		System.out.println("Informe qual a nota 1 : ");
		nota1 = entrada.nextInt();
		System.out.println("Informe qual a nota 2 : ");
		nota2 = entrada.nextInt();
		System.out.println("Informe qual a nota 3 : ");
		nota3 = entrada.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;
		
		switch (media) {
		case 7:
			System.out.println("Aprovado");
			break;
		case 2:
			System.out.println("Em exame");
			break;
		case 5:
			System.out.println("Reprovado");
			break;
			
		}

}
}
