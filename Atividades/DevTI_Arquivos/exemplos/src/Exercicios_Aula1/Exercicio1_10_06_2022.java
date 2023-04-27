package Exercicios_Aula1;

import java.util.Scanner;

public class Exercicio1_10_06_2022 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int salario, valorHora, HorasTrab ;
		
		System.out.println("Quanto você ganha por hora: ");
		valorHora = entrada.nextInt();
		System.out.println("Quantas horas você trabalhou: ");
		HorasTrab = entrada.nextInt();
		
		salario = (HorasTrab * valorHora);
		
		System.out.println("Seu salário é de: "+salario);

	}

}
