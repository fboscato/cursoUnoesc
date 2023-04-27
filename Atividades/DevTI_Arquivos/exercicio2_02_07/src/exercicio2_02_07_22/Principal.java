package exercicio2_02_07_22;

public class Principal {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(1,8,9,8);
		
		elevador.inicializa(10,2);
		System.out.println("_______________");
		elevador.entra();
		elevador.entra();
		elevador.entra();
		System.out.println("_______________");
		elevador.sai();
		elevador.sai();
		elevador.sai();
		System.out.println("_______________");
		elevador.desce();
		elevador.desce();
		System.out.println("_______________");
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		

	}

}
