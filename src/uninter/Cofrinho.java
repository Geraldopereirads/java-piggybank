package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> MoedasList;

	public Cofrinho() {
		this.MoedasList = new ArrayList<>();
	}

	public void adicionar(Moeda add) {
		this.MoedasList.add(add);
	}

	public void moedasList() {

		if (this.MoedasList.isEmpty()) {
			System.out.println("Cofrinho vazio!");
			
		}else {
			
			for (Moeda moeda : this.MoedasList) {
				moeda.info();
			}
		}

	}

}
