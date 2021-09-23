package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ControleProduto {
	public ArrayList<String> aux = new ArrayList<String>();
	
	public String[] getNomeProduto() {
		for(int i = 0; i < Produto.produtoN.size(); i++) {
			aux.add(Produto.produtoN.get(i));
		}

		String[] s = new String[aux.size()];
		for(int i = 0; i < aux.size(); i++) {
			s[i] = aux.get(i);
		}
		
		return s;
	}
	
	public String[] getProdutoN() {
		String[] s = new String[Produto.produtoN.size()];
		for(int i = 0; i < Produto.produtoN.size(); i++) {
			s[i] = Produto.produtoN.get(i);
		}
		
		return s;
	}
}
