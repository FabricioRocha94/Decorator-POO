package poo.molho;

import poo.lanche.Pao;

public class Azeite extends Molho{
	
	public Azeite(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", azeite";
	}

	@Override
	public double preco() {
		return pao.preco() + 1;
	}
	
}
