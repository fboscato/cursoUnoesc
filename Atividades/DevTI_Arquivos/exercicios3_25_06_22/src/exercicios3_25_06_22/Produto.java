package exercicios3_25_06_22;

public class Produto {
	
	String nome;
	double preco, ajuste, peso;
	
	
	
	public Produto(String nome, double preco, double peso) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}



	void aumentarPreco() {
		if (preco < 50) {
			ajuste =  (preco * 0.2);
			preco += ajuste;
			System.out.println("O ajuste é de 20%, o valor é de: "+ajuste+" o preço final ficou: "+preco);
		}else if (preco > 50) {
			ajuste =  (preco * 0.1);
			preco += ajuste;
			System.out.println("O ajuste é de 10%, o valor é de: "+ajuste+" o preço final ficou: "+preco);
		}
	}

}

