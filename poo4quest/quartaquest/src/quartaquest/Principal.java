package quartaquest;

public class Principal {
	public static void main(String[] args) {
		Pessoa jeova = new Pessoafisica("Jeová");
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);

		Pessoa samuel = new Pessoafisica("Samuel");
		Contaespecial c2 = new Contaespecial(samuel, 200);
		c2.debitar(500);

		Contapoupanca c3 = new Contapoupanca(new Pessoa("Agamenon", 25), 10000);

		c3.rendeJuros();

		System.out.println(c);

		System.out.println(c2);

		System.out.println(c3);
	}
}
