import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Paciente p = new Paciente();
		
		System.out.print("Digite o seu nome -> ");
		p.nomeDoPaciente = teclado.nextLine();
		System.out.println();
		
		System.out.print("Digite o seu CPF -> ");
		p.CPF = teclado.nextLine();
		System.out.println();
		
		System.out.print("Digite o seu peso -> ");
		p.peso = teclado.nextDouble();
		System.out.println();
		
		System.out.print("Digite a sua altura -> ");
		p.altura = teclado.nextDouble();
		System.out.println();
		
		System.out.println(p.getDados());
		System.out.println();
		
		System.out.println("Seu IMC e de -> " + p.calcularIMC());
		System.out.println();
		
		System.out.println(p.verificarPeso());
		System.out.println();
		
		teclado.close();
	}

}
