package exemplos;

import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {

		String aluno, curso;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual � o nome do aluno? ");
		aluno = ler.nextLine();
		System.out.println("Qual � nome do curso? ");
		curso = ler.nextLine();

		if (curso.equals("Eng. de Produ��o") || curso.equals("Eng. El�trica")) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}

	}

}
