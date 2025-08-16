package POO_Sistema_lav;

public class Pessoa {
	private String nome, endereco;
	private long cpf_cnpj, telefone;
	
	public Pessoa(String nome, String endereco, long cpf_cnpj, long telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf_cnpj = cpf_cnpj;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public long getCpf_cnpj() {
		return cpf_cnpj;
	}
	
	public long getTelefone() {
		return telefone;
	}

}
