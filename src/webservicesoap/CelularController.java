package webservicesoap;

import java.util.List;

public class CelularController {

	private List<Celular> celulares;

	public CelularController() throws Exception {
		montaListaCelulares();
	}

	public List<Celular> getCelulares() {
		return celulares;
	}

	public Celular getCelular(int id) {
		return celulares.get(id);
	}

	public Celular postCelular(Celular celular) {
		celulares.add(celular);
		return celular;
	}

	public Celular updateCelular(Celular celular) {
		celulares.add(celular);
		return celular;
	}

	public Celular removeCelular(int id) {
		Celular celularRemovido = celulares.get(id);
		celulares.remove(id);
		return celularRemovido;
	}

	private List<Celular> montaListaCelulares() throws Exception {

		celulares.add(new Celular(1, "Xiaomi Redmi 9A", "Android 10.0", "‎Preto"));
		celulares.add(new Celular(2, "ASUS Zenfone Shot Plus", "‎Android 8.0", "‎Vermelho"));
		celulares.add(new Celular(3, "Smartphone One Vision", "‎Android", "‎Azul Safira"));

		return celulares;
	}
}
