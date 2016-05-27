package br.contacorrente;

import java.util.ArrayList;

public class ContaCorrente {
	private double saldo;
	private int numero;
	private double limite;
	private char status;
	private ArrayList<ContaCorrente> conta;
	
	
	public ContaCorrente(double saldo,int numero,char status, double limite, ArrayList<ContaCorrente>conta) {
		this.saldo= saldo;
		this.limite= limite;
		this.status= status;
		this.numero=numero;
		this.conta=conta;
		
	}

	public ContaCorrente(double saldo2, int numero2, double limite2, char status2, ArrayList<ContaCorrente> conta2) {
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public ArrayList<ContaCorrente> getConta() {
		return conta;
	}

	public void setConta(ArrayList<ContaCorrente> conta) {
		this.conta = conta;
	}



}
