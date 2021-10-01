package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Cliente;

public class TelaDetalheCliente implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorTelefone;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String s;
	
	int posicao;
	int opcao;
	
	public void inserirEditar(int op, int pos) {
		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Detalhe de Cliente";
		janela = new JFrame(s);
		Cliente c = new Cliente();
		
		opcao = op;
		posicao = pos;
		
		if (op == 1) { //Sem dados
			valorNome = new JTextField(25);
			valorCPF = new JTextField(25);
			valorTelefone = new JTextField(25);
			valorEmail = new JTextField(25);
		}
		
		else if (op == 2) { //Com dados
			valorNome = new JTextField(c.getNome(pos), 25);
			valorCPF = new JTextField(c.getCPF(pos), 25);
			valorTelefone = new JTextField(c.getTelefone(pos), 25);
			valorEmail = new JTextField(c.getEmail(pos), 25);
			
			botaoExcluir.setBounds(65, 420, 115, 30);
			janela.add(botaoExcluir);
		}
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCPF.setBounds(30, 50, 150, 25);
		valorCPF.setBounds(180, 50, 180, 25);
		labelTelefone.setBounds(30, 80, 150, 25);
		valorTelefone.setBounds(180, 80, 180, 25);		
		labelEmail.setBounds(30, 110, 150, 25);
		valorEmail.setBounds(180, 110, 180, 25);
		
		botaoSalvar.setBounds(190, 420, 115, 30);
		
		janela.add(labelNome);
		janela.add(valorNome);
		janela.add(labelCPF);
		janela.add(valorCPF);
		janela.add(labelTelefone);
		janela.add(valorTelefone);
		janela.add(labelEmail);
		janela.add(valorEmail);
		
		janela.add(botaoSalvar);
		
		janela.setLayout(null);
		
		janela.setSize(400, 500);
		janela.setVisible(true);
		
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		Cliente c = new Cliente();
		
		if(src == botaoSalvar) {
			if(opcao == 1) { //Novo
				Cliente.clienteN.add(valorNome.getText());
				Cliente.clienteC.add(valorCPF.getText());
				Cliente.clienteT.add(valorTelefone.getText());
				Cliente.clienteE.add(valorEmail.getText());
			}
			if(opcao == 2) { //Editar
				c.editNome(c.getNome(posicao), valorNome.getText());
				c.editCPF(c.getCPF(posicao), valorCPF.getText());
				c.editTelefone(c.getTelefone(posicao), valorTelefone.getText());
				c.editEmail(c.getEmail(posicao), valorEmail.getText());
			}
			janela.dispose();
		}
		
		if(src == botaoExcluir) {
			c.delCliente(c.getCPF(posicao));
			janela.dispose();
		}
	}
}