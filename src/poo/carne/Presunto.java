package poo.carne;

import poo.lanche.Pao;

public class Presunto extends Carne{
	public Presunto(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", presunto";
	}

	@Override
	public double preco() {
		return pao.preco() + 2;
	}
}
