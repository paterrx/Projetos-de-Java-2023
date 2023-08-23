package exercicio8;

import java.util.Random;

public class Cartao {
	long numero;
	String bandeira;
	double limite;
	double saldo;
	
	public void gerarNumero () {
		Random gerador = new Random();
		
		numero = gerador.nextLong(1000, 9999);
		
	}
	
}
