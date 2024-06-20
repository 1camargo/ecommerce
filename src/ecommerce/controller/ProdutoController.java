package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int codigo = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO Produto: " + produto.getNomeProduto() + " com o Código: " + produto.getCodigoProduto() + " cadastrado com sucesso!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}
	
	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigoProduto());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto código: " + produto.getCodigoProduto() + " foi alterado com sucesso!");
		} else
			System.out.println("\nO Produto código: " + produto.getCodigoProduto() + " não foi localizado!");

	}
	
	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto número: " + numero + " foi deletado com sucesso!");
		} else 
			System.out.println("\nO Produto número: " + numero + " não foi localizado!");

	}
	
	public int gerarCodigo() {
		return ++codigo;

	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getCodigoProduto() == numero) {
				return produto;
			}
		}
		
		return null;
	}

}
