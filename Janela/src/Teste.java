import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double nota;
		
//		JOptionPane.showMessageDialog(null, "Feriado");
//		nome = JOptionPane.showInputDialog("Nome");
//		JOptionPane.showMessageDialog(null, "Boa noite, " + nome);
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		JOptionPane.showMessageDialog(null, idade);
	}

}
