package projetoProduto;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto(1, "arroz", 25.50));
		lista.add(new Produto(2, "feijoada", 60));
		lista.add(new Produto(3, "caipirinha", 15));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		for (Produto p : lista) {
			System.out.println(p);
		}
	}

}
