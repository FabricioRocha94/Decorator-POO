package poo.salada;

import poo.lanche.Pao;

public class Rucula extends Salada{
	public Rucula(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", rucula";
	}

	@Override
	public double preco() {
		return pao.preco() + 2;
	}
}
