package Cilindro;

import Forma.Forma;
import Volume.Volume;

public class Cilindro extends Forma implements Volume{
	private double altura;

	public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
		super(coordenadaX, coordenadaY, raio);
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return 2 * Math.PI * getRaio() * (getRaio() + altura);
	}
	
	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", coordenadaX=" + getCoordenadaX() + ", coordenadaY=" + getCoordenadaY()
				+ ", raio=" + getRaio() + "]";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * getRaio() * getRaio()* altura;
	}
	
}
