package poo.carne;

import poo.lanche.Pao;

public abstract class Carne extends Pao{
	
	protected Pao pao;
	
	public Carne(Pao pao) {
		this.pao = pao;
	}
	
}
