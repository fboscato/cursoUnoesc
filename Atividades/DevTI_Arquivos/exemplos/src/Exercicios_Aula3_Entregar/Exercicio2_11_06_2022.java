package Exercicios_Aula3_Entregar;

import java.util.Scanner;

public class Exercicio2_11_06_2022 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dist,totComb,cons;
		
		System.out.println("Informe os Km percorridos: ");
		dist = ler.nextInt();
		System.out.println("Informe a quantidade de combustivel em litros: ");
		totComb = ler.nextInt();
					
		cons = dist / totComb;
		
		System.out.println("O média do consumo de combustivel é : "+cons);

}

}
