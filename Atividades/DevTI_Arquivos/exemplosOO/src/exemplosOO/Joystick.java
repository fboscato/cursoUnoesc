package exemplosOO;

public class Joystick {

	public static void main(String[] args) {

		String modelo;
		String cor;
		int porcentagemBateria;
		
		 public visualizarInfoJoystick() {
			 System.out.println("Modelo:"+modelo);
			 System.out.println("cor:"+cor);
			 System.out.println("Porcentagem bateria:"+porcentagemBateria);
		 }
		public void conectar() {
			System.out.print("Joystick"+modelo+"está conectado a TV");
		}
		public void recarregar() {
			System.out.print("Joystick"+modelo+"está carregando....");
		}

		

	}

}
