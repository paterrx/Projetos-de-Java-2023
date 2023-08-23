
public class EmpregadoComissionado extends Empregado{
	double totalDeVendas;
	double comissao;
	
	public EmpregadoComissionado(long matricula, String nome, int totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}
	
}
