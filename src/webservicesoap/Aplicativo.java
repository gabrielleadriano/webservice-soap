package webservicesoap;

import java.util.List;

public class Aplicativo{

	private int id;
	private String nome;
	private String categoria;
	private float classificacao;
	private String versao;
	private List<Celular> celulares;

	private String CAMPO_VAZIO = "O campo não pode estar vazio!";

	public Aplicativo(int id, String nome, String categoria, float classificacao, String versao) throws Exception {
		setId(id);
		setNome(nome);
		setCategoria(categoria);
		setClassificacao(classificacao);
		setVersao(versao);
	}

	public void addCelular(Celular celular) {
		celulares.add(celular);
	}

	public List<Celular> getCelulares() {
		return celulares;
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
		if (versao.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else {
			this.versao = versao;
		}
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}