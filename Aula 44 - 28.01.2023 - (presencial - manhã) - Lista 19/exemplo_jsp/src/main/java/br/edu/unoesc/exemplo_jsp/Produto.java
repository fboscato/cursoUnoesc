package br.edu.unoesc.exemplo_jsp;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
		public Produto(String string, int i, BigDecimal bigDecimal) {
			// TODO Auto-generated constructor stub
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
			private String nome;
			private Integer quantidade;
			private BigDecimal valor;
		}
