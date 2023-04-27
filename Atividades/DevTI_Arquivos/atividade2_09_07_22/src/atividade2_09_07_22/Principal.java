package atividade2_09_07_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 
		
		NovoImovel novoimovel = new NovoImovel("Linha Frederico", 35,0);
		Velho velho = new Velho("Linha Serrado", 25, 0);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o tipo do imóvel");
		System.out.println("Digite (1) para novo");
		System.out.println("Digite (2) para velho");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			System.out.println("O valor do imóvel novo é: "+novoimovel.valorAdicional(5));
		} else if 
			(opcao == 2) {
			System.out.println("O valor do imóvel velho é: "+velho.valorDesc(5));
		} else {
			System.out.println("Opçao Inválida");
		}
		
	}

}
