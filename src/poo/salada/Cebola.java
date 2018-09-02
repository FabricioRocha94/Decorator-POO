package poo.salada;

import poo.lanche.Pao;

public class Cebola extends Salada{
	public Cebola(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", cebola";
	}

	@Override
	public double preco() {
		return pao.preco() + 3;
	}
}
