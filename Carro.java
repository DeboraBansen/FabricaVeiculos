package com.mod.principal;

public class Carro extends Veiculo{
	private int numPortas;
	private Combustivel combustivel;
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
	public String info() {
		return	"Cor: "+this.getCor()+
				"\nNumero de portas: "+numPortas+
				"\nCombustivel: "+this.getCombustivel()+"\n";
	}
}
