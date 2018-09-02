package poo.salada;

import poo.lanche.Pao;

public class Azeitona extends Salada{
	public Azeitona(Pao pao) {
		super(pao);
	}

	public String getDescricao() {
		return pao.getDescricao() + ", azeitona";
	}
	
	@Override
	public double preco() {
		return pao.preco() + 2.5;
	}
}
