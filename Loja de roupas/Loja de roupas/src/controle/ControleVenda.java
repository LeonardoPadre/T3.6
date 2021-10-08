package controle;


import java.util.ArrayList;

import modelo.Venda;

/**
 * Realiza o controle da base de dados referente a venda para ser mostrada ao usuario
 * @author Leo
 * @version 1.0 (Out 2021)
 *
 */
public class ControleVenda {
	Venda v = new Venda();
	public ArrayList<String> cv = new ArrayList<String>();
	public ArrayList<String> cv2 = new ArrayList<String>();
	
	/**
	 * Transforma a ArrayList referente ao código das vendas registradas em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
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
	
	/**
	 * Cria uma Array com todos os produtos inseridos na nota da venda
	 * @param pos
	 * @return
	 */
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
	
	/**
	 * Cria uma Array com a quantidade respectiva de cada produto inserido na nota da venda
	 * @param pos
	 * @return
	 */
	public String[] getQuantidade(int pos) {
		
		String[] s = new String[v.getQuantidade(pos).size()];
		for(int i = 0; i < v.getQuantidade(pos).size(); i++) {
			s[i] = v.getQuantidade(pos).get(i);
		}
		
		return s;
	}
}