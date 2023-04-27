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
//			System.out.println(arranjo[3]); // Exceção ArrayIndexOutOfBoundsException
			
			List<Integer> numeros = new ArrayList<>();
			numeros.add(10);
			numeros.add(20);
			numeros.add(30);
			System.out.println("\nLista:");
			System.out.println(numeros.get(0));
//			System.out.println(numeros.get(3)); // Exceção IndexOutOfBoundsException
			
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um número com parte decimal (use ponto): ");
			double numero = ler.nextDouble();	// Exceção InputMismatchException
			System.out.println(numero);	
			
//			numero = Double.parseDouble("10,25"); // Exceção NumberFormatException
			
//			System.out.println(10 / 0); // Exceção ArithmeticException
			
			String frase = null;
			System.out.println(frase.toUpperCase()); // Exceção NullPointerException
		} catch (ArrayIndexOutOfBoundsException e) {	// Exceção de acesso a arrays
			System.out.println("Erro de acesso ao array");
		} catch (IndexOutOfBoundsException e) {			// Exceção de acesso a listas
			System.out.println("Erro de acesso à lista");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida");
		} catch (NumberFormatException e) {
			System.out.println("Formato de número inválido");
			//System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero");
		//} catch (NullPointerException e) {
		//	System.out.println("Erro de ponteiro nulo");
		} catch (Exception e) {
		System.out.println("Problema não identificado");
		System.out.println(e.getMessage());
	}
}
}