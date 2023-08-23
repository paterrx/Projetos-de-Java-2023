package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno[] aluno = new Aluno[2];
		int rm;
		String nome;
		double nota1, nota2;
		
		for (int i = 0; i < aluno.length ; i++) {
			
			System.out.print("Nome: ");
			nome = teclado.nextLine();
			System.out.println();
			System.out.println("RM: ");
			rm = teclado.nextInt();
			System.out.println();
			System.out.print("Nota 1: ");
			nota1 = teclado.nextDouble();
			System.out.println();
			System.out.print("Nota 2: ");
			nota2 = teclado.nextDouble();
			System.out.println();
			aluno[i] = new Aluno(rm, nome, nota1, nota2);
			System.out.println();
			
		}
		
		for (int i = 0 ; i < aluno.length ; i++) {
			System.out.println(aluno[i].getDados());
		}
		
		classificar(aluno);
		
		for (Aluno a : aluno) {
			System.out.println(a.getDados());
		}
		
		teclado.close();
 	}
	
	public static void classificar (Aluno [] aluno) {
		Aluno aux;
		for (int j = 0 ; j < aluno.length ; j++) {
			for (int i = 0 ; i < aluno.length - 1 ; i++) {
				if (aluno[i].calcularMedia() < aluno[i+1].calcularMedia()) {
					aux = aluno[i];
					aluno[i] = aluno[i+1];
					aluno[i+1] = aluno[i];
				}
			}
		}
	}

}
