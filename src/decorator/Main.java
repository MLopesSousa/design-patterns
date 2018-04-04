package decorator;

public class Main {
	public static void main(String[] args) {
		// Um cafe com duas por��es de caramelo e uma por��o de canela
		
		Bebida bebida = new Canela(new Caramelo(new Caramelo(new Cafe())));
		System.out.println(bebida.getPreco());
	}
}
