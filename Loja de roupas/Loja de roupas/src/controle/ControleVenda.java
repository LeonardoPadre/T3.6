package controle;


import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
	Venda v = new Venda();
	public ArrayList<String> cv = new ArrayList<String>();
	public ArrayList<String> cv2 = new ArrayList<String>();
	
	public String[] getCodVenda() {
		for(int i = 0; i < Venda.codigoVenda.size(); i++) {
			cv.add(Venda.codigoVenda.get(i));
		}
		
		String[] s = new String[cv.size()];
		for(int i = 0; i < cv.size(); i++) {
			s[i] = cv.get(i);
		}
		
		return s;
	}
	
	public String[] getProVenda(int pos) {
		for(int i = 0; i < v.getProdutosVendidos(pos).size(); i++) {
			cv2.add(v.getProdutosVendidos(pos).get(i));
		}
		
		String[] s = new String[cv2.size()];
		for(int i = 0; i < cv2.size(); i++) {
			s[i] = cv2.get(i);
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