package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio3_11_06_2022 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos,qtdDia,totCons,totDias;
		float valorTot,valCart;
		
		System.out.println("Informe quantos anos voc� � fumante: ");
		anos = ler.nextInt();
		System.out.println("Informe quantos cigarros voc� consome por dia: ");
		qtdDia = ler.nextInt();
		System.out.println("Informe qual � o valor da carteira de cigarros : ");
		valCart = ler.nextFloat();
		
		totDias = anos * 365;
		totCons = totDias * qtdDia;
		valorTot = totCons * valCart;
		
		System.out.println("Voc� gastou :R$"+valorTot+" com compra de cigarros");

}

}
