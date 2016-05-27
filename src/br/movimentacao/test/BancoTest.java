package br.movimentacao.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import br.contacorrente.ContaCorrente;

public class BancoTest extends ContaCorrente{

	public BancoTest(double saldo, int numero, double limite, char status, ArrayList<ContaCorrente> conta) {
		super(saldo, numero, limite, status, conta);
		
	}

	@Test
	public void testcriarConta() {
		ContaCorrente conta = new ContaCorrente (20,1234, getStatus(), 20, null);
		assertEquals("teste novo", conta.getLimite(),conta.getNumero());
		
	}

}
