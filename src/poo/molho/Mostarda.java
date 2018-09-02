package poo.molho;

import poo.lanche.Pao;

public class Mostarda extends Molho{
	
	public Mostarda(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", mostarda";
	}

	@Override
	public double preco() {
		return pao.preco() + 0.5;
	}
	
}
