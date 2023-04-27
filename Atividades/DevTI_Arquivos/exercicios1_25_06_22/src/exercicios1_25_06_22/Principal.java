package exercicios1_25_06_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o modelo do carro? ");
		veiculo.modelo = ler.next();
		System.out.println("Qual é a cor do carro? ");
		veiculo.cor = ler.next();
		System.out.println("Qual é o ano do carro? ");
		veiculo.ano = ler.nextInt();
		System.out.println("Qual é a quilometragem do carro? ");
		veiculo.quilometragem = ler.nextInt();
		
		
		veiculo.verificarManutencao();
		
		veiculo.exibirCor();
		
		veiculo.mudarCor();
		
		veiculo.exibirCor();
		
		
		
		
	}

}
