package menu;

import java.util.Scanner;

import uninter.Cofrinho;
import uninter.Dolar;
import uninter.Euro;
import uninter.Moeda;
import uninter.Real;

public class Menu {

	private Scanner sc;
	private Cofrinho cofrinho;

	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void MenuPrincipal() {
		System.out.println("Cofrinho: ");
		System.out.println("1-Adicionar moeda: ");
		System.out.println("2-Remover moeda: ");
		System.out.println("3-Listar moeda: ");
		System.out.println("4-Calcular valor total convertido para real: ");
		System.out.println("0-Encerrar: ");
		String opcao = sc.next();

		switch (opcao) {
		case "0":
			System.out.println("Programa finalizado!");
			break;
		case "1":
			System.out.println("Escolha uma Moeda: ");
			System.out.println("1 - Real: ");
			System.out.println("2 - Dólar: ");
			System.out.println("3 - Euro: ");
			int opcaoMoeda = sc.nextInt();

			System.out.println("Digite um valor: ");
			double valor = sc.nextFloat();

			if (opcaoMoeda == 1) {
				Moeda real = new Real(opcaoMoeda);
				cofrinho.adicionar(real);
			} else if (opcaoMoeda == 2) {
				Moeda dolar = new Dolar(opcaoMoeda);
				cofrinho.adicionar(dolar);
			} else if (opcaoMoeda == 3) {
				Moeda euro = new Euro(opcaoMoeda);
				cofrinho.adicionar(euro);
			} else {
				System.out.println("Moeda inválida!");
				MenuPrincipal();
			}

			System.out.println("Moeda adicionada!");
			MenuPrincipal();

			break;
		case "2":
			// remover
			break;
		case "3":
			cofrinho.moedasList();
			MenuPrincipal();
			break;
		case "4":
			// calcular
			break;
		default:
			System.out.println("Opção inválida");
			MenuPrincipal();
			break;
		}

	}
};
