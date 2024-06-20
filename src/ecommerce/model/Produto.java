package ecommerce.model;

public abstract class Produto {
	
	private String nomeProduto;
	private String tipoProduto;
	
	public Produto(String nomeProduto, String tipoProduto) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public String getTipoProduto() {
		return tipoProduto;
	}



	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}



	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("*                    Dados do Produto                     *");
		System.out.println("***********************************************************");
		System.out.println("\nNome do Produto: " + this.nomeProduto);
		System.out.println("Tipo do Produto: " + this.tipoProduto);

	}

}
