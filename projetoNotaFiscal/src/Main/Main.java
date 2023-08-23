package Main;

import NotaFiscal.NotaFiscal;
import Produto.Produto;

public class Main {

	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscal("Gabriel");
		Produto produto1 = new Produto(1, "Batata", 10, 5);
		Produto produto2 = new Produto(2, "Cenoura", 5, 10);
		Produto produto3 = new Produto(3, "Beterraba", 3, 7);
		
		notaFiscal.inserir(produto1);
		notaFiscal.inserir(produto2);
		notaFiscal.inserir(produto3);
		
		System.out.println(notaFiscal.getNomeDoCliente() + "\nValor Total: " +
				notaFiscal.calcularNotaFiscal());
	}

}
