package moedas;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.9;
	}

	@Override
	public boolean equals(Object objeto) {

		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDolar = (Dolar) objeto;

		if (this.valor != objetoDolar.valor) {
			return false;
		}
		return true;
	}

}
