package Produto;

public class Produto {
	private int id;
	private String nomeDoProduto;
	private double preco;
	private int qtd;
	
	public Produto(int id, String nomeDoProduto, double preco, int qtd) {
		this.id = id;
		this.nomeDoProduto = nomeDoProduto;
		this.preco = preco;
		this.qtd = qtd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
