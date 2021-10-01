package controle;

import java.util.ArrayList;
import modelo.Funcionario;

public class ControleFuncionario {
	public ArrayList<String> aux = new ArrayList<String>();
	
	public String[] getNomeFuncionario() {
		for(int i = 0; i < Funcionario.funcionarioN.size(); i++) {
			aux.add(Funcionario.funcionarioN.get(i));
		}

		String[] s = new String[aux.size()];
		for(int i = 0; i < aux.size(); i++) {
			s[i] = aux.get(i);
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
