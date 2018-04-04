package decorator;

public class Main {
	public static void main(String[] args) {
		// Um cafe com duas porções de caramelo e uma porção de canela
		
		Bebida bebida = new Canela(new Caramelo(new Caramelo(new Cafe())));
		System.out.println(bebida.getPreco());
	}
}
