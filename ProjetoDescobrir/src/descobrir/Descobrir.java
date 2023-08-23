package descobrir;

import java.util.Random;

public class Descobrir {
	private int numeroSecreto;
	private int numeroDeTentativas;
	
	public Descobrir() {
		Random gerador = new Random();
		this.numeroSecreto = gerador.nextInt(1001);
	}
	
	public String chutar(int numero) {
		if  (numeroSecreto == numero) {
			return "Acertou";
		} else {
			numeroDeTentativas++;
			if (numeroSecreto > numero) {
				return "Acima";
			}
			return "Abaixo";
		}
	}
	
	public int getTentativas () {
		return numeroDeTentativas;
	}
	
}
