package exercicio3_25_06_22;

import java.util.Scanner;

import exercicio3_25_06_22.Conta;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Conta banco = new Conta("1", "Corrente", "Juliano", 1000f);
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("    MENU     ");
			System.out.println();
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Extrato");
			System.out.println("4 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o valor para deposito: ");
				double deposito = entrada.nextDouble();
				banco.depositar(deposito);
				break;
			case 2:
				System.out.println("Informe o valor para saque: ");
				double saque = entrada.nextDouble();
				banco.sacar(saque);
				break;
			case 3:
				banco.verificaSaldo();
				break;

			case 4:
				break;
			}
		}

	}

}
