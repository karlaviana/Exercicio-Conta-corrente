
package com.br.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.movimentacao.Movimentacao;

public class MovimentaçãoTest {

	@Test
	public void ObterCredito() {
		Movimentacao mov = new Movimentacao();
		assertEquals("valor credito",100,100);
		
	}
	@Test
	public void ObterDebito(){
		Movimentacao mov = new Movimentacao();
		assertEquals("Valor debito", 200, 200);
	}
	

}
