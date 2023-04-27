package atividade1_14_07_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int opcao;
			double tamanhoBase, altura;
			
			
			System.out.println("Qual forma deseja calcular");
			System.out.println("1 Quadrado");
			System.out.println("2 Retangulo");
			System.out.println("3 Circulo");
			opcao = entrada.nextInt();
			switch (opcao) {
			
			case 1:
				System.out.println("Informe o tamanho do lado: ");
				Quadrado q = new Quadrado(entrada.nextDouble());
				System.out.println(q.calcularArea());
				break;	
				
			case 2:
				System.out.println("Informe o tamanho da base: ");
				tamanhoBase = entrada.nextDouble();
				System.out.println("Digite a altura: ");
				altura = entrada.nextDouble();
				Retangulo r = new Retangulo(tamanhoBase, altura);
				System.out.println(r.calcularArea());
				break;
				
			case 3:
				System.out.println("Informe o tamanho do raio: ");
				Circulo c = new Circulo (entrada.nextDouble());
				System.out.println(c.calcularArea());
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}

	}

}
