package br.contacorrente;

import java.util.ArrayList;

public class Banco {
	private ArrayList<ContaCorrente>conta;

	public Banco(ArrayList <ContaCorrente>conta) {
		this.conta=conta;
	}

	public ArrayList<ContaCorrente> getConta() {
		return conta;
	}

	public void setConta(ArrayList<ContaCorrente> conta) {
		this.conta = conta;
	}
 
}
