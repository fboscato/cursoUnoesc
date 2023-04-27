package atividade2_07_07_22;

public class Docente extends Funcionario {
	
	private double titulacao;
	private int nivel;
	
	@Override
	public double calcularSalario() {
		super.setSalario(super.getSalario()+this.getNivel());
		return super.getSalario();
	}
	
	public double getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(double titulacao) {
		this.titulacao = titulacao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
