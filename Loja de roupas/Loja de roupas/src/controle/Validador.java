package controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import modelo.Estoque;

/**
 * Verifica se os dados fornecidos estão no formato esperado
 * @author Leo
 * @version 1.0 (Out 2021)
 */

public class Validador {
	/**
	 * Verifica se o preço inserido é um preço valido. É feita apenas uma verificação:
	 * (1) Se o preço é maior que 0
	 * @param preco
	 * @return
	 */
	public boolean validaPreco(double preco) {
		boolean valido = false;
		
		if(preco > 0) {
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Verifica se o CPF é válido a partir de uma lógica na qual são calculados dois digitos que farão a verificação:
	 * (1) Primeiro digito verificador. Cada um dos nove primeiros números do CPF é multiplicado por um peso que começa de 10 e que vai sendo diminuido de 1 a cada passo.
	 * (2) Segundo digito verificador. Cada um dos dez primeiros números do CPF, considerando-se aqui o primeiro DV, é multiplicado por um peso que começa de 11 e que vai sendo diminuido de 1 a cada passo.
	 * @param CPF
	 * @return
	 */
	public boolean validaCPF(String CPF) {
		if (CPF.equals("00000000000") ||
	            CPF.equals("11111111111") ||
	            CPF.equals("22222222222") || CPF.equals("33333333333") ||
	            CPF.equals("44444444444") || CPF.equals("55555555555") ||
	            CPF.equals("66666666666") || CPF.equals("77777777777") ||
	            CPF.equals("88888888888") || CPF.equals("99999999999") ||
	            (CPF.length() != 11))
	            return(false);

	        char dig10, dig11;
	        int sm, i, r, num, peso;

	        try {
	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {
	            	
	            num = (int)(CPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48);

	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(CPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);

	            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (InputMismatchException erro) {
	                return(false);
	            }
	}
	
	/**
	 * Verifica se a data foi inserida da forma correta utilizando Pattern e Matcher.
	 * @param data
	 * @return
	 */
	public boolean validaData(String data) {
		boolean telefoneValido = false;
	    if (data != null && data.length() > 0) {
	        String expression = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(data);
	        if (matcher.matches()) {
	        	telefoneValido = true;
	        }
	    }
	    return telefoneValido;
	}
	
	/**
	 * Verifica se o telefone foi inserido da forma correta utilizando Pattern e Matcher.
	 * @param telefone
	 * @return
	 */
	public boolean validaTelefone(String telefone) {
		boolean telefoneValido = false;
	    if (telefone != null && telefone.length() > 0) {
	        String expression = "^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(telefone);
	        if (matcher.matches()) {
	        	telefoneValido = true;
	        }
	    }
	    return telefoneValido;
	}
	
	/**
	 * Verifica se o email foi inserido da forma correta utilizando Pattern e Matcher.
	 * @param email
	 * @return
	 */
	public boolean validaEmail(String email) {
		boolean emailValido = false;
	    if (email != null && email.length() > 0) {
	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	        	emailValido = true;
	        }
	    }
	    return emailValido;
	}
	
	/**
	 * Valida se a quantidade colocada de um certo produto na venda faz sentido, realizando apenas uma verificação:
	 * (1) Se existe quantidade suficiente do produto em estoque para realizar o registro na nota da venda
	 * @param qnt
	 * @param pos
	 * @return
	 */
	public boolean validaQuantidade(int qnt, int pos) {
		boolean valido = false;
		
		if(qnt > 0 && qnt <= Estoque.estoque.get(pos)) {
			valido = true;
		}
		
		return valido;
	}
}
