package exemplos;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float numero;
		
		System.out.println("Digite um n�mero diferente de 0: ");
		numero = scan.nextFloat();
		
		if (numero > 0) {
			System.out.println("Este � um n�mero positivo!");
			}else if (numero < 0){
			System.out.println("Este � um n�mero negativo!");	
			}else {
				System.out.println("Este � um n�mero neutro!");	
			}

	}

}
