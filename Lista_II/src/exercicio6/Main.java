package exercicio6;

import java.util.Random;

public class Main {

	
	public static void main(String[] args) {
		Bilhete b1 = new  Bilhete ();
		Random gerador = new Random();
		b1.id = gerador.nextInt(50000);
		b1.nomeUsuario = "Selmini Jr.";
		
		System.out.println("Tarifa = R$ " + Bilhete.tarifa);
		System.out.println();
		
		b1.carregar(50);
		b1.passarCatraca();
		b1.passarCatraca();
		
		System.out.println("Saldo = R$ " + b1.getSaldo());
		System.out.println();
		
		Bilhete.aumentarValor(20);
		b1.passarCatraca();
		b1.passarCatraca();
		
		System.out.println("Saldo = R$ " + b1.getSaldo());
		System.out.println();
	}

}
