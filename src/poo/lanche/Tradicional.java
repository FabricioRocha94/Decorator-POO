package poo.lanche;

public class Tradicional extends Pao{
	public Tradicional() {
		descricao = "Pão tradicional";
	}

	@Override
	public double preco() {
		return 5;
	}
}
