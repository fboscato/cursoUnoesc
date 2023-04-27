package exemplos;

import java.util.Scanner;

public class ProcediementoSemParametro {
	
	static float num1, num2, resposta;
	public static void soma(float num1, float num2) {
		resposta = num1 + num2;
	}
	public static void subtracao(float num1, float num2) {
		resposta = num1 - num2;
	}
	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		
		soma(num1,num2);
		System.out.println(resposta);
		subtracao(num1,num2);
		System.out.println(resposta);
	}

}
