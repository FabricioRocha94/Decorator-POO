package poo.carne;

import poo.lanche.Pao;

public class Peru extends Carne{
	
	public Peru(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", peru";
	}

	@Override
	public double preco() {
		return pao.preco() + 8;
	}
	
}
