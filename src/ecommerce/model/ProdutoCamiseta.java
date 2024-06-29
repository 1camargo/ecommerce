package ecommerce.model;

public class ProdutoCamiseta extends Produto {

	private String gola;
	private String compManga;

	public ProdutoCamiseta(int codigo, String nome, int tipo, String marca, String genero, String cor, String tamanho,
			String estilo, String tecido, float valor, String gola, String compManga) {
		super(codigo, nome, tipo, marca, genero, cor, tamanho, estilo, tecido, valor);
		this.gola = gola;
		this.compManga = compManga;
	}

	public String getGola() {
		return gola;
	}

	public void setGola(String gola) {
		this.gola = gola;
	}

	public String getCompManga() {
		return compManga;
	}

	public void setCompManga(String compManga) {
		this.compManga = compManga;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Gola: " + this.gola);
		System.out.println("Comprimento da Manga: " + this.compManga);

	}

}
