package br.fiap.cargo;

import br.fiap.comissao.Comissao;

public enum Cargo implements Comissao{
	ATENDENTE {
		public double calcularComissao(double valor) {			
			return valor * 10 / 100;
		}
	}, VENDEDOR {
		public double calcularComissao(double valor) {
			return valor * 15 / 100 + 5;
		}
	}, GERENTE {
		public double calcularComissao(double valor) {
			return valor * 20 / 100 + 10;
		}
	};
}
