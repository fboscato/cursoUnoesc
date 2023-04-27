package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio5_11_06_2022 {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);

		    String nome;
			int idade;
			
			System.out.println("Informe o seu nome: ");
			nome = ler.next();
			System.out.println("Informe qual é a sua idade: ");
			idade = ler.nextInt();
		 
		    if (idade <= 16) {
		    System.out.println(nome+" você não pode votar!");
		    } else {
		    System.out.println(nome+" você está apto para votar!");
		    }

	}

}
