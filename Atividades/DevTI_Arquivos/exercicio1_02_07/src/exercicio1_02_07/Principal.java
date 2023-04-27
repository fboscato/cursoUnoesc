package exercicio1_02_07;

public class Principal {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		int retorno;
		
		agenda.adicionarPessoas("Juliano", 18, 1.85f);
		agenda.adicionarPessoas("Marisa", 16, 1.55f);
		agenda.adicionarPessoas("Laura", 3, 1.00f);
		
		agenda.imprimirAgenda();
		
		agenda.removerPessoa("Marisa");
		retorno = agenda.buscarPessoa("Laura");
		System.out.println("O indice é: "+retorno);
				
	}

}
