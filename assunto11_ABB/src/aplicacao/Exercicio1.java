package aplicacao;

import arvores.ABBint;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		ABBint abb = new ABBint();
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrando o programa. ");
				break;
			case 1:
				System.out.println("Informe o valor: ");
				int info = teclado.nextInt();
				abb.root = abb.inserir(abb.root, info);
			case 2:
				System.out.println("Apresentando os valores: ");
				abb.listaEmOrdem(abb.root);
				System.out.println();
				break;
			default:
				
			}
			
		} while (true);
	}
}
