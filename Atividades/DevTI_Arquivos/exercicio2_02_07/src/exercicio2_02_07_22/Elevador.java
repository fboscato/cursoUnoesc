package exercicio2_02_07_22;

public class Elevador {

	// variaveis
	private int andarAtual;
	private int andares;
	private int capElevador;
	private int pessoasElevador;
	private int terreo;

	// construtores

	public Elevador(int andarAtual, int andares, int capElevador, int pessoasElevador) {
		super();
		this.andarAtual = andarAtual = 6;
		this.andares = andares = 10;
		this.capElevador = capElevador = 8;
		this.pessoasElevador = pessoasElevador = 2;
	}

	// metodos

	public void inicializa(int andares, int capElevador) {
		this.andares = andares;
		this.capElevador = capElevador;
		System.out.println("Capacidade do elevador:" + this.capElevador);
		System.out.println("Total de andares do prédio " + this.andares);
	}

	public void entra() {
		if (this.pessoasElevador < this.capElevador) {
			System.out.println("Haviam " + this.pessoasElevador + " pessoas no elevador ");
			pessoasElevador += 1;
			System.out.println("e agora há " + this.pessoasElevador + " pessoas.");

		} else {
			System.out.println("Impossível entrar, elevador com capacidade máxima atingida.");

		}
	}

	public void sai() {
		if (this.pessoasElevador > 1) {
			System.out.println("Haviam " + this.pessoasElevador + " pessoas no elevador ");
			pessoasElevador -= 1;
			System.out.println("e agora há " + this.pessoasElevador + " pessoas.");

		} else {
			System.out.println("Elevador sem pessoas no momento.");

		}

	}

	public void sobe() {
		if (andarAtual < andares) {
			System.out.println("O elevador estava no andar " + this.andarAtual);
			andarAtual += 1;
			System.out.println("Após subir o andar atual do elevador é o " + this.andarAtual);

		} else {
			System.out.println("Impossivel subir, elevador já está no último andar.");
		}
	}

	public void desce() {
		if (andarAtual != terreo) {
			System.out.println("O elevador estava no andar " + this.andarAtual);
			andarAtual -= 1;
			System.out.println("Após descer o andar atual do elevador é o " + this.andarAtual);

		} else {
			System.out.println("Impossivel descer, elevador já está no térreo.");
		}

	}
}
