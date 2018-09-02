package poo.carne;

import poo.lanche.Pao;

public class SemCarne extends Carne{

	public SemCarne(Pao pao) {
		super(pao);
	}

	@Override
	public double preco() {
		return 0;
	}

}
