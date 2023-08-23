package exercicio6;

public class Bilhete {
	int id;
	String nomeUsuario;
	double saldo;
	static double tarifa = 4.4;
	
	public double getSaldo () {
		return saldo;
	}
	
	public void carregar (double valor) {
		saldo += valor;
	}
	
	public void passarCatraca () {
		saldo -= tarifa;
	}
	
	public static void aumentarValor (double porcentagem) {
		tarifa += tarifa * porcentagem / 100;
	}
	
}
