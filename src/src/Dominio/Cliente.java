package Dominio;

public class Cliente {

  private String nome, cpf, telefone, endereco, placa, marca, modelo;
  private boolean saldo_devedor;
  private Double saldo_a_pagar;

  public Cliente(String _nome, String _cpf, String _tel, String _endere) {
    this.nome = _nome;
    this.cpf = _cpf;
    this.telefone = _tel;
    this.endereco = _endere;
    this.saldo_a_pagar = 0.0;
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

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public boolean isSaldo_devedor() {
    return saldo_devedor;
  }

  public void setSaldo_devedor(boolean saldo_devedor) {
    this.saldo_devedor = saldo_devedor;
  }

  public Double getSaldo_a_pagar() {
    return saldo_a_pagar;
  }

  public void setSaldo_a_pagar(Double saldo_a_pagar) {
    this.saldo_a_pagar = saldo_a_pagar;
  }

  public void pendurar(Double valor) {

    if (saldo_devedor == true) {
      saldo_a_pagar = saldo_a_pagar - valor;
    }
  }
}
