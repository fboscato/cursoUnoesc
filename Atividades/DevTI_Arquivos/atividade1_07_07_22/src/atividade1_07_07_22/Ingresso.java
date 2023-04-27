package atividade1_07_07_22;

public class Ingresso {
	
	private float valor;
	
	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + "]";
	}

	public Ingresso() {
		super();
	}

	public Ingresso(float valor) {
		super();
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
