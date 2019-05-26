package Dominio;

public class Peca {

  private String nome, descricao, codigo;
  private Double valor_Venda, valor_Compra;

  /**
   * ============================= CONSTRUTOR ======================================================
   * Recebe o nome da peça, uma descrição, um código para a busca da peça, um valor de venda, e um
   * valor de compra, geralmente o valor de venda deve ser maior que o valor da compra. Colocado um
   * try cach para que o valor de venda nunca seja menor que o valor de compra.
   */
  public Peca(String nome, String descricao, String codigo, Double valor_Venda, Double valor_Compra)
      throws Exception {

    if (valor_Compra < valor_Venda) {
      this.nome = nome;
      this.descricao = descricao;
      this.codigo = codigo;
      this.valor_Venda = valor_Venda;
      this.valor_Compra = valor_Compra;
    } else {
      System.out.println(" ERRO: Valor de Compra maior que o Valor de venda!!!!! ");
    }
  }

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

  
}
