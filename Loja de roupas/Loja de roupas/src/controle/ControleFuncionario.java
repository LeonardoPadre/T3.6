package controle;

import java.util.ArrayList;
import modelo.Funcionario;

/**
 * Realiza o controle da base de dados referente ao funcionario para ser mostrado ao usuario
 * @author Leo
 *
 */
public class ControleFuncionario {
	public ArrayList<String> cf = new ArrayList<String>();
	
	/**
	 * Transforma a ArrayList referente ao nome dos clientes registrados em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
	public String[] getNomeFuncionario() {
		for(int i = 0; i < Funcionario.funcionarioN.size(); i++) {
			cf.add(Funcionario.funcionarioN.get(i));
		}

		String[] s = new String[cf.size()];
		for(int i = 0; i < cf.size(); i++) {
			s[i] = cf.get(i);
		}
		
		return s;
	}
	
	public String[] getFuncionarioN() {
		String[] s = new String[Funcionario.funcionarioN.size()];
		for(int i = 0; i < Funcionario.funcionarioN.size(); i++) {
			s[i] = Funcionario.funcionarioN.get(i);
		}
		
		return s;
	}
}
