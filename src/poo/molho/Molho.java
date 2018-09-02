package poo.molho;

import poo.lanche.Pao;

public abstract class Molho extends Pao {
	
	protected Pao pao;
	
	public Molho(Pao pao) {
		this.pao = pao;
	}
	
}
