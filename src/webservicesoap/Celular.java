package webservicesoap;

public class Celular {
	private int numSerie;
	private String modelo;
	private String sistema;
	private String cor;

	private String CAMPO_VAZIO = "O campo não pode estar vazio!";

	public Celular(int numSerie, String modelo, String sistema, String cor) throws Exception {
		this.numSerie = numSerie;
		setModelo(modelo);
		setSistema(sistema);
		setCor(cor);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) throws Exception {
		if (modelo.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else {
			this.modelo = modelo;
		}
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) throws Exception {
		if (modelo.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else {
			this.sistema = sistema;
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) throws Exception {
		if (cor.isEmpty()) {
			throw new Exception(CAMPO_VAZIO);
		} else {
			this.cor = cor;
		}

	}
}
