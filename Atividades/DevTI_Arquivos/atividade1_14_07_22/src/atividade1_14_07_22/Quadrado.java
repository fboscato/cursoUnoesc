package atividade1_14_07_22;

public class Quadrado implements FormaGeometrica{

	private double lado;
	
	
	
	public Quadrado(double lado) {
		super();
		this.setLado(lado);
	}


	@Override
	public double calcularArea() {
		return lado * lado;
	}



	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

}
