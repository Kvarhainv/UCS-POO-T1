package com.project.menu;
import java.util.Scanner;

public class Menu {
	
	private static Scanner scanner;
	
	public void display() {
		int userInput = 0;
		scanner = new Scanner(System.in);
		
		while (userInput != 5) {
			System.out.println("---------------------------------------------");
			System.out.println("Universidade a Esperança é a Última que Morre");
			System.out.println("---------------------------------------------");
			System.out.println("Escolha a opção:");
			System.out.println(" 1 - Listagem de turmas;");
			System.out.println(" 2 - Inserir uma turma;");
			System.out.println(" 3 - Consultar turma;");
			System.out.println(" 4 - Consultar estatísticas gerais;");
			System.out.println(" 5 - Sair do Sistema");
			System.out.println("---------------------------------------------");
			userInput = scanner.nextInt();
//			scanner.nextLine();
			System.out.println("---------------------------------------------");
		}
	}
}
