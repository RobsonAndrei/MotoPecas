package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Venda {

  private List<Peca> listaDePecas;
  private Date data;
  private String dataStrin;
  private String identificador;
  private Double valorDaVenda;

  /**============================= CONSTRUTOR ======================================================
   * Recebe como parametro uma lista de peças e uma String com o código identificador da venda para
   * caso necessário buscar esta venda, na instancia é setado a data da criação de cada venda
   */
  public Venda(List<Peca> pecas, String _cod) {
    this.listaDePecas = pecas;
    this.identificador = _cod;
    this.data = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    this.dataStrin = dateFormat.format(data);
  }//===============================================================================================

  /**============================= CONSTRUTOR QUE RECEBE UM ORÇAMENTO POR PARAMETRO ================
   * Recebe como parametro uma lista de peças e uma String com o código identificador da venda para
   * caso necessário buscar esta venda, na instancia é setado a data da criação de cada venda
   */
  public Venda(Orcamento orc, String _cod) {
    this.listaDePecas = orc.getPecas();
    this.identificador = _cod;
    this.data = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    this.dataStrin = dateFormat.format(data);
    this.valorDaVenda = orc.getValorTotalOrcamento();
  }//===============================================================================================

  /**============================= GET LISTA DE PEÇAS ==============================================
   * Retorna a lista de peças desta venda
   *
   */
  public List<Peca> getListaDePecas() {
    return listaDePecas;
  }//===============================================================================================

  /**============================= SET LISTA DE PEÇAS ==============================================
   * Altera a lista de peças da venda pela lista recebida por parametro
   *
   */
  public void setListaDePecas(List<Peca> listaDePecas) {
    this.listaDePecas = listaDePecas;
  }//===============================================================================================

  /**============================= GET DATA ========================================================
   * Pega a data do sistema
   *
   */
  public Date getData() {
    return data;
  }//===============================================================================================

  /**============================= SET DATA ========================================================
   * Altera a data da venda
   *
   */
  public void setData(Date data) {
    this.data = data;
  }//===============================================================================================

    /**============================= GET DATA STRING ===============================================
   * Este método retorna a string com a data no formato dia mês ano e a hora da criação
   *
   */
  public String getDataStrin() {
    return dataStrin;
  }//===============================================================================================

  /**============================= GET IDENTIFICADOR ===============================================
   * Este método retorna a string com o identificador da venda
   *
   */
  public String getIdentificador() {
    return identificador;
  }//===============================================================================================

  /**============================= SET IDENTIFICADOR ===============================================
   * Este método altera o código da venda
   *
   */
  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }//===============================================================================================

  /**============================= GET VALOR DA VENDA ==============================================
   * Este método retorna a o valor da venda, busca dodos os itens da lista de peças, e soma o valor
   * de venda dos peças (Terminar)
   *
   */
  public Double getValorDaVenda() {
    return valorDaVenda;
  }//===============================================================================================


  /**============================= SET VALOR DA VENDA ==============================================
   * Este método altera o valor total desta venda - caso seje necessário
   */
  public void setValorDaVenda(Double valorDaVenda) {
    this.valorDaVenda = valorDaVenda;
  }//===============================================================================================
}
