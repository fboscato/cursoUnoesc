import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {

			float peso, imc, altura;

			System.out.println("Qual é seu peso: ");
			peso = entrada.nextFloat();
			System.out.println("Qual é sua altura: ");
			altura = entrada.nextFloat();

			imc = (float) (peso / (Math.pow(altura, altura)));

			System.out.println("Seu IMC é : " + imc);

			if (imc < 18.5) {
				System.out.println("MAGREZA");
			} else if (imc >= 18.5 && imc <= 24.9) {
				System.out.println("NORMAL");
			} else if (imc >= 25.0 && imc <= 29.9) {
				System.out.println("SOBREPESO");
			} else if (imc >= 30.0 && imc <= 39.9) {
				System.out.println("OBESIDADE");
			} else if (imc >= 40.0) {
				System.out.println("OBESIDADE GRAVE");
			}

		}
	}
}
