package atividade2_09_07_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 
		
		NovoImovel novoimovel = new NovoImovel("Linha Frederico", 35,0);
		Velho velho = new Velho("Linha Serrado", 25, 0);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o tipo do im�vel");
		System.out.println("Digite (1) para novo");
		System.out.println("Digite (2) para velho");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			System.out.println("O valor do im�vel novo �: "+novoimovel.valorAdicional(5));
		} else if 
			(opcao == 2) {
			System.out.println("O valor do im�vel velho �: "+velho.valorDesc(5));
		} else {
			System.out.println("Op�ao Inv�lida");
		}
		
	}

}
