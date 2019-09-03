package Dominio;

import java.util.Comparator;

/**
 * ================== Comparador de pecas em ordem alfabetica ========== Serve para ordenar as pecas
 * em ordem alfabética pelo nome da peca por meio de um método bem simples comparando cada peca
 */
public class ComparadorDePecas implements Comparator<Peca> {

  @Override
  public int compare(Peca o1, Peca o2) {
    return o1.getNome().compareTo(o2.getNome());
  }
}
