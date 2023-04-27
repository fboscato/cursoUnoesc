package Ex1;

public class Principal {

		public static void main(String[] args) {
			Calculadora calc = new Calculadora();
			int soma = 0;
			int sub = 0;
			int div = 0;
			int mult = 0;
			
			soma = calc.somar(10, 10);
			System.out.println(soma);
			
			sub = calc.subtrair(10, 10);
			System.out.println(sub);
			
			div = calc.dividir(10, 10);
			System.out.println(div);
			
			mult = calc.multiplicar(10,10);
			System.out.println(mult);
		}
	}
