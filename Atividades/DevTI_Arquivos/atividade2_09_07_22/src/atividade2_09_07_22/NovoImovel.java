package atividade2_09_07_22;

public class NovoImovel extends Imovel{
	
	private double precoAdicional;

	
	public NovoImovel(String endereco, double preco, double precoAdicional) {
		super(endereco, preco);
		this.precoAdicional = precoAdicional;
	}
	
	public double valorAdicional(double precoAdicional) {
		this.preco = (this.preco + precoAdicional);
		return this.preco;
	}
	
	public void dadosImovel() {
		System.out.println("O endereço do imóvel é: "+endereco);
		System.out.println("O valor do imóvel é: "+preco);
	}
	
	@Override
	public String toString() {
		return "Novo Imovel \nPreco Adicional = " +precoAdicional;
	}	

}
