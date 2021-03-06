package controle;

import java.util.ArrayList;
import modelo.Cliente;

/**
 * Realiza o controle da base de dados referente ao cliente para ser mostrado ao usuario
 * @author Leo
 *
 */
public class ControleCliente {
	public ArrayList<String> cc = new ArrayList<String>();
	
	/**
	 * Transforma a ArrayList referente ao nome dos clientes registrados em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
	public String[] getNomeCliente() {
		for(int i = 0; i < Cliente.clienteN.size(); i++) {
			cc.add(Cliente.clienteN.get(i));
		}

		String[] s = new String[cc.size()];
		for(int i = 0; i < cc.size(); i++) {
			s[i] = cc.get(i);
		}
		
		return s;
	}
	
	/**
	 * Transforma a ArrayList referente ao nome dos clientes registrados em uma Array comum para encaixar nos parametros da JList
	 * @return
	 */
	public String[] getClienteN() {
		String[] s = new String[Cliente.clienteN.size()];
		for(int i = 0; i < Cliente.clienteN.size(); i++) {
			s[i] = Cliente.clienteN.get(i);
		}
		
		return s;
	}
}
