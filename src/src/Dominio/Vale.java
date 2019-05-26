package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vale {

  private Double valor;
  private Date data;
  private String dataStrin;

  public Vale(Double _valor) {
    this.valor = _valor;
    this.data = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    this.dataStrin = dateFormat.format(data);
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public String getDataStrin() {
    return dataStrin;
  }

  public void setDataStrin(String dataStrin) {
    this.dataStrin = dataStrin;
  }
}
