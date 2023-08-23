package exercicio1;

import java.util.Scanner;

import filas.FIlaInt;

class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FIlaInt fila = new FIlaInt();
		fila.init();
		
		System.out.println("Informe um valor positivo. (Negativo para encerrar)");
		int valor = teclado.nextInt();
		System.out.println();
		while (valor >= 0) {
			fila.enqueue(valor);
			System.out.println("Informe um valor positivo. (Negativo para encerrar)");
			valor = teclado.nextInt();
			System.out.println();
		}
		
		while (!fila.isEmpty()) {
			System.out.println("Valor retirado da fila: " + fila.dequeue());
			System.out.println();
		}
 		
		teclado.close();
	}

}
