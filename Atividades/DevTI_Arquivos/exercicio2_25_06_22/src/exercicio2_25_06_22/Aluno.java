package exercicio2_25_06_22;

public class Aluno {

	private String nome;
	private int idade;
	private double media;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void calculaMedia(double n1, double n2, double n3) {
		this.media = (n1 + n2 + n3) / 3;
		System.out.println("A média de "+nome+" é "+media);
	}

	public void verificarAprovacao(){
		if (this.media < 5) { 
		System.out.println("Reprovado!"); }
		else if (this.media < 7) 
		{
		System.out.println("Em exame!"); }
		else { 
		System.out.println("Aprovado!"); }		
		}
}
