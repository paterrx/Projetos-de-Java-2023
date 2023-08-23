package br.fiap.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.viagem.Viagem;

public class Util {
	
	private Viagem viagem = new Viagem();
	
	public void menu() {
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opcao invalida");
			} else {
				switch(opcao) {
					case 1:
						reservar();
						break;
					case 2:
						pesquisar();
						break;
					case 3:
						visualizar();
						break;
					case 5:
						cancelar();
						break;
				}
			}
		} while (opcao != 6);
		
	}
	
	private void cancelar() {
		int cnpj = parseInt(showInputDialog("CNPJ"));
		int posicao = viagem.pesquisar(cnpj);
		if (posicao == viagem.pesquisar(cnpj)) { 
			showMessageDialog(null, "Carga nao encontrada. ");
		} else {
			viagem.cancelar(posicao);
		}
	}

	private void pesquisar() {
		int cnpj = parseInt(showInputDialog("CNPJ"));
		int posicao = viagem.pesquisar(cnpj);
		if (posicao == viagem.pesquisar(cnpj)) { 
			showMessageDialog(null, "Carga nao encontrada. ");
		} else {
			showMessageDialog(null, viagem.getDados(posicao));
		}
	}

	private void visualizar() {
		showMessageDialog(null, viagem.getDados());
	}

	private void reservar() {
		int cnpj;
		String destino, nomeCliente;
		
		cnpj = parseInt(showInputDialog("CNPJ"));
		destino = showInputDialog("Destino");
		nomeCliente = showInputDialog("Nome do cliente");
		
		Cliente cliente = new Cliente(cnpj, nomeCliente);
		Carga carga = new Carga(destino, cliente);
		
		if (viagem.reservar(carga)) {
			showMessageDialog(null, "Carga reservada com sucesso");
		} else {
			showMessageDialog(null, "Entre em contato com o TI");
		}
	}

	private String gerarMenu() {
		String aux = "Reserva de Carga\n";
		aux += "1. Realizar reserva\n";
		aux += "2. Pesquisar reserva\n";   
		aux += "3. Visualizar reserva\n";   
		aux += "4. Capacidade reservada\n";   
		aux += "5. Cancelar reserva\n";   
		aux += "6. Encerrar programa\n";
		return aux;
	}
}
