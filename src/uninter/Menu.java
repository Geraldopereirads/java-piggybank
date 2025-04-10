package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	int opcao;
	
	public void MenuPrincipal( ) {
		System.out.println("Cofrinho: ");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moeda:");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar:");
		opcao = sc.nextInt();
		
		while(opcao != 0) {
			
			switch(opcao) {
			case 1:
				//Adcionar
				break;
				
			case 2:
				//Remover
				break;
			case 3:
				//Listar
				break:
			case 4:
				//Calcular
				break;
			default:
				System.out.println("Opção invalida!");
			}
	}
}
