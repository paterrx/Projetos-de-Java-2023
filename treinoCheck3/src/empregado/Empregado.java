package empregado;

public abstract class Empregado {
	private long matricula;
	private String nome;
	
	public Empregado(long matricula, String nome) {
		super();
		this.setMatricula(matricula);
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Empregado [matricula=" + getMatricula() + ", nome=" + nome + "]";
	}

	public abstract double calcularSalario();

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
}
