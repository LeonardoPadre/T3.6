package TP3;

public class Teste {
	static Telefone t;
	static Cliente c1;
	static Funcionario f1;
	static Produto p1;
	static Estoque e1;
	static Venda v1;
	
	public static void main(String[] args) {
		
		c1 = new Cliente("Leonardo", "4857653368", "email@gmail.com");
		f1 = new Funcionario("Carlos", "Gerente", "17/08/2020", "Brasilia", "6793428", "34701685501", "masculino");
		p1 = new Produto("000001", "Moletom", 119.99, "Nike", "100% algodão", "Inverno", "Masculino");
		e1 = new Estoque("000001", "Moletom", 100);
		
		t = new Telefone();
		t.setDDD(061);
		t.setNumero(555555555);
		
		v1 = new Venda("100000", 2, "Moletom", 139.99, "Carlos", "Leonardo");
		v1.cadastrarVenda();
		
		System.out.println(c1.toString());
		System.out.println(f1.toString());
		System.out.println(t.toString());
		System.out.println(p1.toString());
		System.out.println(e1.toString());
		System.out.println(v1.toString());
	}
}
