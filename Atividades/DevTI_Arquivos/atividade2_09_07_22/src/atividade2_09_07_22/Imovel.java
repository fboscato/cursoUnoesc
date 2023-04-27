package atividade2_09_07_22;

public class Imovel {
	protected String endereco;
	protected double preco;
	
	public Imovel(String endereco, double preco) {
		super();
		this.endereco = endereco;
		this.setPreco(preco);
	}
		public void dadosImovel() {
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Preço: "+this.getPreco());
		
	}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		@Override
		public String toString() {
			return "Imovel [endereco=" + endereco + ", preco=" + preco + "]";
		}

}
