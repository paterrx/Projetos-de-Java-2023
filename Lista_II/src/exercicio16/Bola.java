package exercicio16;

public class Bola {
	String cor;
	double raio;
	
	public Bola(String cor, double raio) {
		this.cor = cor;
		this.raio = raio;
	}

	public Bola maiorBola(Bola bola2, Bola bola3) {
		if (raio > bola2.raio && raio > bola3.raio) {
			return this;
		} else if (bola2.raio > raio && bola2.raio > bola3.raio) {
			return bola2;
		}
		return bola3;
	}

	public String retornarDados() {
		return cor + "\n" + raio;
	}
	
}
