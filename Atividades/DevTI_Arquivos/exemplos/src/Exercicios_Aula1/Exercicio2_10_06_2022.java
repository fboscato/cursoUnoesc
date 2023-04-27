package Exercicios_Aula1;

import java.util.Scanner;

public class Exercicio2_10_06_2022 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float valorVenda, valorCompra, percentualImposto, percentualLucro, percentual, imposto;
		
		System.out.println("Informe o valor de compra do veículo: ");
		valorCompra = entrada.nextFloat();
		
		percentualLucro = 28;
		percentualImposto = 45;
		
		percentual = (valorCompra * percentualLucro)/100;
		imposto = (valorCompra * percentualImposto)/100;
		valorVenda = valorCompra + percentual + imposto;
		
		System.out.println("O Valor final do veículo é: "+valorVenda);
		
		

	}

}
