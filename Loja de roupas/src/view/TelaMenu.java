package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaMenu implements ActionListener {
	private static JFrame janela = new JFrame("Loja de roupas");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionário");
	private static JButton produto = new JButton("Produto");
	private static JButton venda = new JButton("Venda");
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		cliente.setBounds(140, 100, 100, 30);
		funcionario.setBounds(140, 150, 100, 30);
		produto.setBounds(140, 50, 100, 30);
		venda.setBounds(140, 200, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(produto);
		janela.add(venda);
		
		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		TelaMenu menu = new TelaMenu();
		
		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		produto.addActionListener(menu);
		venda.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == produto) {
			new TelaSelecionada().mostrarDados(1);
		}
		
		if(src == cliente || src == funcionario || src == venda) {
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
