package exercicios1_25_06_22;

import java.util.Scanner;

public class Veiculo {
	
	String modelo, cor;
	int ano, quilometragem;
	Scanner ler = new Scanner(System.in);
			
		void verificarManutencao () {
		if (quilometragem < 25000) {
			System.out.println("Tudo ok!");
		} else if (quilometragem < 75000) {
			System.out.println("Realizar revis�o parcial!");
		} else {
			System.out.println("T� na hora de ir no mec�nico amig�o");
		}
	}
	
	void mudarCor ( ) {
		System.out.println("Informe a cor desejada");
		cor = ler.next();
	}	
	
	void exibirCor ( ) {
		System.out.println("A cor do carro � "+cor);
	}
}
