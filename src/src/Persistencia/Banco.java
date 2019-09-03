package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {

  private Connection con = null;
  private String hostName = null;
  private String userName = null;
  private String password = null;
  private String url = null;
  private String jdbDriver = null;
  private String dataBaseName = null;
  private String dataBasePrefix = null;
  private String dataBasePort = null;

  public Banco() {
    super();
    /**
     * ========================================================================================= Os
     * dados setados abaixo servem para uma conexão em MySQL. Altere de acordo com o seu BD.
     * Aconselhamos carregar estes dados de um arquivo.
     * =========================================================================================
     */

    // "jdbc: mysql:/localhost:3306/meu_bc";
    hostName = "localhost";
    userName = "ratonmotos";
    password = "equipe06";
    jdbDriver = "org.gjt.mm.mysql.Driver";
    dataBaseName = "meu_bd";
    dataBasePrefix = "jdbc:mysql:/";
    dataBasePort = "3306";

    url = dataBasePrefix + hostName + ":" + dataBasePort + "/" + dataBaseName + "/";
    /**
     * * =========================================================================================
     * Exemplo de um URL completo para MySQL: a concatenacao acima deve ficar algo como: jdbc:
     * 'mysql:/localhost:3306/meu_bd'
     * =========================================================================================
     */
  }
  /**
   * =========================================================================================
   * Retorna uma java.sql.Connection.
   *
   * @return con
   *     =========================================================================================
   */
  public Connection getConnection() {
    try {
      if (con == null) {
        Class.forName(jdbDriver);
        con = DriverManager.getConnection(url, userName, password);
      } else if (con.isClosed()) {
        con = null;
        return getConnection();
      }

    } catch (ClassNotFoundException e) {
      // TODO: use um sistema de log apropriado.
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO: use um sistema de log apropriado.
      e.printStackTrace();
    }
    return con;
  }

  /**
   * * =========================================================================================
   * métodod a seguir fecha a conexao com o Banco de Dados;
   * =========================================================================================
   */
  public void closeConnection() {
    if (con != null) {
      try {
        con.close();
      } catch (SQLException e) {
        // TODO: use um sistema de log apropriado.
        e.printStackTrace();
      }
    }
  }
}
