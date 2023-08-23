package exercicio3;

import java.util.Scanner;
import filas.FilaString;

public class Consultorio {
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaString filaPacientes = new FilaString();
		filaPacientes.init();
		
		int opcao;
		do {
			System.out.println(" 0 - Encerrar");
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender 1 aluno");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				if (filaPacientes.isEmpty())
					System.out.println("Atendimento encerrado! ");
				else {
					System.out.println("Proximo aluno para atendimento: " + " " + filaPacientes.dequeue());
					opcao = -1;
				}
				break;
			case 1:
				le.nextLine();
				System.out.print("Informe nome: ");
				String nome = le.nextLine();
				filaPacientes.enqueue(nome);
				break;
			case 2:
				if (filaPacientes.isEmpty())
					System.out.println("Nao ha pacientes para serem atendidos. ");
				else
					System.out.println("Proximo paciente para atendimento: " + filaPacientes.dequeue());
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while (opcao!=0);
		
		
		le.close();
	}
	
}
