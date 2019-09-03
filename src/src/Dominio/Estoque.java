package Dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Estoque {

	/**
	 * // ======================= Singleton =====================================
	 */
	private static List<Peca> listaDePecas;

	private static Estoque instancia;

	public static synchronized Estoque getInstance() {
		if (instancia == null) {
			instancia = new Estoque();
			listaDePecas = new ArrayList<Peca>();
		}
		return instancia;
	}

	private Estoque() {
	}

	public int quantPecas() {
		return listaDePecas.size();
	}

	public void inserePeca(Peca peca, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			listaDePecas.add(peca);
		}
	}

	public String mostrarListaPecas() {
		String msn = "";
		for (Peca p : listaDePecas) {

			msn = msn + p.getCodigo() + " " + p.getNome() + " " + p.getValor_Venda() + "\n";
		}

		return msn;
	}

	public void ordenar() {
		Collections.sort(listaDePecas, new ComparadorDePecas());
	}

	public void retiraPeca(Peca peca) {
		listaDePecas.remove(peca);
	}

	public List<Peca> getLista() {
		return listaDePecas;
	}

	public static void main(String[] args) throws Exception {
		Estoque.getInstance();
		Peca p1 = new Peca("Freio", "Freio Titan 2008 - 2019", "0012", 20.34, 30.90);
		Peca p2 = new Peca("Relação", "Relação Titan 2008 - 2019", "0013", 65.34, 70.78);
		Peca p3 = new Peca("Sinaleira", "Sinaleira Honda Broz 2008 - 2019", "00ASk99", 15.34, 20.34);
		Peca p4 = new Peca("Banco", "Banco Titan 2008 - 2019", "034", 54.34, 65.90);
		Peca p5 = new Peca("Guidão", "Banco", "YYYR2324", 1223.43, 1300.00);

		Estoque.getInstance().inserePeca(p1, 2);
		Estoque.getInstance().inserePeca(p2, 1);
		Estoque.getInstance().inserePeca(p3, 2);
		Estoque.getInstance().inserePeca(p4, 1);
		Estoque.getInstance().inserePeca(p5, 1);

		System.out.println("Mostrando");
		System.out.println(Estoque.getInstance().mostrarListaPecas());
		Estoque.getInstance().ordenar();
		System.out.println(Estoque.getInstance().mostrarListaPecas());

		System.out.println(Estoque.getInstance().quantPecas());
	}
}
