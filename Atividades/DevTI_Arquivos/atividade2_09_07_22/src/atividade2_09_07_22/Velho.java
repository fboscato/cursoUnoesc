package atividade2_09_07_22;

public class Velho extends Imovel {
	
private double valorDesconto;

	
		public Velho(String endereco, double preco, double valorDesconto) {
	super(endereco, preco);
	this.valorDesconto = valorDesconto;
}

	public double valorDesc(double valorDesc) {
		this.preco = (this.preco - valorDesc);
		return this.preco;
	}
	public void dadosImovel() {
		System.out.println("O endere�o do im�vel �: "+endereco);
		System.out.println("O valor do im�vel �: "+preco);
	}

	@Override
	public String toString() {
		return "Velho [valorDesconto=" + valorDesconto + "]";
	}

}
