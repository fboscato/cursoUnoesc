package exercicio1_09_07_22;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
			
	public double addAumento (double valor) {
		this.salario = this.salario + valor;
		return this.salario;
	}
	
	public double adicionalBonus(double valor) {
		return this.salario + 2 * valor;
	}
	
	public double ganhoAnual() {
		double salarioAnual = this.salario * 12;
		return salarioAnual;
	}
	
	public void exibirDados() {
		System.out.println("O valor do salário é: "+String.format("R$%.2f",salario));
		System.out.println("O valor do aumento é: "+String.format("R$%.2f",addAumento(this.salario)));
	}

}
