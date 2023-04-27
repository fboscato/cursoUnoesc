package exemplos;

import java.util.Scanner;

public class ComandosBasicos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, soma;
		System.out.println("Digite o primeiro numero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		//num2 = 5;
		
		soma = num1 + num2;
		
		System.out.println("A soma é:"+soma+"!");

	}

}
