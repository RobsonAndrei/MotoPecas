package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {


  private static Estoque ourInstance;

  private static List<Peca> listaDePecas;

  public static synchronized Estoque getInstance() {
    if (ourInstance == null) {
      listaDePecas = new ArrayList<>();
      ourInstance = new Estoque();
    }
    return ourInstance;
  }

  private Estoque() {}

  public void inserePeça(Peca peca, int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      listaDePecas.add(peca);
    }
  }

  public String mostrarListaPecas(String ch){
    String msn = "";
   for (Peca p :listaDePecas ) {
       if(p.getNome().equals(ch)){
         msn = msn+ p.getCodigo()+" "+ p.getNome()+" "+p.getValor_Venda();
       }
   }



    return msn;
  }

  public void retiraPeca(Peca peca){
    listaDePecas.remove(peca);
  }

  public List<Peca> getLista(){
    return listaDePecas;
  }

  public static void main(String[] args) throws Exception {
    Estoque est = getInstance();
    Peca p1 = new Peca("Freio", "Freio Titan 2008 - 2019", "0012", 24.50, 20.34);
    Peca p2 = new Peca("Relação", "Relação Titan 2008 - 2019", "0013", 95.50, 65.34);
    Peca p3 = new Peca("Sinaleira", "Sinaleira Honda Broz 2008 - 2019", "00ASk99", 30.50, 15.34);
    Peca p4 = new Peca("Banco", "Banco Titan 2008 - 2019", "034", 67.50, 54.34);

    est.inserePeça(p1, 2);
    est.inserePeça(p2, 1);
    est.inserePeça(p3, 2);
    est.inserePeça(p4, 1);

    System.out.println("Mostrando");
    System.out.println(est.mostrarListaPecas("B"));
  }


}
