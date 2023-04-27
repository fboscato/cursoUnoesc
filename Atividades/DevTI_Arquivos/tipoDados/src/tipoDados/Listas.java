package tipoDados;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {

		int n1 = 10, n2 = 20, n3 = 30;

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(n1);
		numeros.add(n2);
		numeros.add(n3);

		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		System.out.println(numeros.get(2));
		
		for (Integer numero : numeros)
			System.out.println(numero);
		System.out.println(numeros);
	}

}
