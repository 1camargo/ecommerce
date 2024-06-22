package ecommerce.model;

public abstract class Produto {

	private int codigo;
	private String nome;
	private int tipo;
	private String marca;
	private String genero;
	private String cor;
	private String tamanho;
	private String estilo;
	private String tecido;
	private float valor;

	public Produto(int codigo, String nome, int tipo, String marca, String genero, String cor, String tamanho,
			String estilo, String tecido, float valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.genero = genero;
		this.cor = cor;
		this.tamanho = tamanho;
		this.estilo = estilo;
		this.tecido = tecido;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Camiseta";
			break;

		case 2:
			tipo = "Calça";
			break;
		}

		System.out.println("\n***********************************************************");
		System.out.println("*                   Dados do " + this.codigo + "º Produto                   *");
		System.out.println("***********************************************************");
		System.out.println("\nCódigo do Produto: " + this.codigo);
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Estilo: " + this.estilo);
		System.out.printf("Valor: R$%.2f \n" , this.valor);

	}

}
