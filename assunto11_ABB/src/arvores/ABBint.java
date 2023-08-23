package arvores;

public class ABBint {
	
	private class ARVORE {
		int dado;
		ARVORE esq, dir;
	}
	
	public ARVORE root = null;
	
	public ARVORE inserir(ARVORE p, int info) {
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		} else if (info < p.dado) {
			p.esq = inserir (p.esq, info);
		} else {
			p.dir = inserir (p.dir, info);
		}
		return p;
	}
	
	public void listaEmOrdem (ARVORE p) {
		if (p != null) {
			listaEmOrdem(p.esq);
			System.out.println(" " + p.dado);
			listaEmOrdem(p.dir);
		}
	}
	
}
