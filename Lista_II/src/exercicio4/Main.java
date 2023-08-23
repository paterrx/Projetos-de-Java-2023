package exercicio4;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.id = 1090;
		System.out.print("Digite o nome do livro -> ");
		livro.titulo = teclado.nextLine();
		System.out.println();
		System.out.print("Digite o nome do autor do livro -> ");
		livro.autor = teclado.nextLine();
		System.out.println("Deseja pegar o livro emprestado ou devolver? ");
		if (teclado.nextLine().equalsIgnoreCase("emprestado")) {
			livro.emprestarLivro();
		} else {
			livro.devolverLivro();
		}
		
	}

}
