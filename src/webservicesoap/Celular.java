package webservicesoap;

import java.util.List;

public class Celular {
	private int id;
	private String modelo;
	private String sistema;
	private String cor;
	private List<Aplicativo> aplicativos;

	private String CAMPO_VAZIO = "O campo não pode estar vazio!";

	public Celular(int id, String modelo, String sistema, String cor) throws Exception {
		setId(id);
		setModelo(modelo);
		setSistema(sistema);
		setCor(cor);
	}

	public void addAplicativo(Aplicativo aplicativo) {
		if (aplicativo != null)
			aplicativos.add(aplicativo);
	}

	public List<Aplicativo> getAplicativos() {
		return aplicativos;
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

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
