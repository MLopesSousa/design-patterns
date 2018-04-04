package decorator;

public class Canela implements Bebida {
	private Bebida bebida;
	
	Canela(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return this.bebida.getDescricao() + " : " + "Canela";
	}

	@Override
	public int getPreco() {
		return this.bebida.getPreco() + 2;
	}

}
