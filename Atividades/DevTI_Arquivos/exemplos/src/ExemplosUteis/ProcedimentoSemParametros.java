package ExemplosUteis;

public class ProcedimentoSemParametros {

	static float num1, num2, resposta;
	public static void soma() {
		resposta = num1 + num2;
	}
	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		soma();
		System.out.println(resposta);
	}

}
