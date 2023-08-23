package empregado.comissionado;

import empregado.Empregado;

public class EmpregadoComissionado extends Empregado{
	private double totalDeVendas;
	private double comissao;
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
	
	public double calcularSalario () {
		return totalDeVendas * comissao / 100;
	}
	
}
