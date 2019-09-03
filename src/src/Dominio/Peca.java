package Dominio;

import Dominio.Estoque;

public class Peca {

  private String nome, descricao, codigo;
  private Double valor_Venda;
  private Double valor_Compra;

  public Peca(String nome, String descricao, String codigo, Double val_compra, Double valor_Venda) {
    this.nome = nome;
    this.descricao = descricao;
    this.codigo = codigo;
    this.valor_Venda = valor_Venda;
    this.valor_Compra = val_compra;
  }

  /**
   * ============================= CONSTRUTOR ======================================================
   * Recebe o nome da peça, uma descrição, um código para a busca da peça, um valor de venda, e um
   * valor de compra, geralmente o valor de venda deve ser maior que o valor da compra. Colocado um
   * try cach para que o valor de venda nunca seja menor que o valor de compra.
   */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Double getValor_Venda() {
    return valor_Venda;
  }

  public void setValor_Venda(Double valor_Venda) {
    this.valor_Venda = valor_Venda;
  }

  public Double getValor_Compra() {
    return valor_Compra;
  }

  public void setValor_Compra(Double valor_Compra) {
    this.valor_Compra = valor_Compra;
  }

  public static void main(String[] args) {
    Peca p1 = new Peca("Motor", "Motor de arranque titan 150", "JUEIUR89989", 123.90, 200.00);
    //
    Estoque.getInstance().inserePeca(p1, 1);
    System.out.println("Quantidade de pecas: " + Estoque.getInstance().quantPecas());
  }
}
