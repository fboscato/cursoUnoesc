package exemplos;

import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {

		String aluno, curso;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual é o nome do aluno? ");
		aluno = ler.nextLine();
		System.out.println("Qual é nome do curso? ");
		curso = ler.nextLine();

		if (curso.equals("Eng. de Produção") || curso.equals("Eng. Elétrica")) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}

	}

}
