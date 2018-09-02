package poo.molho;

import poo.lanche.Pao;

public class Parmesao extends Molho{
	
	public Parmesao(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", parmesão";
	}

	@Override
	public double preco() {
		return pao.preco() + 1.5;
	}
	
}
