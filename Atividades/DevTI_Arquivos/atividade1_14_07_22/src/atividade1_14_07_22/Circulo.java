package atividade1_14_07_22;

public class Circulo implements FormaGeometrica {

	private double raio;
	
	
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}


	@Override
	public double calcularArea() {
		return raio * 3.14;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
