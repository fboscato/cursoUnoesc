package exercicios2_25_06_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Caderno ca = new Caderno();
		int escolha = 0;
		Scanner ler = new Scanner(System.in);
		do {
		System.out.println("O que voc� deseja fazer? ");
		System.out.println("1 - ADICIONAR ANOTA��O");
		System.out.println("2 - VISUALIZAR CADERNO DE ANOTA��ES");
		System.out.println("3 - APAGAR TODAS AS ANOTA��ES");
		System.out.println("4 - SAIR");
		
		escolha = ler.nextInt(); 
		switch (escolha) {
		
		case 1:
			ca.adicionaranotacao();
			break;
		case 2:
			ca.visualizaranotacao();
			break;
		case 3:
			ca.apagaranotacoes();
			break;
		case 4:
			System.out.println("Entendido, finalizando sistema!");
			break;
		default:
			System.out.println("A op��o escolhida n�o � v�lida, escolha novamente.");
		}
		
	}while (escolha != 4);

	}
}
