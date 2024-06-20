package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.*;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, codigo;
		String nomeProduto, tipoProduto, marca, genero, cor, estilo, estampa, tamanho;

		while (true) {

			System.out.println("\n*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                  E-COMMERCE FUTURO                  *");
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
				System.out.println("\n\nE-commerce Futuro - Agradecemos a prefêrencia, volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();

				System.out.println("\nDigite o tipo do Produto: ");
				tipoProduto = leia.nextLine();

				System.out.println("\nDigite a marca: ");
				marca = leia.nextLine();

				System.out.println("\nDigite o gênero: ");
				genero = leia.nextLine();

				System.out.println("\nDigite o estilo: ");
				estilo = leia.nextLine();

				System.out.println("\nDigite a cor: ");
				cor = leia.nextLine();

				System.out.println("\nDigite a estampa: ");
				estampa = leia.nextLine();

				System.out.println("\nDigite o tamanho: ");
				tamanho = leia.nextLine();

				produtos.cadastrar(new ProdutoRoupas(nomeProduto, tipoProduto, produtos.gerarCodigo(), marca, genero,
						estilo, cor, estampa, tamanho));

				keyPress();
				break;

			case 2:
				System.out.println("\nListar todos os Produtos\n\n");
				produtos.listarTodos();

				keyPress();
				break;

			case 3:
				System.out.println("\nAtualizar os Produtos\n\n");

				System.out.println("Digite o código do Produto: ");
				codigo = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(codigo);

				if (buscaProduto != null) {
					System.out.println("\nDigite o nome do Produto: ");
					leia.skip("\\R?");
					nomeProduto = leia.nextLine();

					System.out.println("\nDigite o tipo do Produto: ");
					tipoProduto = leia.nextLine();

					System.out.println("\nDigite a marca: ");
					marca = leia.nextLine();

					System.out.println("\nDigite o gênero: ");
					genero = leia.nextLine();

					System.out.println("\nDigite o estilo: ");
					estilo = leia.nextLine();

					System.out.println("\nDigite a cor: ");
					cor = leia.nextLine();

					System.out.println("\nDigite a estampa: ");
					estampa = leia.nextLine();

					System.out.println("\nDigite o tamanho: ");
					tamanho = leia.nextLine();

					produtos.atualizar(new ProdutoRoupas(nomeProduto, tipoProduto, codigo, marca, genero, estilo, cor,
							estampa, tamanho));
				} else {
					System.out.println("\nO Produto não foi localizado!");
				}

				keyPress();
				break;

			case 4:
				System.out.println("\nDeletar um Produto\n\n");

				System.out.println("Digite o código do Produto: ");
				codigo = leia.nextInt();

				produtos.deletar(codigo);

				keyPress();
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
