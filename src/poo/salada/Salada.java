package poo.salada;

import poo.lanche.Pao;

public abstract class Salada extends Pao{
	
	protected Pao pao;
	
	public Salada(Pao pao) {
		this.pao = pao;
	}
	
}
