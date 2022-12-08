package quartaquest;

public class Contapoupanca extends Conta {
	private static double taxa = 0.1;

	public Contapoupanca(double saldo) {
		creditar(saldo);
	}

	public Contapoupanca(Pessoa cliente, double saldo) {
		this(saldo);
		setCliente(cliente);
	}

	public void rendeJuros() {
		creditar(taxa * this.saldo);
	}

}