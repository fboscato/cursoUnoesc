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
		
//	Parte 1 : Cenário	
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		System.out.println("Inicio do Leilão");
		System.out.println("================");
		
		Leilao leilao = new Leilao("PlayStation 5");
		
		leilao.propoe(new Lance(maria, 2500.0));
		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 4000.0));
		
//  Parte 2 : Ação		
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
//	Parte 3 : Verificação
		
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
