package Principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Dominio.Avaliador;
import Dominio.Lance;
import Dominio.Leilao;
import Dominio.Usuario;

public class TestaLeilao {
	
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
		
//		boolean resultadoMaiorLanceEsperado = (maiorLanceEsperado == avaliador.getMaiorLance());		
//		boolean resultadoMenorLanceEsperado = (menorLanceEsperado == avaliador.getMenorLance());		

//		System.out.println("Maior lance: R$ " + resultadoMaiorLanceEsperado);
//		System.out.println("Menor lance: R$ " + resultadoMenorLanceEsperado);
		
		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());
	}
}
