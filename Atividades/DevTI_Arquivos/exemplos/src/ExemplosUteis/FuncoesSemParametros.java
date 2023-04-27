package ExemplosUteis;

public class FuncoesSemParametros {

	static float num1, num2, resposta;
	public static float soma() {
		float aux;
		aux = num1 + num2;
		return aux;
	}
	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		resposta = soma();
		System.out.println(resposta);
	}

}