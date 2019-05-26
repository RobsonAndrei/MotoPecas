package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Caderninho {
  private static Caderninho ourInstance = new Caderninho();

  private static Date data;

  private String dataString;

  private static HashMap<String, Cliente> listaDeClientesData;

  public static Caderninho getInstance() {
    listaDeClientesData = new HashMap<>();
    return ourInstance;
  }

  private Caderninho() {}

  public void inserirCliente(Cliente _cli) {
    for (int i = 0; i < listaDeClientesData.size(); i++) {
      if (!listaDeClientesData.containsValue(_cli.getCpf())) {

        this.data = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.dataString = dateFormat.format(data);

        listaDeClientesData.put(dataString, _cli);

      } else {
        System.out.println("Este cliente já esta no caderno, escolha a opção ATUALIZAR");
      }
    }
  }

  public String atualizarCaderno(Cliente _cli, Double valor) {
    String msn = "";
    for (int i = 0; i < listaDeClientesData.size(); i++) {
      //
      if (listaDeClientesData.containsValue(_cli.getCpf())) {
        listaDeClientesData.get(dataString).pendurar(valor);

        msn = msn + "Saldo a pagar atualizado com sucesso!";
      }
    }

    return msn;
  }

  public String getDataString() {
    return dataString;
  }

  public void setDataString(String dataString) {
    this.dataString = dataString;
  }

  public void mostrarCaderno(){
    for (int i = 0; i < listaDeClientesData.size(); i++) {
      System.out.println("Mostra ou não mostra?");
      System.out.println(listaDeClientesData.get(dataString).getNome()+ " "+ listaDeClientesData.get(dataString).getSaldo_a_pagar());
    }
  }

  public static void main(String[] args) {
    System.out.println("Iniciando");
    Caderninho cad = Caderninho.getInstance();

    Cliente c = new Cliente("Carlos", "17273873847", " 998 948 948", "Tv Paisandu, 34");
    System.out.println(c.getSaldo_a_pagar());
    c.setSaldo_devedor(true);
    c.pendurar(250.0);
    System.out.println(c.getSaldo_a_pagar());
    c.pendurar(250.0);
    System.out.println(c.getSaldo_a_pagar());

    cad.inserirCliente(c);

    cad.atualizarCaderno(c, 250.0);

    cad.mostrarCaderno();
  }
}
