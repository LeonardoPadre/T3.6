package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import controle.Validador;

public class TesteValidador {
	Validador v = new Validador();
	
	@Test
	public void testValidaPreco() {
		assertTrue(v.validaPreco(100));
		assertTrue(v.validaPreco(1000000));
		assertFalse(v.validaPreco(-1));
		assertFalse(v.validaPreco(0));
	}

	@Test
	public void testValidaCPF() {
		assertTrue(v.validaCPF("05802361107"));
		assertTrue(v.validaCPF("67112343089"));
		assertFalse(v.validaCPF("AAAAAAAAAA"));
		assertFalse(v.validaCPF(""));
	}

	@Test
	public void testValidaData() {
		assertTrue(v.validaData("02/05/2002"));
		assertTrue(v.validaData("12/02/2020"));
		assertFalse(v.validaData("AAAAA"));
		assertFalse(v.validaData("01/44/222"));
	}

	@Test
	public void testValidaTelefone() {
		assertTrue(v.validaTelefone("(61) 99501-5917"));
		assertTrue(v.validaTelefone("(77) 97777-7777"));
		assertFalse(v.validaTelefone("(61)95015917"));
		assertFalse(v.validaTelefone("AAAAAAA"));
	}

	@Test
	public void testValidaEmail() {
		assertTrue(v.validaEmail("teste@hotmail.com"));
		assertTrue(v.validaEmail("teste@gmail.com"));
		assertFalse(v.validaEmail("teste@hotmail"));
		assertFalse(v.validaEmail("testehotmail.com"));
	}

	@Test
	public void testValidaQuantidade() {
		assertTrue(v.validaQuantidade(9, 0));
		assertTrue(v.validaQuantidade(1, 9));
		assertFalse(v.validaQuantidade(40, 0));
		assertFalse(v.validaQuantidade(90, 9));
	}

}
