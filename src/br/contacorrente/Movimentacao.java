package br.contacorrente;

public class Movimentacao {
	private double credito;
	private double debito;
	private String descri��o;
	
	public Movimentacao(String descri��o,double debito,double credito) {
		this.credito= credito;
		this.debito= debito;
		this.descri��o= descri��o;
				
	}


	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}
	public String getDescri��o() {
		return descri��o;
	}


	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	
	

	// Metodo da classe movimentacao
	public void obterCredito(){
		double valor = 0;
		credito= + valor;
	}
	public void obterDebito(){
		double valor =0;
		debito = -valor;
	}


	}
