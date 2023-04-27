package exercicio1_09_07_22;

public class Assistente extends Funcionario {
	
	protected int matricula;
	
	public Assistente(String nome, double salario, int i) {
		super(nome, salario);
		this.matricula = i;
	}
	
	@Override
	public double adicionalBonus(double valor) {
		return valor;
		
	}

	@Override
	public String toString() {
		return "Assistente matricula = " + matricula +"Nome = "+nome;
	}
	
	
}
