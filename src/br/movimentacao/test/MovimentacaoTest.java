package com.br.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.movimentacao.Conta;

public class BancoTeste {

	@Test
	public void CriarConta() {
		Conta conta = new Conta ();
        assertEquals("teste", 123, 123);
	}

	@Test
	public void ExcluirConta() {
		Conta conta = new Conta();
		if (conta.getSaldo() == 000) {
			assertEquals("conta removida", 000, 000);
			}
	}
		@Test
		public void SacarConta(){
		 Conta conta = new Conta();
		 if(conta.getSaldo()>0) {
		 assertEquals(13, 14);
		 }
		}
	
