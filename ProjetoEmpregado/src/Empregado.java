
public abstract class Empregado {
	long matricula;
	String nome;
	
	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Matricula: " + matricula + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
	}
	
	public abstract double calcularSalario();
	
}
