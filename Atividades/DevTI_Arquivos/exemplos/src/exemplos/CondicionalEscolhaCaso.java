package exemplos;

import java.util.Scanner;

public class CondicionalEscolhaCaso {

	public static void main(String[] args) {

		int opcao;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um n�mero de 1 a 4");
		opcao = entrada.nextInt();
				
		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o 1");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o 2");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o 3");
			break;
		case 4:
			System.out.println("Voc� escolheu a op��o 4");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}

	}

}
