package exercicio1_09_07_22;

public class Principal {

	public static void main(String[] args) {
	
		AssistenteTecnico assisTec = new AssistenteTecnico("Paulo", 1000, 154);
		AssistenteAdministrativo assisAdm = new AssistenteAdministrativo("Marisa", 5000, 155);
		
		System.out.println(assisTec.toString());
		System.out.println();
		System.out.println(assisAdm.toString());
		System.out.println();
			
	}

}
