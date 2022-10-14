package Xadrez;

import Tabuleiro.Peca;
import Tabuleiro.Tabua;

public class Pecaxadrez extends Peca{
	private Cor cor;

	public Pecaxadrez(Tabua tabua, Cor cor) {
		super(tabua);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	
}
