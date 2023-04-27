package atividadeFinal30_07_22;

import java.util.ArrayList;

public class Venda {	

	private double vlrTotal = 0;
	
	ArrayList <Produto> listaVendas = new ArrayList<Produto>();
	
	public Venda() {
		super();
		this.vlrTotal = vlrTotal;
		this.listaVendas = listaVendas;
	}

	public double getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public ArrayList<Produto> getListaVendas() {
		return listaVendas;
	}

	public void setListaVendas(ArrayList<Produto> listaVendas) {
		this.listaVendas = listaVendas;
	}
		
	public void adicionarItemVenda(Produto prod) {
		this.vlrTotal += prod.preco;
		listaVendas.add(prod);
		
	}
	
	public void visualizarVenda() {
		for (Produto p: listaVendas) {
			System.out.println(p.toString());
		}
		
	}
	
	public void concluirVenda() {
		System.out.println("Valor total da compra é de R$"+this.vlrTotal);			
	}

}
