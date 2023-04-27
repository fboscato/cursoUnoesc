package atividade1_07_07_22;

public class IngressoVip extends Ingresso {
	
	private float valorAdicional;

	@Override
	public String toString() {
		return "Valor do Ingresso VIP é: " + (super.getValor()+valorAdicional);
	}

	public IngressoVip() {
		super();
	}

	public IngressoVip(float valorAdicional) {
		super();
		this.valorAdicional = valorAdicional;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
}
