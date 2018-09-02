package poo.salada;

import poo.lanche.Pao;

public class Tomate extends Salada{
	public Tomate(Pao pao) {
		super(pao);
	}

	public String getDescricao() {
		return pao.getDescricao() + ", tomate";
	}
	
	@Override
	public double preco() {
		return pao.preco() + 2.5;
	}
}
