package br.edu.unoesc.exemplo_thymeleaf_Final;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Produto {

		private String nome;
		private int quantidade;
		private BigDecimal valor;
}
