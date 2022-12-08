package pessoa;

public class PessoaJuridica extends Pessoa {

	protected String cnpj;
	protected String razaoSocial;

	public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;

	}

	public String getcnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getrazaoSocial() {
		return razaoSocial;
	}

	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String toString() {
		return this.getNome()
	     +this.getcnpj()
		 +this.getrazaoSocial();		
        
	}
}
