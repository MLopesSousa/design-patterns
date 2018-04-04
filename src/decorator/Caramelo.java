package decorator;

public class Caramelo implements Bebida {
	private Bebida bebida;
	
	Caramelo(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return this.bebida.getDescricao() + " : " + "Caramelo";
	}

	@Override
	public int getPreco() {
		return this.bebida.getPreco() + 3;
	}

}