package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double aumento, desconto;
		int id;
		String nome;
		double salario;
		
		System.out.print("Nome -> ");
		nome = teclado.nextLine();
		System.out.println();
		System.out.print("ID -> ");
		id = teclado.nextInt();
		System.out.println();
		System.out.print("Salario bruto -> R$");
		salario = teclado.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, id, salario);
		
		System.out.println("Nome -> " + funcionario.nome);
		System.out.println("ID -> " + funcionario.id);
		System.out.println();
		System.out.println("Salario bruto -> " + funcionario.salarioBruto);
		System.out.println();
		System.out.println("Salario bruto pos aumento -> " + funcionario.aumentarSalario());
		System.out.println();
		System.out.println("Salario liquido pos aumento -> " + funcionario.calcularSalarioLiquido());
		System.out.println();
		teclado.close();
	}

}
