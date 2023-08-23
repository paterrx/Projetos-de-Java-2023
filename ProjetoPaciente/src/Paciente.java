
public class Paciente {
	
	String nomeDoPaciente;
	String CPF;
	double peso;
	double altura;
	
	public double calcularIMC () {
		double IMC;
		IMC = peso / (altura * altura);
		return IMC;
	}
	
	public String verificarPeso() {
		if (calcularIMC() > 26) {
			return "Paciente acima do peso. ";
		}
		return "Paciente com peso comum. ";
	}
	
	public String getDados() {
		String aux = "";
		aux += "Nome --> " + nomeDoPaciente + "\n";
		aux += "CPF --> " + CPF + "\n";
		aux += "Peso (kg) --> " + peso + "\n";
		aux += "Altura (m) --> " + altura + "\n";
		return aux;
	}
	
}
