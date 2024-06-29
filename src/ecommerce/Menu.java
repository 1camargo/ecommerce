package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.*;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, codigo, tipo;
		float valor;
		String nome, marca, genero, cor, tamanho, estilo, tecido, gola, compManga, detalhes, cintura;

		while (true) {

			System.out
					.println(Cores.TEXT_RED_BOLD_BRIGHT + "\n*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*                  " + Cores.TEXT_WHITE_BOLD + "E" + Cores.TEXT_RED_BOLD_BRIGHT + "-"
					+ Cores.TEXT_WHITE_BOLD_BRIGHT + "commerce Futuro" + Cores.TEXT_RED_BOLD_BRIGHT
					+ "                  *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out.println("*                                                     *");
			System.out.println("*            1 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Cadastrar Produto"
					+ Cores.TEXT_RED_BOLD_BRIGHT + "                    *");
			System.out.println("*            2 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Listar todos os Produtos"
					+ Cores.TEXT_RED_BOLD_BRIGHT + "             *");
			System.out.println("*            3 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Buscar Produto por Código"
					+ Cores.TEXT_RED_BOLD_BRIGHT + "            *");
			System.out.println("*            4 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Atualizar os Produtos"
					+ Cores.TEXT_RED_BOLD_BRIGHT + "                *");
			System.out.println("*            5 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Deletar um Produto"
					+ Cores.TEXT_RED_BOLD_BRIGHT + "                   *");
			System.out.println("*            0 - " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Sair" + Cores.TEXT_RED_BOLD_BRIGHT
					+ "                                 *");
			System.out.println("*                                                     *");
			System.out.println("*******************************************************");
			System.out
					.println("                                                       " + Cores.TEXT_WHITE_BOLD_BRIGHT);
			System.out.println("Entre com a opção desejada:                            " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite apenas valores inteiros, conforme o menu!");
				leia.nextLine();
				opcao = -1;
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT
						+ "\n\nE-commerce Futuro - Agradecemos a prefêrencia, volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(
						Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
				System.out.println("*                   " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Cadastrar Produtos"
						+ Cores.TEXT_RED_BOLD_BRIGHT + "                    *");
				System.out.println("***********************************************************\n" + Cores.TEXT_RESET);

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("\nDigite a marca: ");
				marca = leia.nextLine();

				System.out.println("\nDigite o gênero: ");
				genero = leia.nextLine();

				System.out.println("\nDigite a cor: ");
				cor = leia.nextLine();

				System.out.println("\nDigite o tamanho: ");
				tamanho = leia.nextLine();

				System.out.println("\nDigite o estilo: ");
				estilo = leia.nextLine();

				System.out.println("\nDigite o tecido: ");
				tecido = leia.nextLine();

				System.out.println("\nDigite o valor do Produto: (R$)");
				valor = leia.nextFloat();

				do {
					System.out.println("\nDigite o tipo do Produto: " + "\n(1 - Camiseta) ou (2 - Calça)");
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("\nDigite o estilo da gola: ");
					leia.skip("\\R?");
					gola = leia.nextLine();

					System.out.println("\nDigite o comprimento da manga: ");
					compManga = leia.nextLine();
					produtos.cadastrar(new ProdutoCamiseta(produtos.gerarCodigo(), nome, tipo, marca, genero, cor,
							tamanho, estilo, tecido, valor, gola, compManga));
				}
				case 2 -> {
					System.out.println("\nDigite os detalhes da calça: ");
					leia.skip("\\R?");
					detalhes = leia.nextLine();

					System.out.println("\nDigite a linha da cintura: ");
					cintura = leia.nextLine();
					produtos.cadastrar(new ProdutoCalca(produtos.gerarCodigo(), nome, tipo, marca, genero, cor, tamanho,
							estilo, tecido, valor, detalhes, cintura));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(
						Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
				System.out.println("*                " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Listar todos os Produtos"
						+ Cores.TEXT_RED_BOLD_BRIGHT + "                 *");
				System.out.println("***********************************************************\n" + Cores.TEXT_RESET);
				produtos.listarTodos();

				keyPress();
				break;

			case 3:
				System.out.println(
						Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
				System.out.println("*                " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Buscar Produto por Código"
						+ Cores.TEXT_RED_BOLD_BRIGHT + "                *");
				System.out.println("***********************************************************\n" + Cores.TEXT_RESET);
				System.out.println("Digite o Código do Produto: ");
				codigo = leia.nextInt();

				produtos.procurarPorCodigo(codigo);

				keyPress();
				break;

			case 4:
				System.out.println(
						Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
				System.out.println("*                  " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Atualizar os Produtos"
						+ Cores.TEXT_RED_BOLD_BRIGHT + "                  *");
				System.out.println("***********************************************************\n" + Cores.TEXT_RESET);

				System.out.println("Digite o código do Produto: ");
				codigo = leia.nextInt();

				Optional<Produto> buscaProduto = produtos.buscarNaCollection(codigo);

				if (buscaProduto.isPresent()) {

					tipo = buscaProduto.get().getTipo();

					System.out.println("\nDigite o nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println("\nDigite a marca: ");
					marca = leia.nextLine();

					System.out.println("\nDigite o gênero: ");
					genero = leia.nextLine();

					System.out.println("\nDigite a cor: ");
					cor = leia.nextLine();

					System.out.println("\nDigite o tamanho: ");
					tamanho = leia.nextLine();

					System.out.println("\nDigite o estilo: ");
					estilo = leia.nextLine();

					System.out.println("\nDigite o tecido: ");
					tecido = leia.nextLine();

					System.out.println("\nDigite o valor do Produto: (R$)");
					valor = leia.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("\nDigite o estilo da gola: ");
						gola = leia.nextLine();

						System.out.println("\nDigite o comprimento da manga: ");
						compManga = leia.nextLine();
						produtos.atualizar(new ProdutoCamiseta(codigo, nome, tipo, marca, genero, cor, tamanho, estilo,
								tecido, valor, gola, compManga));
					}

					case 2 -> {
						System.out.println("\nDigite os detalhes da calça: ");
						detalhes = leia.nextLine();

						System.out.println("\nDigite a linha da cintura: ");
						cintura = leia.nextLine();
						produtos.atualizar(new ProdutoCalca(codigo, nome, tipo, marca, genero, cor, tamanho, estilo,
								tecido, valor, detalhes, cintura));
					}
					default -> {
						System.out.println("\nTipo do Produto inválido!");
					}
					}
				} else {
					System.out.println("\nO Produto não foi localizado!");
				}

				keyPress();
				break;

			case 5:
				System.out.println(
						Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
				System.out.println("*                    " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Deletar um Produto"
						+ Cores.TEXT_RED_BOLD_BRIGHT + "                   *");
				System.out.println("***********************************************************\n" + Cores.TEXT_RESET);

				System.out.println("Digite o código do Produto: ");
				codigo = leia.nextInt();

				produtos.deletar(codigo);

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção inválida!");

				break;

			}

		}
	}

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter.");
		}
	}

	public static void sobre() {
		System.out.println(
				Cores.TEXT_RED_BOLD_BRIGHT + "\n\n***********************************************************");
		System.out.println("*                " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Projeto Desenvolvido por:"
				+ Cores.TEXT_RED_BOLD_BRIGHT + "                *");
		System.out.println("*                                                         *");
		System.out.println("*  " + Cores.TEXT_WHITE_BOLD_BRIGHT + "Gabriel Camargo Braz de Almeida "
				+ Cores.TEXT_RED_BOLD_BRIGHT + "-" + Cores.TEXT_WHITE_BOLD_BRIGHT + " camargoxg@gmail.com"
				+ Cores.TEXT_RED_BOLD_BRIGHT + "  *");
		System.out.println("*  " + Cores.TEXT_WHITE_BOLD_BRIGHT + "github.com/1camargo" + Cores.TEXT_RED_BOLD_BRIGHT
				+ "                                    *");
		System.out.println("***********************************************************");
	}
}
