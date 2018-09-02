package poo.carne;

import poo.lanche.Pao;

public class Rosbife extends Carne{
	public Rosbife(Pao pao) {
		super(pao);
	}
	
	public String getDescricao() {
		return pao.getDescricao() + ", rosbife";
	}

	@Override
	public double preco() {
		return pao.preco() + 10;
	}
}
