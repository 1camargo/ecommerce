package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.ProdutoRoupas;


public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		ProdutoRoupas r1 = new ProdutoRoupas("Camiseta", "Roupa", "Nike", "Unissex", "Larnaja", "StreetWear", "Skate", "GG");
		
		r1.visualizar();

		while (true) {

			System.out.println("\n*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                  ECOMMERCE FUTURO                   *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*            1 - Cadastrar Produto                    *");
			System.out.println("*            2 - Listar todos os Produtos             *");
			System.out.println("*            3 - Atualizar os Produtos                *");
			System.out.println("*            4 - Deletar um Produto                   *");
			System.out.println("*            0 - Sair                                 *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("\nEntre com a opção desejada:                            ");
			System.out.println("                                                       ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite apenas valores inteiros, conforme o menu!");
				leia.nextLine();
				opcao = -1;
			}

			if (opcao == 0) {
				System.out.println("\n\nEcommerce Futuro - Agradece a prefêrencia, volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				break;

			case 2:
				System.out.println("Listar todos os Produtos\n\n");

				break;

			case 3:
				System.out.println("Atualizar os Produtos\n\n");

				break;

			case 4:
				System.out.println("Deletar um Produto\n\n");

				break;

			default:
				System.out.println("\nOpção inválida!");

				break;

			}

		}
	}

	public static void keyPress() {

		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter.");
		}
	}

	public static void sobre() {
		System.out.println("\n\n***********************************************************");
		System.out.println("*                Projeto Desenvolvido por:                *");
		System.out.println("*                                                         *");
		System.out.println("*  Gabriel Camargo Braz de Almeida - camargoxg@gmail.com  *");
		System.out.println("*  github.com/1camargo                                    *");
		System.out.println("***********************************************************");
	}
}
