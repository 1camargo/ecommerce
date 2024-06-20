package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {

	public void cadastrar(Produto produto);
	public void listarTodos();
	public void atualizar(Produto produto);
	public void deletar(int numero);
}
