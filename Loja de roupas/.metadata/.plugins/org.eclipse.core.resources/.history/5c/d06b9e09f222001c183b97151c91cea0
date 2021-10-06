package controle;


import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
	Venda v = new Venda();
	public ArrayList<String> aux = new ArrayList<String>();
	public ArrayList<String> aux2 = new ArrayList<String>();
	
	public String[] getCodVenda() {
		for(int i = 0; i < Venda.codigoVenda.size(); i++) {
			aux.add(Venda.codigoVenda.get(i));
		}
		
		String[] s = new String[aux.size()];
		for(int i = 0; i < aux.size(); i++) {
			s[i] = aux.get(i);
		}
		
		return s;
	}
	
	public String[] getProVenda(int pos) {
		for(int i = 0; i < v.getProdutosVendidos(pos).size(); i++) {
			aux2.add(v.getProdutosVendidos(pos).get(i));
		}
		
		String[] s = new String[aux2.size()];
		for(int i = 0; i < aux2.size(); i++) {
			s[i] = aux2.get(i);
		}
		
		return s;
	}
	
	public String[] getQuantidade(int pos) {
		
		String[] s = new String[v.getQuantidade(pos).size()];
		for(int i = 0; i < v.getQuantidade(pos).size(); i++) {
			s[i] = v.getQuantidade(pos).get(i);
		}
		
		return s;
	}
}