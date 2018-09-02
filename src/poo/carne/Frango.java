package poo.carne;

import poo.lanche.Pao;

public class Frango extends Carne{
	
	public Frango(Pao pao) {
		super(pao);
	}

	public String getDescricao() {
		return pao.getDescricao() + ", frango";
	}
	
	@Override
	public double preco() {
		return pao.preco() + 4;
	}
}
