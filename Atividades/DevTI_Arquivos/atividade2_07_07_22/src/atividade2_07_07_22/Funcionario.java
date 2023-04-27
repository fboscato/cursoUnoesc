package atividade2_07_07_22;

public abstract class Funcionario {
	
	private String nome; 
	private double salario;
	
	//Método calcular salário
	public abstract double calcularSalario();

	//Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
