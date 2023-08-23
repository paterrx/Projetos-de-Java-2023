package Circulo;

import Forma.Forma;

public class Circulo extends Forma{

	public Circulo(int coordenadaX, int coordenadaY, double raio) {
		super(coordenadaX, coordenadaY, raio);
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio*raio;
	}
	
	@Override
	public String toString() {
		return "Circulo [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", raio=" + raio + "]";
	}
	
}
