package atividade2_07_07_22;

public class Tecnico extends Funcionario {
	
	private String funcao;
	private double horaExtra;
	
	@Override
	public double calcularSalario() {
		super.setSalario(super.getSalario() + this.getHoraExtra());
		return super.getSalario();
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

}
