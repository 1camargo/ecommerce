package ecommerce.controller;

import java.util.ArrayList;
import java.util.Optional;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int codigo = 0;

	@Override
	public void procurarPorCodigo(int codigo) {
		Optional<Produto> procurarPorCodigo = buscarNaCollection(codigo);

		if (procurarPorCodigo.isPresent()) {
			Produto produto = procurarPorCodigo.get();
			produto.visualizar();
		} else
			System.out.println("\nO Produto não foi localizado!");

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto: " + produto.getNome() + " com o Código: " + produto.getCodigo()
				+ " cadastrado com sucesso!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigo());

		if (buscaProduto.isPresent()) {
			listaProdutos.add(produto);
			System.out.println("\nO Produto código: " + produto.getCodigo() + " foi alterado com sucesso!");
		} else
			System.out.println("\nO Produto código: " + produto.getCodigo() + " não foi localizado!");

	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);

		if (produto.isPresent()) {
			if (listaProdutos.remove(produto.get()) == true)
				System.out.println("\nO Produto com código: " + codigo + " foi deletado com sucesso!");
		} else
			System.out.println("\nO Produto com código: " + codigo + " não foi localizado!");

	}

	public int gerarCodigo() {
		return ++codigo;

	}

	public Optional<Produto> buscarNaCollection(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return Optional.of(produto);
			}
		}

		return Optional.ofNullable(null);
	}

}
