package com.mod.principal;

public class Bicicleta extends Veiculo{
	private int numMarchas;

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	public String info() {
		return "Cor: "+this.getCor()+
				"\nNumero de Marchas: "+numMarchas+"\n";
	}
}
