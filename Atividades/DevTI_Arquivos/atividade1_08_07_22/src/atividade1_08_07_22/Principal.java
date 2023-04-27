package atividade1_08_07_22;

public class Principal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente ("Juliano", 5000, "Vendas");
		Vendedor vendedor = new Vendedor("Marisa", 1500, 10);
		
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());
		
	}

}
