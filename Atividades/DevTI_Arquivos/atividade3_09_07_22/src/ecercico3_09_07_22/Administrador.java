package ecercico3_09_07_22;

public class Administrador extends Empregado {
	
	private double ajudaCusto;

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

}
