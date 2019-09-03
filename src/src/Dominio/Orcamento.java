package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orcamento {

	private List<Peca> pecas;
	private Date data_inicial, data_validade;
	private String _dataString;
	private String codigo;

	/**
	 * ============================= CONSTRUTOR
	 * ====================================================== Construtor recebe como
	 * parametro um código para o orçamento, uma string e também quarda a data o
	 * momento que iniciou o orçamento, nos planejamentos cada orçamento irira durar
	 * 3 dias instancia a lista de peças
	 */
	public Orcamento(String _cod) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.codigo = _cod;
		this.data_inicial = new Date();
		this._dataString = dateFormat.format(data_inicial);
		this.pecas = new ArrayList<>();
	} // ===============================================================================================

	/**
	 * =============================== INSERE PEÇAS
	 * ==================================================== Este método adiciona as
	 * peças do orçamento na lista, recebe o parametro da quantidade de paças também
	 */
	public void adicionaPeca(Peca p, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			pecas.add(p);
		}
	} // ===============================================================================================

	/**
	 * =============================== GET PEÇAS
	 * ======================================================= Este método adiciona
	 * as peças do orçamento
	 */
	public List<Peca> getPecas() {
		return pecas;
	} // ===============================================================================================

	/**
	 * =============================== SET LISTA DE PEÇAS
	 * ============================================== Este método altera a lista de
	 * peças
	 */
	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	} // ===============================================================================================

	/**
	 * =============================== GET DATA INICIAL
	 * ================================================ Este método retorna a data
	 * da criação do orçamento
	 */
	public Date getData_inicial() {
		return data_inicial;
	} // ===============================================================================================

	/**
	 * =============================== SET DATA INICIAL
	 * ================================================ Este método altera a data de
	 * inicio do orçamento caso necessite
	 */
	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	} // ===============================================================================================

	/**
	 * =============================== GET DATA DE VALIDADE DO ORÇAMENTO
	 * =============================== Este método retorna a data de validade do
	 * orçamento
	 */
	public Date getData_validade() {
		return data_validade;
	} // ===============================================================================================

	/**
	 * =============================== SET DATA DE VALIDADE DO ORÇAMENTO
	 * =============================== Este método altera a data de validade do
	 * orçamento
	 */
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	} // ===============================================================================================

	/**
	 * =============================== GET CÓDIGO DO ORÇAMENTO
	 * ========================================= Este método retorna o código do
	 * orçamento
	 */
	public String getCodigo() {
		return codigo;
	} // ===============================================================================================

	/**
	 * =============================== SET CÓDIGO
	 * ====================================================== Este método altero o
	 * código do orçamento
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	} // ===============================================================================================

	/**
	 * =============================== GET DATA STRING
	 * ================================================= Este método retorna a data
	 * no formato padrão
	 */
	public String get_dataString() {
		return _dataString;
	} // ===============================================================================================

	/**
	 * ============================= SET DATA STRING
	 * =================================================== Este método altera a data
	 */
	public void set_dataString(String _dataString) {
		this._dataString = _dataString;
	} // ===============================================================================================

	/**
	 * ============================= GET VALOR TOTAL DO ORÇAMENTO
	 * ====================================== Este método retirna o valor total da
	 * lista de peças, o valor de venda, o total das somas das peças
	 */
	public Double getValorTotalOrcamento() {
		Double value = 0.0;

		for (Peca p : pecas) {
			value = value + p.getValor_Venda();
		}
		return value;

	} // ===============================================================================================

}
