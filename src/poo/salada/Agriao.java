package poo.salada;

import poo.lanche.Pao;

public class Agriao extends Salada{
	public Agriao(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", agri�o";
	}

	@Override
	public double preco() {
		return pao.preco() + 1.5;
	}
}
