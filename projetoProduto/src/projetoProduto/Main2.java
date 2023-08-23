package projetoProduto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Main2 {

	public static void main(String[] args) {
		int id;
		String nome;
		double preco;
		
		try {
			id = parseInt(showInputDialog("ID"));
			nome = showInputDialog("Nome");
			preco = parseDouble(showInputDialog("Preco"));
			Produto p = new Produto(id, nome, preco);
		} catch(NumberFormatException e) {
			showMessageDialog(null, "Voce deve digitar um numero\n" + "Erro: " + e);
		} catch (Exception e) {
			showMessageDialog(null, "Erro inesperado.\n" + "Erro: " + e);
		}
	}

}
