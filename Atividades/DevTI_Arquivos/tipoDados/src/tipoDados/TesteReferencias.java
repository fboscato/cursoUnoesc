package tipoDados;

public class TesteReferencias {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa ("Z�",100);
		//Pessoa p2 = p1;
		Pessoa p2 = new Pessoa ("Z�",100);
		
		System.out.println("P1 = "+p1.getNome());
		System.out.println("P2 = "+p2.getNome());
		
		if (p1 == p2) {
			System.out.println("S�o Iguais");
		} else {
			System.out.println("S�o Diferentes");
		}
		
		p1.setNome("Maria da Dores");
		System.out.println("P2 = "+p2.getNome());
		System.out.println("P1 = "+p1.getNome());
	}

}
