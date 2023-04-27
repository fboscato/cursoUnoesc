package Ex5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Principal {
	
		@Test
		public void testarLanceOrdemCrescente() {
		
//	Parte 1 : Cen�rio	
		Usuario joao = new Usuario("Jo�o");
		Usuario jose = new Usuario("Jos�");
		Usuario maria = new Usuario("Maria");
		
		System.out.println("Inicio do Leil�o");
		System.out.println("================");
		
		Leilao leilao = new Leilao("PlayStation 5");
		
		leilao.propoe(new Lance(maria, 2500.0));
		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 4000.0));
		
//  Parte 2 : A��o		
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
//	Parte 3 : Verifica��o
		
		double maiorLanceEsperado = 4000;
		double menorLanceEsperado = 2500;
		
		boolean resultadoMaiorLanceEsperado = (maiorLanceEsperado == avaliador.getMaiorLance());		
		boolean resultadoMenorLanceEsperado = (menorLanceEsperado == avaliador.getMenorLance());		

		System.out.println("Maior lance: R$ " + resultadoMaiorLanceEsperado);
		System.out.println("Menor lance: R$ " + resultadoMenorLanceEsperado);
		
		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());
		
		System.out.println();
		System.out.println("Ordem decrescente");
		System.out.println("================");
		System.out.println("Menor Valor do lance = "+avaliador.getMenorLance());
		System.out.println("Maior Valor do lance = "+avaliador.getMaiorLance());
		
		System.out.println();
		System.out.println("Ordem aleat�ria");
		System.out.println("================");
		System.out.println("1� valor de lance = 3000.0");
		System.out.println("2� Valor do lance = 2500.0");
		System.out.println("3� Valor do lance = 4000.0");
		
		System.out.println();
		System.out.println("Lances com o Mesmo valor");
		System.out.println("================");
		System.out.println("1� valor de lance = 3000.0");
		System.out.println("2� Valor do lance = 3000.0");
		System.out.println("3� Valor do lance = 3000.0");
		
		System.out.println();
		System.out.println("Apenas um lance da lista");
		System.out.println("================");
		System.out.println("1� valor de lance = 3000.0");
	}
}
