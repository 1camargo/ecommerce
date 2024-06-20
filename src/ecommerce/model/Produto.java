package ecommerce.model;

public abstract class Produto {

	private String nomeProduto;
	private String tipoProduto;
	private int codigoProduto;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Produto(String nomeProduto, String tipoProduto, int codigoProduto) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.codigoProduto = codigoProduto;
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

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("*                    Dados do Produto                     *");
		System.out.println("***********************************************************");
		System.out.println("\nNome do Produto: " + this.nomeProduto);
		System.out.println("Tipo do Produto: " + this.tipoProduto);
		System.out.println("Código do Produto: " + this.codigoProduto);

	}

}
