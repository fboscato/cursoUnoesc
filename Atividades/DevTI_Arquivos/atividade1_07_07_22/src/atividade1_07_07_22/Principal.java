package atividade1_07_07_22;

public class Principal {

	public static void main(String[] args) {
		IngressoVip ingressoVip = new IngressoVip();
		
		ingressoVip.setValor(100);
		ingressoVip.setValorAdicional(50);
		
		System.out.println("Valor Ingresso Normal �: "+ingressoVip.getValor());
		System.out.println("Valor Adicional VIP �: "+ingressoVip.getValorAdicional());
		System.out.println(ingressoVip.toString());
	}

}
