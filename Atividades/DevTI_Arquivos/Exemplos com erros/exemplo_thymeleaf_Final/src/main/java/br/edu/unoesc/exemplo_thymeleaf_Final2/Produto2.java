package br.edu.unoesc.exemplo_thymeleaf_Final2;

import java.math.BigDecimal;



public class Produto2 {

		private String nome;
		private Integer quantidade;
		private BigDecimal valor;
		
		public Produto2() {}
		
		public Produto2(String nome, Integer quantidade, BigDecimal valor) {
			super();
			this.nome = nome;
			this.quantidade = quantidade;
			this.valor = valor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		@Override
		public String toString() {
			return "Produto2 [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
		}
		
		
		
		
}
