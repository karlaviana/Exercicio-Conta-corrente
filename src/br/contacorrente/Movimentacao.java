package br.contacorrente;

public class Movimentacao {
	private double credito;
	private double debito;
	private String descrição;
	
	public Movimentacao(String descrição,double debito,double credito) {
		this.credito= credito;
		this.debito= debito;
		this.descrição= descrição;
				
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
	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
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
