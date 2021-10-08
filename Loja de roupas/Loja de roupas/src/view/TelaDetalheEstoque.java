package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Estoque;
import modelo.Produto;

/**
 * Responsável por mostrar a tela referente ao estoque de forma mais detalhada
 * @author Leo
 * @version 1.0 (Out 2021)
 */
public class TelaDetalheEstoque implements ActionListener {
	private JFrame janela = new JFrame("Estoque");
	private JLabel labelNome = new JLabel("Nome: ");
	private JLabel valorNome;
	private JLabel labelCodigo = new JLabel("Código do produto: ");
	private JLabel valorCodigo;
	private JLabel labelQuantidade = new JLabel("Quantidade: ");
	private JTextField valorQuantidade;
	private JButton botaoZerar = new JButton("Zerar");
	private JButton botaoSalvar = new JButton("Salvar");
	
	int posicao;
	int opcao;
	
	/**
	 * Responsável por mostrar a tela de estoque do produto selecionado
	 * @param pos
	 */
	public void inserirEditar(int pos) {
		Produto p = new Produto();
		Estoque e = new Estoque();
		
		posicao = pos;
		
		valorNome = new JLabel(p.getNome(pos));
		valorCodigo = new JLabel(p.getCodigo(pos));
		valorQuantidade = new JTextField(String.valueOf(e.getEstoque(pos)), 5);		
		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCodigo.setBounds(30, 50, 150, 25);
		valorCodigo.setBounds(180, 50, 180, 25);
		labelQuantidade.setBounds(30, 80, 150, 25);
		valorQuantidade.setBounds(180, 80, 180, 25);
		janela.add(labelNome);
		janela.add(valorNome);
		janela.add(labelCodigo);
		janela.add(valorCodigo);
		janela.add(labelQuantidade);
		janela.add(valorQuantidade);
		
		
		botaoSalvar.setBounds(190, 200, 115, 30);
		botaoZerar.setBounds(65, 200, 115, 30);
		janela.add(botaoSalvar);
		janela.add(botaoZerar);
		
		janela.setLayout(null);
		
		janela.setSize(400, 400);
		janela.setVisible(true);
		
		botaoSalvar.addActionListener(this);
		botaoZerar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botaoSalvar) {
			Estoque.estoque.set(posicao, Integer.valueOf(valorQuantidade.getText()).intValue());
			janela.dispose();
		}
		
		if(src == botaoZerar) {
			Estoque.estoque.set(posicao, 0);
			janela.dispose();
		}
		
	}
}
