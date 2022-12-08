package quartaquest;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return this.nome + ", com " + this.idade + " anos.";
	}
}
