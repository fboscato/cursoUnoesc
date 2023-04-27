package heranca;

public class Principal {

	public static void main(String[] args) {
		JogoTabuleiro tabuleiro = new JogoTabuleiro();
		JogoCartas cartas = new JogoCartas();
		JogoDados dados = new JogoDados();
		
		tabuleiro.setNome("Catan");
		tabuleiro.setDistribuidora("Devir");
		tabuleiro.setNrJogadores(4);
		tabuleiro.setFaixaEtaria(12);
		tabuleiro.setTamanhoTabuleiro("30x40");
		tabuleiro.setQuantPecas(30);
		
		
		tabuleiro.infoJogo();
		tabuleiro.setupTabuleiro();
		tabuleiro.jogar();
		
		cartas.comprarCarta();
		cartas.descartarCarta();
		
		dados.arremessarDado();
				

	}

}
