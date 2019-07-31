package Dominio;

import java.util.ArrayList;

public class Fornecedor {

	private String nome;
	private String endereco;
	private String cnpj;
	private String telefone;
	private double valorDaConta;
	private ArrayList<Peca> listapecas;

	public Fornecedor(String nome, String endereco, String cnpj, String telefone) {

		this.listapecas = new ArrayList<>();
		this.nome = nome;
		this.endereco = endereco;
		if (cnpj == null) {
			this.cnpj = null;
		} else {
			this.cnpj = cnpj;
		}

		if (telefone == null) {
			this.telefone = null;
		} else {
			this.telefone = telefone;
		}
		this.valorDaConta = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getValorDaConta() {
		return valorDaConta;
	}

	public void setValorDaConta(double valorDaConta) {
		this.valorDaConta = valorDaConta;
	}

	public ArrayList<Peca> getListapecas() {
		return listapecas;
	}

	public void setListapecas(ArrayList<Peca> listapecas) {
		this.listapecas = listapecas;
	}
	
	public boolean inserirPecaForne(Peca p) {
		boolean resposta = false;
		
		for (Peca peca : listapecas) {
			if(!peca.getCodigo().equals(p.getCodigo())) {
				listapecas.add(p);
				resposta = true;
				return resposta;
				
			}else {
				System.out.println("O fornecedor já trabalha com este material..");
				resposta = false;
				return resposta;
			}
		}
		
		return resposta;
	}
	
	public static void main(String[] args) throws Exception {
		Peca p1 = new Peca("AAA948-099", "Cabo de embreagem",
				"Cabo", 100.00, 120.78);
		
		Fornecedor f = new Fornecedor("Roberto peças", "0001/992092", "Gravataí", "3455 4565");
		f.inserirPecaForne(p1);
	}
	
	
	
	
	
	

}
