package exercicio17;

public class Ponto {
	int x;
	int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDados () {
		return "(" + x + "," + y + ")";
	}
	
	public double calcularDistancia (Ponto p) {
		double distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
		return distancia;
	}
	
}
