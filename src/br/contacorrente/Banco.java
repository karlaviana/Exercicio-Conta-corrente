package br.com.movimentacao;

import java.util.ArrayList;

public class Banco {
	private ArrayList conta;

	public Banco() {
		this.conta =conta;
	}

	public ArrayList getContas() {
		return conta;
	}

	public void setContas(ArrayList conta) {
		this.conta = conta;
	}
	
	// metodo da classe Banco
	
	public void criarconta(){
		Conta conta = new Conta();
		conta.setNumero(12345);
		conta.setSaldo(12.00);
		conta.setStatus('S');
		
	}
	
	
}
