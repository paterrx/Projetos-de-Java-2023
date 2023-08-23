package NotaFiscal;

import java.util.ArrayList;
import java.util.List;

import Produto.Produto;

public class NotaFiscal {
	private String nomeDoCliente;
	private List <Produto> lista = new ArrayList<>();
	
	public NotaFiscal(String nomeDoCliente) {
		super();
		this.nomeDoCliente = nomeDoCliente;
	}

	public void inserir(Produto produto) {
		lista.add(produto);
	}
	
	public double calcularNotaFiscal() {
		double precoTotal = 0;
		
		for (int i = 0; i < lista.size() ; i++) {
			precoTotal += lista.get(i).getPreco() * lista.get(i).getQtd();
		}
		
		return precoTotal;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	
}
