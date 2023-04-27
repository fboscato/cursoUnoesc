package ecercico3_09_07_22;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
