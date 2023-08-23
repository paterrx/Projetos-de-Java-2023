package Cilindro;

import Forma.Forma;
import Volume.Volume;

public class Cilindro extends Forma implements Volume{
	private double altura;
	
	public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
		super(coordenadaX, coordenadaY, raio);
		this.setAltura(altura);
	}

	public double calcularVolume() {
		return Math.PI * raio * raio* altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return 2 * Math.PI * raio * (raio + altura);
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY
				+ ", raio=" + raio + "]";
	}
	
}
