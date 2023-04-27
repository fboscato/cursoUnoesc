package Exercicios_Aula3_Entregar;

public class Exercicio7_11_06_2022 {

	public static void main(String[] args) {

		int anos = 0;
		float altze = (float) 1.10, altchico = (float) 1.50;

		do {
			altze = (float) (altze + 0.03);
			altchico = (float) (altchico + 0.02);
			anos = anos+1;
		} while (altze <= altchico);

		System.out.println("Daqui " + anos + " anos Zé vai ser maior que Chico.");
	}

}
