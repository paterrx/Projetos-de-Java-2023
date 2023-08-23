package Forma;

public abstract class Forma {
	private int coordenadaX;
	private int coordenadaY;
	private double raio;
	
	public Forma(int coordenadaX, int coordenadaY, double raio) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.raio = raio;
	}
	
	public abstract double calcularArea ();

	@Override
	public String toString() {
		return "Forma [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", raio=" + raio + "]";
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
