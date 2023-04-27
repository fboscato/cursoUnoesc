package exercicio2_25_06_22;

import java.util.Scanner;

import exercicio2_25_06_22.Aluno;

public class Principal {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe a sua idade: ");
		int idade = entrada.nextInt();
		
		Aluno alunoNome = new Aluno(nome, idade);
		
		System.out.println("Informe a primeira nota: ");
		double n1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double n2 = entrada.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double n3 = entrada.nextDouble();
		
		alunoNome.calculaMedia(n1, n2, n3);
		alunoNome.verificarAprovacao();

		
	}

}
