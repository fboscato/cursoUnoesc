package tipoDados;

public class Conversoes {

	public static void main(String[] args) {
	
		Integer numero1 = 123;
		String valor1 = numero1.toString();
		System.out.println(valor1);
		
		int numero2 = 456;
		String valor2 = String.valueOf(numero2);
		System.out.println(valor2);
		
		double numero3 = 123.456;
		String valor3 = Double.toString(numero3);
		System.out.println(valor3);
		
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
		String str2 = "123.456";
		double num2 = Double.parseDouble(str2);
		System.out.println(num2);		
		
	}

}
