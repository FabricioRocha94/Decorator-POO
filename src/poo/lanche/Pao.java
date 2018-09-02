package poo.lanche;

public abstract class Pao {
	protected String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco();
	
	public String toString() {
		return getDescricao() + " R$" + preco();
	}
}
