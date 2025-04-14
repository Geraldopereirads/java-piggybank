package moedas;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> MoedasList;

	public Cofrinho() {
		this.MoedasList = new ArrayList<>();
	}

	public void adicionar(Moeda add) {
		this.MoedasList.add(add);
	}
	
	public void remover (Moeda moeda) {
		this.MoedasList.remove(moeda);
	}

	public void moedasList() {

		if (this.MoedasList.isEmpty()) {
			System.out.println("Cofrinho vazio!");

		} else {

			for (Moeda moeda : this.MoedasList) {
				moeda.info();
			}
		}

	}

	public double totalConvertido() {
		if (this.MoedasList.isEmpty()) {
			return 0;
		}

		double valorAcumulado = MoedasList.stream().map(m -> m.converter()).reduce(0.0, (a, b) -> a + b);

		return valorAcumulado;
	}
}
