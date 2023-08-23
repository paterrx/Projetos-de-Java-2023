package main;
import java.util.Scanner;

import descobrir.Descobrir;

public class Main {

	public static void main(String[] args) {
		Descobrir d = new Descobrir();
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Digite um numero -> ");
			numero = sc.nextInt();
			System.out.println();
			
			System.out.println(d.chutar(numero));
			
			
		} while(!d.chutar(numero).equalsIgnoreCase("Acertou"));
		
		System.out.println("Numero de tentativas -> " + d.getTentativas());
		
	}

}
