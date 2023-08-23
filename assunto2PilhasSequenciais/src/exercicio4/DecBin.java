package exercicio4;

import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		Scanner teclado = new Scanner(System.in);
		
		int decimal, resto;
		
		System.out.println("Informe valor decimal: ");
		decimal = teclado.nextInt();
		while (decimal != 0) {
			resto = decimal % 2;
			
		}
		
		teclado.close();
	}

}
