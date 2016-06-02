package br.com.movimentacao;

public class Movimentacao {
	private String descricao;
	private double valor;
	private String informação;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getInformação() {
		return informação;
	}
	public void setInformação(String informação) {
		this.informação = informação;
	}
	
	//Metodos da classe movimentacao
	
	public void obterCredito() {
		 double credito = 0;
	      credito= +valor;
	}
	public void obterDebito(){
		double debito = 0;
		debito =+valor;
	}
	
	

}
