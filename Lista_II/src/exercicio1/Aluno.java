package exercicio1;

public class Aluno {
	
	String nome;
	int rm;
	double nota1, nota2;
	
	public Aluno(int rm, String nome, double nota1, double nota2) {
		this.rm = rm;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double calcularMedia () {		
		return (nota1 + nota2) / 2;
	}
	
	public String verificarSituacao () {
		if (calcularMedia() >= 6) {
			return "Aprovado";
		} 
		return "Reprovado";
	}
	
	public String getDados () {
		String aux = " ";
		aux += "Nome: " + nome + "\n";
		aux += "Media: " + String.format("%.2f", calcularMedia()) + "\n";
		aux += "Situacao: " + verificarSituacao() + "\n";
		return aux;
	}
	
}
