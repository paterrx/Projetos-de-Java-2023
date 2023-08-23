package exercicio3;

import java.util.Scanner;

import filas.FilaInt;

public class AtendeAlunos {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt filaAlunos = new FilaInt();
		filaAlunos.init();
		
		int opcao, rm;
		do {
			System.out.println(" 0 - Encerrar");
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender 1 aluno");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				if (filaAlunos.isEmpty())
					System.out.println("Atendimento encerrado! ");
				else {
					System.out.println("Proximo aluno para atendimento: " + " " + filaAlunos.dequeue());
					opcao = -1;
				}
				break;
			case 1:
				System.out.print("Informe RM: ");
				rm = le.nextInt();
				filaAlunos.enqueue(rm);
				break;
			case 2:
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while (opcao!=0);
		
		
		le.close();

	}

}
