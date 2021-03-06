package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Responsável pelo menu principal do programa
 * @author Leo
 * @version 1.0 (Out 2021
 */
public class TelaMenu implements ActionListener {
	private static JFrame janela = new JFrame("Loja de roupas");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionário");
	private static JButton produto = new JButton("Produto");
	private static JButton venda = new JButton("Venda");
	private static JButton estoque = new JButton("Estoque");
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		cliente.setBounds(140, 100, 100, 30);
		funcionario.setBounds(140, 150, 100, 30);
		produto.setBounds(140, 50, 100, 30);
		venda.setBounds(140, 200, 100, 30);
		estoque.setBounds(140, 250, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(produto);
		janela.add(venda);
		janela.add(estoque);
		
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		produto.addActionListener(menu);
		venda.addActionListener(menu);
		estoque.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == produto) {
			new TelaSelecionada().mostrarDados(1);
		}
		
		if(src == cliente) {
			new TelaSelecionada().mostrarDados(2);
		}
		
		if(src == funcionario) {
			new TelaSelecionada().mostrarDados(3);
		}
		
		if(src == venda) {
			new TelaSelecionada().mostrarDados(4);
		}
		
		if(src == estoque) {
			new TelaSelecionada().mostrarDados(5);
		}
	}
}
