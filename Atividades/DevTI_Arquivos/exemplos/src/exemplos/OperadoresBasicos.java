package exemplos;

import java.util.Scanner;

public class OperadoresBasicos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float num1, num2, soma, sub, mult, div;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextFloat();
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("O valor da soma �: "+soma);
		System.out.println("O valor da subtra��o �: "+sub);
		System.out.println("O valor da multiplica��o �: "+mult);
		System.out.println("O valor da divis�o �: "+div);

	}

}
