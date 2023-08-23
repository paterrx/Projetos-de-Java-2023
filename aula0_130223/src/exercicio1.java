import java.util.Scanner;

public class exercicio1 {

	static Scanner teclado = new Scanner(System.in);;

	public static void main(String[] args) {
		int alunos;
		System.out.println("Digite a quantidade de alunos verificados. ");
		alunos = teclado.nextInt();
		System.out.println();
		
		int [] RMS = new int [alunos];
		double [] Notas1 = new double [alunos];
		double [] Notas2 = new double [alunos];
		pegarRMeNotas(alunos, RMS, Notas1, Notas2);
		double [] Medias = calcularMedias(alunos, Notas1, Notas2);
		imprimirTabela(alunos, Notas2, Medias);
		calcularAprovadosEimprimir(alunos, RMS, Medias);
	}
	
	public static void pegarRMeNotas (int alunos, int [] RMS, double [] Notas1, double [] Notas2) {
		for (int i = 0 ; i < alunos ; i++) {
			System.out.print("Digite seu RM -> ");
			RMS[i] = teclado.nextInt();
			System.out.println();
			if (RMS[i] < 0) {
				System.out.println("O RM digitado e invalido. ");
				break;
			}
			System.out.print("Digite sua primeira nota -> ");
			Notas1[i] = teclado.nextDouble();
			System.out.println();
			System.out.print("Digite sua segunda nota -> ");
			Notas2[i] = teclado.nextDouble();
			System.out.println();
		}
	}
	
	public static double[] calcularMedias (int alunos, double [] Notas1, double [] Notas2) {
		double [] Medias = new double [alunos];
		for (int i = 0 ; i < alunos ; i++) {
			Medias[i] = (Notas1[i] + Notas2[i]) / 2;
		}
		return Medias;
	}
	
	public static void imprimirTabela (int alunos, double[] notas2, double [] Medias) {
		System.out.println("Tabela Principal: ");
		System.out.println();
		for (int i = 0 ; i < alunos ; i++) {
			System.out.println("RM \t-> " + notas2[i]);
			System.out.println("Media \t-> " + Medias[i]);
			System.out.println();
		}
	}
	
	public static void calcularAprovadosEimprimir (int alunos, int [] RMS, double [] Medias) {
		int [] RMSaprovados = new int [30];
		int contagem = 0;
		for (int i = 0 ; i < alunos ; i++) {
			if (Medias[i] >= 6) {
				RMSaprovados[i] = RMS[i];
				contagem++;
			}
		}
		System.out.println("Tabela de RMS Aprovados. ");
		System.out.println();
		for (int i = 0 ; i < contagem ; i++) {
			System.out.println("RM \t-> " + RMSaprovados[i]);
			System.out.println();
		}
	}

}
