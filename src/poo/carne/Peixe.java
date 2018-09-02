package poo.carne;

import poo.lanche.Pao;

public class Peixe extends Carne{
	public Peixe(Pao pao) {
		super(pao);
	}

	public String getDescricao() {
		return pao.getDescricao() + ", peixe";
	}
	
	@Override
	public double preco() {
		return pao.preco() + 6;
	}
}
