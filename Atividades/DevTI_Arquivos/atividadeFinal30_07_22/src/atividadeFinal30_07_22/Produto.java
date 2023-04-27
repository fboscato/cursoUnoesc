package atividadeFinal30_07_22;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidadeEstoque;


	public boolean verificarEstoque() {
		if (quantidadeEstoque > 0) {
			return true;
		} else {
		return false;
		}
	}
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Override
	public String toString() {
		return "Produto = " + nome + "\nPreco = R$" + preco + "\nQuantidade Estoque = " + quantidadeEstoque;
	}

}
