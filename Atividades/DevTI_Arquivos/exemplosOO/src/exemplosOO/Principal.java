package exemplosOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Joystick js = new Joystick();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o modelo do joystick:");
		js.modelo = ler.nextLine();
		System.out.println("Digite a cor do joystick:");
		js.cor = ler.nextLine();
		System.out.println("Digite a porcentagem da bateria:");
		js.modelo = ler.nextInt();
		
		js.visualizarInfoJoystick();
		js.conectar();
		js.recarregar();
		
	}

}
