package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	int opcao;

	public Menu() {
	}

	public void MenuPrincipal() {
		System.out.println("Cofrinho: ");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moeda:");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar:");
		String opcao = sc.next();

		switch (opcao) {
		case "0":
			System.out.println("Programa finalizado!");
			break;
		case "1":
			// adicionar
			break;
		case "2":
			// remover
			break;
		case "3":
			// listar
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
