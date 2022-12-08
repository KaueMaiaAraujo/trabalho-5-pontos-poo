package quartaquest;

public class Pessoafisica extends Pessoa {

	protected String cpf;
	protected String sobrenome;

	public Pessoafisica(String nome) {
		super(nome);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
