package controle;

import java.util.ArrayList;
import java.util.Collections;

import modelo.Produto;

/**
 * Realiza o controle da base de dados referente ao produto para ser mostrado ao usuario
 * @author Leo
 *
 */
public class ControleProduto {
	public ArrayList<String> cp = new ArrayList<String>();
	public ArrayList<Double> aux = new ArrayList<Double>();
	public ArrayList<Integer> idc = new ArrayList<Integer>();
	
	/**
	 * Transforma a ArrayList referente ao nome dos produtos registrados em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
	public String[] getNomeProduto() {
		for(int i = 0; i < Produto.produtoN.size(); i++) {
			cp.add(Produto.produtoN.get(i));
		}

		String[] s = new String[cp.size()];
		for(int i = 0; i < cp.size(); i++) {
			s[i] = cp.get(i);
		}
		return s;
	}
	
	/**
	 * Transforma a ArrayList referente ao nome dos produtos registrados em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
	public String[] getProdutoN() {
		String[] s = new String[Produto.produtoN.size()];
		for(int i = 0; i < Produto.produtoN.size(); i++) {
			s[i] = Produto.produtoN.get(i);
		}
		
		return s;
	}
	
	/**
	 * Retorna a Array referente aos nomes dos produtos atualizada conforme o filtro selecionado na tela de produtos cadastrados
	 * @param opc
	 * @return
	 */
	public String[] filtroProduto(int opc) {
		for(int i = 0; i < Produto.produtoP.size(); i++) {
			aux.add(Produto.produtoP.get(i));
		}
		
		switch (opc) {
			case 1: //Crescente
				aux.sort(null);
				break;
			case 2: //Decrescente
				aux.sort(Collections.reverseOrder());
				break;
		}
		
		for(int i = 0; i < aux.size(); i++) {
			for(int j = 0; j < Produto.produtoP.size(); j++) {
				if(aux.get(i) == Produto.produtoP.get(j)) {
					idc.add(j);
				}
			}
		}
		
		String[] s = new String[idc.size()];
		for(int i = 0; i < idc.size(); i++) {
			s[i] = Produto.produtoN.get(idc.get(i));
		}
		
		return s;
	}
}
