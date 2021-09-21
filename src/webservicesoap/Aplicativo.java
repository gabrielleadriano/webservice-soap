package webservicesoap;

public class Aplicativo {

	private int id;
	private String nome;
	private String categoria;
	private float classificacao;
	private String versao;

	private String CAMPO_VAZIO = "O campo não pode estar vazio!";

	public Aplicativo(int id, String nome, String categoria, float classificacao, String versao ) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) throws Exception {
		if (categoria.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else if (categoria.matches(".*\\d.*")) {
			throw new IllegalArgumentException("O campo não pode conter números!");
		} else {
			this.categoria = categoria;
		}
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(float classificacao) throws Exception {
		if (classificacao == 0) {
			throw new Exception(CAMPO_VAZIO);
		} else {
			this.classificacao = classificacao;
		}
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) throws Exception {
		if (categoria.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else if (categoria.matches(".*\\d.*")) {
			throw new IllegalArgumentException("O campo não pode conter números!");
		} else {
			this.versao = versao;
		}
	}

}