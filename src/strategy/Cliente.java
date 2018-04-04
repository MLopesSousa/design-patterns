package strategy;

public class Cliente {
	private Algorithm algorithm;
	
	public Cliente(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public void run(int n1, int n2) {
		this.algorithm.run(n1, n2);
	}
}
