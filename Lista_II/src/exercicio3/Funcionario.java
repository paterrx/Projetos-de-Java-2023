package exercicio3;

import java.util.Scanner;

public class Funcionario {
	
	String nome;
	int id;
	double salarioBruto;
	Scanner teclado = new Scanner(System.in);
	
	public Funcionario (String nome, int id, double salarioBruto) {
		this.nome = nome;
		this.id = id;
		this.salarioBruto = salarioBruto;
	}
	
	public String calcularSalarioLiquido () {
		System.out.print("Digite o imposto descontado (porcentagem) -> ");
		double imposto = teclado.nextDouble();
		System.out.println();
		imposto = salarioBruto - salarioBruto * imposto / 100;
		return String.format("%.2f", imposto);
	}
	
	public String aumentarSalario () {
		System.out.print("Digite a porcentagem que deseja aumentar dos salarios (somente os numeros) -> ");
		double aumento = teclado.nextDouble();
		System.out.println();
		aumento = aumento / 100 + 1;
		salarioBruto = salarioBruto * aumento;
		return String.format("%.2f", salarioBruto);
	}
	
}
