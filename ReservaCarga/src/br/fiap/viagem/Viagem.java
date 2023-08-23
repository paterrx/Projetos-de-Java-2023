package br.fiap.viagem;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import br.fiap.carga.Carga;

public class Viagem {
	private double capacidade;
	int index;
	Carga carga[];

	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];
	}
	
	public boolean reservar(Carga carga) {
		if (permitidoReservar(carga.getPeso())) {			
			this.carga[index++] = carga;
			return true;
		} 
		return false;
	}
	
	public double capacidadeReservada() {
		double total = 0;
		for (int i = 0 ; i < index ; i++) {
			total += carga[i].getPeso();
		}
		return total;
	}
	
	public boolean permitidoReservar(double peso) {
		if (index < carga.length && peso + capacidadeReservada() <= capacidade) {
			return true;
		}
		return false;
	}
	
	public String getDados () {
		String aux = "";
		for (int i = 0 ; i < index ; i++) {
			aux += carga[i].getDados() + "\n";
		}
		return aux;
		
	}

	public String getDados(int posicao) {
		return carga[posicao].getDados();
	}
	
	public int pesquisar(int cnpj) {
		int posicao = -1;
		for (int i = 0 ; i < index ; i++) {
			if (carga[i].getCliente().getCnpj() == cnpj) {
				posicao = i;
			}
		}
		return posicao; 
	}
	
	public boolean cancelar(int posicao) {
		carga[posicao] = carga[index-1];
		index--;
		return true;
	}
	
}
