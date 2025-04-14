package menu;

import java.util.Scanner;

import moedas.Cofrinho;
import moedas.Dolar;
import moedas.Euro;
import moedas.Real;

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
			adicionarMoedasMenu();
			MenuPrincipal();

			break;
		case "2":
			removerMoedasMenu();
			MenuPrincipal();
			break;
		case "3":
			cofrinho.moedasList();
			MenuPrincipal();
			break;
		case "4":
			double valorConvertido = cofrinho.totalConvertido();
			System.out.printf("O total convertido para real ? %.2f\n", valorConvertido);
			MenuPrincipal();
			break;
		default:
			System.out.println("Opção inválida");
			MenuPrincipal();
			break;
		}

	}
	private void removerMoedasMenu() {
		System.out.println("Escolha uma Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		int opcaoMoeda = sc.nextInt();

		System.out.println("Digite um valor: ");
		float valor = sc.nextFloat();

		if (opcaoMoeda == 1) {
			Real real = new Real(valor);
			cofrinho.remover(real);
		} else if (opcaoMoeda == 2) {
			Dolar dolar = new Dolar(valor);
			cofrinho.remover(dolar);
		} else if (opcaoMoeda == 3) {
			Euro euro = new Euro(valor);
			cofrinho.remover(euro);
		} else {
			System.out.println("Moeda inválida!");
			MenuPrincipal();
		}

		System.out.println("Moeda Removida!");

	};

	private void adicionarMoedasMenu() {
		System.out.println("Escolha uma Moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		int opcaoMoeda = sc.nextInt();

		System.out.println("Digite um valor: ");
		float valor = sc.nextFloat();

		if (opcaoMoeda == 1) {
			Real real = new Real(valor);
			cofrinho.adicionar(real);
		} else if (opcaoMoeda == 2) {
			Dolar dolar = new Dolar(valor);
			cofrinho.adicionar(dolar);
		} else if (opcaoMoeda == 3) {
			Euro euro = new Euro(valor);
			cofrinho.adicionar(euro);
		} else {
			System.out.println("Moeda inválida!");
			MenuPrincipal();
		}

		System.out.println("Moeda adicionada!");

	}
};
