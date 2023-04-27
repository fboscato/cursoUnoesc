package exercicio1_09_07_22;

public class AssistenteTecnico extends Assistente {

	public AssistenteTecnico(String nome, double salario, int matricula) {
		super(nome, salario, matricula);
	}

	public double bonusSalarial(double bonus) {
		this.salario = this.salario + bonus;
		return this.salario;
	}

	@Override
	public String toString() {
		return "[Assistente Técnico] \nNome = " + nome +" - Matricula = "+matricula;
	}
	
}
