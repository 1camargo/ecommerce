package ecommerce.model;

public class ProdutoCalca extends Produto {

	private String detalhes;
	private String cintura;

	public ProdutoCalca(int codigo, String nome, int tipo, String marca, String genero, String cor, String tamanho,
			String estilo, String tecido, float valor, String detalhes, String cintura) {
		super(codigo, nome, tipo, marca, genero, cor, tamanho, estilo, tecido, valor);
		this.detalhes = detalhes;
		this.cintura = cintura;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getLinhaCintura() {
		return cintura;
	}

	public void setLinhaCintura(String linhaCintura) {
		this.cintura = linhaCintura;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Detalhes: " + this.detalhes);
		System.out.println("Linha da Cintura: " + this.cintura);
	}

}
