
public class Ex2 {

	public static void main(String[] args) {
		try {
			int[] numeros = { 10, 0 };
			System.out.println(numeros[2] / numeros[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de runtime identificado");
			System.out.println(e.getMessage());
		}
			catch (Exception e) {
			System.out.println("Erro capturado!!!");
			System.out.println(e.getMessage());
		} 
	}
}
