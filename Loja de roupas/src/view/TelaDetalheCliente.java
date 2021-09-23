package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Cliente;

public class TelaDetalheCliente implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("Preço: ");
	private JTextField valorCPF;
	private JLabel labelTelefone = new JLabel("Preço: ");
	private JTextField valorTelefone;
	private JLabel labelEndereco = new JLabel("Preço: ");
	private JTextField valorEndereco;
	private String s;
	
	int posicao;
	int opcao;
	
	public void inserirEditar(int op, int pos) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
