package exemplos;

import java.util.Scanner;

public class CondicionalEscolhaCaso {

	public static void main(String[] args) {

		int opcao;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um número de 1 a 4");
		opcao = entrada.nextInt();
				
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2");
			break;
		case 3:
			System.out.println("Você escolheu a opção 3");
			break;
		case 4:
			System.out.println("Você escolheu a opção 4");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

}
