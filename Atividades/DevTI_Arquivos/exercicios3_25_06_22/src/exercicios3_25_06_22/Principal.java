package exercicios3_25_06_22;

import exercicios3_25_06_22.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Produto pro1 = new Produto("Goiabinha", 21, 23);
		Produto pro2 = new Produto("Melância", 45, 78);
		Produto pro3 = new Produto("Banana", 55, 49);
		Produto pro4 = new Produto("Ameixa", 89, 15);
		Produto pro5 = new Produto("Maçã", 67, 25);
		
		pro1.aumentarPreco();
		pro2.aumentarPreco();
		pro3.aumentarPreco();
		pro4.aumentarPreco();
		pro5.aumentarPreco();
		}
				
	}
