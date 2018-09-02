package poo.salada;

import poo.lanche.Pao;

public class Alface extends Salada{
	public Alface(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", alface";
	}

	@Override
	public double preco() {
		return pao.preco() + 2;
	}
}
