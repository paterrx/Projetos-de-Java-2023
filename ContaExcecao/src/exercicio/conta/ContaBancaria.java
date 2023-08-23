package exercicio.conta;

import exercicio.excecao.ContaExcecao;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getSaldoLimite() {
		return saldo + limite;
	}
	
	public boolean sacar(double valor) throws ContaExcecao {
		if (valor >= 500 || getSaldoLimite() <= 0) {
			throw new ContaExcecao("Valor de saque nao permitido. ");
		}
		saldo -= valor;
		return true;
	}
	
	public boolean depositar(double valor) throws ContaExcecao {
		if (valor > 1000) {
			throw new ContaExcecao("Valor de deposito invalido, somente valores abaixo de 1000. ");
		}
		if (valor <= 0) {
			throw new ContaExcecao("Valor de deposito invalido, valores devem ser maiores que 0. ");
		}
		saldo += valor;
		return true;
	}
}
