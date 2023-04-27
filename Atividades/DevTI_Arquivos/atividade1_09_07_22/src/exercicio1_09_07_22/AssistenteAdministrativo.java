package exercicio1_09_07_22;

public class AssistenteAdministrativo extends Assistente {
	
	public AssistenteAdministrativo(String nome, double salario, int matricula) {
		super(nome, salario, matricula);
		
	}

	public double addNoturno (double noturno) {
		this.salario = this.salario + noturno;
		return this.salario;
	}

	@Override
	public String toString() {
		return "[Assistente Administrativo]\nNome = " + nome +" - Matricula = "+matricula;
	}

}
