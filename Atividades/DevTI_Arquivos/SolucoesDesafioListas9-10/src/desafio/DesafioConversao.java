package desafio;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1o. sal�rio: ");
		String entrada1 = sc.nextLine().replace(",", ".");

		System.out.print("2o. sal�rio: ");
		String entrada2 = sc.nextLine().replace(",", ".");

		System.out.print("3o. sal�rio: ");
		String entrada3 = sc.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(entrada1);
		double salario2 = Double.parseDouble(entrada2);
		double salario3 = Double.parseDouble(entrada3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("M�dia salarial:" + media);
		
		sc.close();
	}

}
