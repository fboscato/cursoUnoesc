package Problemas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Problemas {
	public static void main(String[] args) {
		try {
			int[] arranjo = {10, 20, 30};		
			
			System.out.println("Array:");
//			System.out.println(arranjo[3]); // Exce��o ArrayIndexOutOfBoundsException
			
			List<Integer> numeros = new ArrayList<>();
			numeros.add(10);
			numeros.add(20);
			numeros.add(30);
			System.out.println("\nLista:");
			System.out.println(numeros.get(0));
//			System.out.println(numeros.get(3)); // Exce��o IndexOutOfBoundsException
			
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um n�mero com parte decimal (use ponto): ");
			double numero = ler.nextDouble();	// Exce��o InputMismatchException
			System.out.println(numero);	
			
//			numero = Double.parseDouble("10,25"); // Exce��o NumberFormatException
			
//			System.out.println(10 / 0); // Exce��o ArithmeticException
			
			String frase = null;
			System.out.println(frase.toUpperCase()); // Exce��o NullPointerException
		} catch (ArrayIndexOutOfBoundsException e) {	// Exce��o de acesso a arrays
			System.out.println("Erro de acesso ao array");
		} catch (IndexOutOfBoundsException e) {			// Exce��o de acesso a listas
			System.out.println("Erro de acesso � lista");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Entrada inv�lida");
		} catch (NumberFormatException e) {
			System.out.println("Formato de n�mero inv�lido");
			//System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Erro de divis�o por zero");
		//} catch (NullPointerException e) {
		//	System.out.println("Erro de ponteiro nulo");
		} catch (Exception e) {
		System.out.println("Problema n�o identificado");
		System.out.println(e.getMessage());
	}
}
}