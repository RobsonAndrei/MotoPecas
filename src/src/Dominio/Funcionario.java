package Dominio;

public class Funcionario {

	private String nome;
	private Double salario;
	private Vale value;
	private String tipo;
	private String login, senha, confsenha;

	public Funcionario(String _nome, String login, String senha, String confSenha) {
		this.nome = _nome;
		this.login = login;
		this.senha = senha;
		this.confsenha = confSenha;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Vale getValue() {
		return value;
	}

	public void setValue(Vale value) {
		this.value = value;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfsenha() {
		return confsenha;
	}

	public void setConfsenha(String confsenha) {
		this.confsenha = confsenha;
	}

}
