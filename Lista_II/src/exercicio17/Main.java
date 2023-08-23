package exercicio17;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random gerador = new Random();
		Ponto [] ponto = new Ponto[gerador.nextInt(10)+1];
		Ponto origem = new Ponto(0,0);
		
		for (int i = 0 ; i < ponto.length ; i++) {
			ponto[i] = new Ponto(gerador.nextInt(10) , gerador.nextInt(10));
			System.out.println(ponto[i].getDados());
			System.out.println("Distancia = " + ponto[i].calcularDistancia(origem));
			System.out.println();
		}
		
		Ponto aux = maisProximo (ponto, origem);
		System.out.println("Ponto mais proximo: " + aux.getDados());
	}
	
	public static Ponto maisProximo (Ponto [] ponto, Ponto origem) {
		double auxDistancia = Double.MAX_VALUE;
		Ponto auxPonto = null;
		double distancia;
		for (Ponto p : ponto) {
			distancia = p.calcularDistancia(origem);
			if (distancia < auxDistancia) {
				auxDistancia = distancia;
				auxPonto = p;
			}
		}
		return auxPonto;
	}

}
