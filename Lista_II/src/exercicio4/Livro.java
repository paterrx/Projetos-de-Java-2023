package exercicio4;

public class Livro {
	int id;
	String titulo;
	String autor;
	Boolean disponibilidade = true;
	
	public void emprestarLivro () {
		if (disponibilidade) {
			disponibilidade = false;
		}
	}
	
	public void devolverLivro () {
		if (!disponibilidade) {
			disponibilidade = true;
		}
	}
	
	public String getDados () {
		return id + "\n" + titulo + "\n" + autor + "\n" + disponibilidade;
	}
	
}
