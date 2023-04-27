package atividadeFinal30_07_22;

import java.util.Scanner;

public class Pagamento {

	private int tipoPagamento;

	Scanner entrada = new Scanner(System.in);

	public void selecionarTipoPagamento(int pagamento) {

		System.out.println("Informe o tipo do pagamento");
		System.out.println("(1) Dinheiro");
		System.out.println("(2) Cheque");
		System.out.println("(3) Cartão");
		tipoPagamento = entrada.nextInt();
	}

	public void realizarPagamento() {

		switch (tipoPagamento) {
		case 1:
			System.out.println("Pagamento em Dinheiro realizado");
		break;
		case 2:
			System.out.println("Pagamento em Cheque realizado");
			break;
		case 3:
			System.out.println("Pagamento em Cartão realizado");
		break;
		
		}
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
