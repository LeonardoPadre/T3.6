package view;

import modelo.*;

import java.util.ArrayList;


public class Teste {
	public static void main(String[] args) {
		Produto p = new Produto();
		ArrayList<String> aux = new ArrayList<String>();
		aux.addAll(p.produtoN);
		
		System.out.println(aux);
		System.out.println("===============================================");
		
		p.addNome("AAAAAAAAA");
		aux.clear();
		aux.addAll(p.produtoN);
		System.out.println(aux);
		System.out.println("===============================================");
	}	
}
