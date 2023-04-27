package atividade2_01_07_22;

public class Principal {

	public static void main(String[] args) {
		Controle controle = new Controle();
		
		controle.aumentarVolume();
		controle.diminuirVolume();
		
		controle.aumentarCanal();
		controle.diminuirCanal();
		
		controle.escolherCanal(10);
		controle.infoTv();

	}

}
