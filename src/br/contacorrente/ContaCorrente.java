package br.com.movimentacao;

public class Conta {
	private  int numero;
	private double saldo;
	private char status;
	private double limite;
	private int conta ;
	
	public Conta(){
	
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int i) {
		this.conta = i;
	}

}
