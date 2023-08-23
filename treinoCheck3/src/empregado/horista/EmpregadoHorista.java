package empregado.horista;

import empregado.Empregado;

public class EmpregadoHorista extends Empregado{
	private int totalDeHorasTrabalhadas;
	private double valorDaHoraTrabalhada;
	
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	@Override
	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
	}
	
}
