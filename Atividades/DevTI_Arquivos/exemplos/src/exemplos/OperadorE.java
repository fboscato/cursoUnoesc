package exemplos;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {

		String aluno;
		float media, frequencia;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual � o nome do aluno? ");
		aluno = ler.nextLine();
		System.out.println("Qual � a m�dia do aluno? ");
		media = ler.nextFloat();
		System.out.println("Qual � a frequ�ncia do aluno? ");
		frequencia = ler.nextFloat();

		if (media >= 7 && frequencia >= 75) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}

	}

}
