package atividade1_01_07_22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		String retorno;
		
		pessoa.setNome("Pedro");
		pessoa.setAnoNasc(2000);
		pessoa.setAltura(1.75);
		//op��o 1
		pessoa.exibirPessoa();
		//op��o 2
		retorno = pessoa.toString();
		System.out.println(retorno);
		
		pessoa.calcularIdade();

	}

}