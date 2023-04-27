package exercicio1_25_06_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Calculadora calc = new Calculadora();
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	double n1 = entrada.nextDouble();
	System.out.println("Digite um número: ");
	double n2 = entrada.nextDouble();
	calc.somar(n1,n2);
	calc.subtrair(n1, n2);
	calc.dividir(n1, n2);
	calc.multiplicar(n1, n2);
	}

}
