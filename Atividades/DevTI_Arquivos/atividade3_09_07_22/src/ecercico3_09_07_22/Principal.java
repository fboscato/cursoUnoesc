package ecercico3_09_07_22;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa("Juliano","Maravilha","988237991");
		Fornecedor fornecedor = new Fornecedor("Paulo","São Miguel","988238891");
		
		pessoa.dadosPessoa();
		fornecedor.dadosPessoa();
		fornecedor.obterSaldo();
	}

}
