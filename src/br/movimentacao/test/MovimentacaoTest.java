package br.movimentacao.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.contacorrente.Movimentacao;

public class MovimentacaoTest {

	@Test
	public void testObterCredito() {
		Movimentacao mov = new Movimentacao("teste",20, 20);
		assertEquals("Novo teste", 20, 20);
	}

	@Test
	public void testObterDebito(){
		Movimentacao mov = new Movimentacao("teste",20, 20);
	    assertEquals("teste",20,20);
		
	}
}
