package listaencadeada;

public class ListaEncadeada {

	public static void main(String[] args) {
		No lista = new No();
		lista.dado = 1;
		lista.prox = null;
		
		No novo = new No();
		novo.dado = 2;
		novo.prox = null;
		
		lista.prox = novo;
		
		No novo2 = new No();
		novo2.dado = 3;
		novo2.prox = lista;
		
		lista = novo2;
		
		No aux = lista;
		
		while(aux != null) {
			System.out.println("aux.dado: " + aux.dado + "\t prox: " + aux.prox);
			aux = aux.prox;
		}
		
	}

}
