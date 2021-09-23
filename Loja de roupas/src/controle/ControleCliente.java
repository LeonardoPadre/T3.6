package controle;

import java.util.ArrayList;
import modelo.Cliente;

public class ControleCliente {
	public ArrayList<String> aux = new ArrayList<String>();
	
	public String[] getNomeCliente() {
		for(int i = 0; i < Cliente.clienteN.size(); i++) {
			aux.add(Cliente.clienteN.get(i));
		}

		String[] s = new String[aux.size()];
		for(int i = 0; i < aux.size(); i++) {
			s[i] = aux.get(i);
		}
		
		return s;
	}
	
	public String[] getClienteN() {
		String[] s = new String[Cliente.clienteN.size()];
		for(int i = 0; i < Cliente.clienteN.size(); i++) {
			s[i] = Cliente.clienteN.get(i);
		}
		
		return s;
	}
}
