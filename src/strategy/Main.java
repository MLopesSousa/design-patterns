package strategy;

public class Main {
public static void main(String[] args) {
	new Cliente(new Subtracao()).run(2,2);
	new Cliente(new Soma()).run(2,2);
}
}
