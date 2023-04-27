package ExemplosUteis;

public class ProcedimentoComParametros {

	static float num1, num2, resposta;
	public static void soma(float x, float y) {
		resposta = x + y;
	}
	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		soma(num1, num2);
		System.out.println(resposta);
	}

}
