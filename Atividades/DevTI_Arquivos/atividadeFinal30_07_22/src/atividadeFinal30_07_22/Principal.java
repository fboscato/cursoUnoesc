package atividadeFinal30_07_22;

public class Principal {

	public static void main(String[] args) {
			
		Produto produto1 = new Produto("Biscoito",4f,5);
		Produto produto2 = new Produto("Leite",6f,12);
		Produto produto3 = new Produto("Refrigerante",12f,18);
		Produto produto4 = new Produto("Pão",8f,15);
		Produto produto5 = new Produto("Banana",3f,10);
		Pagamento pagamento = new Pagamento();
		Venda venda = new Venda();
		
		System.out.println(produto1.toString());
		System.out.println("-----------------");
		System.out.println(produto2.toString());
		System.out.println("-----------------");
		System.out.println(produto3.toString());
		System.out.println("-----------------");
		System.out.println(produto4.toString());
		System.out.println("-----------------");
		System.out.println(produto5.toString());
		System.out.println("");
		System.out.println("___PEDIDO DE VENDA___");
		venda.adicionarItemVenda(produto3);
		venda.adicionarItemVenda(produto4);
		System.out.println("");
		venda.visualizarVenda();
		System.out.println("");
		venda.concluirVenda();
		System.out.println("");
		pagamento.selecionarTipoPagamento(0);
		pagamento.realizarPagamento();
		
		
	}
}
