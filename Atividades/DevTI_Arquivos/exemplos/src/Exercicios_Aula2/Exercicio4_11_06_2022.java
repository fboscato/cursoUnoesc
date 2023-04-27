package Exercicios_Aula2;

import java.util.Scanner;

public class Exercicio4_11_06_2022 {

		static float raio, resultado;

		public static float volume(float x) {
			float aux;
			aux = (float) ((4/3) * 3.14 * (Math.pow(x,3)));
		    return aux;
		}

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);

			System.out.println("Informe o raio: ");
			raio = ler.nextFloat();

			resultado = volume(raio);
			System.out.println("O volume da esfera é " + resultado);

		}

	}