package modelo;

import java.util.ArrayList;

public class Venda {
	private String nomeP;
	private String nomeC;
	private String nomeF;
	private String codVenda;
	private double custoFinal;
	private int qntVendido;
	ArrayList<String> venda = new ArrayList<String>();
	
	
	public String toString() {
		return "Venda: " + codVenda + " || " + qntVendido + " x " + nomeP + " || Valor: " + custoFinal +
				" || Vendedor: " + nomeF + " || Cliente: " + nomeC;
	}
	
	public Venda(String cv, int qv, String np, double cf, String nf, String nc) {
		codVenda = cv;
		qntVendido = qv;
		nomeP = np;
		custoFinal = cf;
		nomeF = nf;
		nomeC = nc;
	}
	
	public Venda() {
		
	}

	public void cadastrarVenda() {
		addProdutoVendido(codVenda, qntVendido, nomeP);
		addCliFun(nomeC, nomeF);
		addValor(custoFinal);
	}
	
	//Produto na venda
	public void addProdutoVendido(String codVenda, int qntVendida, String nomeProduto) {
		venda.add(codVenda);
		String aux = "Venda: " + qntVendido + " x " + nomeP;
		venda.add(aux);
	}
	
	public void editProdutoVendido(String codVenda, int qntVendida, String nomeProduto) {
		for(int i = 0; i < venda.size(); i++) {
			if(venda.get(i) == codVenda) {
				String aux = "Venda: " + qntVendido + " x " + nomeP;
				venda.set(i+1, aux);
			}
		}
	}
	
	//Envolvidos na compra
	public void addCliFun(String nomeC, String nomeF) {
		String aux1 = "Vendedor: " + nomeF + " || Cliente: " + nomeC;
		venda.add(aux1);
	}
	
	public void editCliFun(String codVenda, String nomeC, String nomeF) {
		for(int i = 0; i < venda.size(); i++) {
			if(venda.get(i) == codVenda) {
				String aux1 = "Vendedor: " + nomeF + " || Cliente: " + nomeC;
				venda.set(i+2, aux1);
			}
		}
	}
	
	//Valor da compra
	public void addValor(double custo) {
		String aux2 = "Valor: " + custo;
		venda.add(aux2);
	}
	
	public void editValor(String codVenda, double custo) {
		for(int i = 0; i < venda.size(); i++) {
			if(venda.get(i) == codVenda) {
				String aux2 = "Valor: " + custo;
				venda.set(i+3, aux2);
			}
		}
	}
	
	//Deletar
	public void delProEst(String cod) {
		for(int i = 0; i < venda.size(); i++) {
			if(venda.get(i) == cod) {
				for(int w = i; w < i + 4; w++)
					venda.remove(w);
			}
		}
	}
}
