package ExemplosUteis;

import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		int media;
		Scanner ler = new Scanner (System.in);
		System.out.println("Escolha um n�mero de 1 a 4: ");
		media = ler.nextInt();
		switch (media) {
		
		case 1 :
			System.out.println("Voc� escolheu 1");
			break;
		case 2 :
			System.out.println("Voc� escolheu 2");
			break;
		case 3 :
			System.out.println("Voc� escolheu 3");
			break;
		case 4 :
			System.out.println("Voc� escolheu 4");
			break;
		default :
			System.out.println("N�mero inv�lido");
			break;
		}

	}

}
