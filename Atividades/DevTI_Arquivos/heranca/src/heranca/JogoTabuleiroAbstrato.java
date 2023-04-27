package heranca;

public class JogoTabuleiroAbstrato extends JogoAbstrato{

	
	private String tamanhoTabuleiro;
	private int quantPecas;
	
	@Override
	public void infoJogo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Distribuidora: " + this.getDistribuidora());
		System.out.println("N�mero Jogadores: " + this.getNrJogadores());
		System.out.println("Faixa Et�ria: " + this.getFaixaEtaria()+" anos");
		System.out.println("Tamanho tabuleiro: " + this.getTamanhoTabuleiro());
		System.out.println("Quantidade de pe�as: "+this.getQuantPecas());
	}

	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}

	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}

	public int getQuantPecas() {
		return quantPecas;
	}

	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}

}
