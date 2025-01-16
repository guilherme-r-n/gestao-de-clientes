package br.com.guilherme.gestao_de_clientes.entity;

public class ClientePessoaFisicaEntity {

	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String endereco;
	private String cidade;
	private String estado;

	public ClientePessoaFisicaEntity() {
	}

	public ClientePessoaFisicaEntity(Long id, String nome, String cpf, String email, String telefone, String endereco,
			String cidade, String estado) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Id: " + id + " |" + " Nome: " + nome + " |" + " CPF: " + cpf + " |" + " Email: " + email + " |"
				+ " Telefone: " + telefone + " |" + " Endereço: " + endereco + " |" + " Cidade: " + cidade + " |"
				+ " Estado: " + estado + "\n";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
