package ecommerce.model;

public class ProdutoRoupas extends Produto {

	private String marca;
	private String genero;
	private String cor;
	private String estilo;
	private String estampa;
	private String tamanho;

	public ProdutoRoupas(String nomeProduto, String tipoProduto, int codigoProduto, String marca, String genero, String cor, String estilo,
			String estampa, String tamanho) {
		super(nomeProduto, tipoProduto, codigoProduto);
		this.marca = marca;
		this.genero = genero;
		this.cor = cor;
		this.estilo = estilo;
		this.estampa = estampa;
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.marca);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Cor: " + this.cor);
		System.out.println("Estilo: " + this.estilo);
		System.out.println("Estampa: " + this.estampa);
		System.out.println("Tamanho: " + this.tamanho);
	}

}
