import javax.swing.JOptionPane;

public class ExemploPropagacao {
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Informe uma string");
		try {
			String reversa = inverter(texto);
			System.out.println("String normal: " + texto);
			System.out.println("String invertida: " + reversa);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String inverter(String str) throws NullPointerException, IllegalArgumentException {
		if (str == null) {
			throw new NullPointerException("Exce��o: Valor nulo!");
		}
		if (str.length() == 0) {
			throw new IllegalArgumentException("Exce��o: String vazia");
		}
		String inversa = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			inversa += str.charAt(i);
		}
		return inversa;
	}
}