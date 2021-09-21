package webservicesoap;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "webservicesoap.AplicativoInterface")
public class AplicativoController implements AplicativoInterface {
	private List<Aplicativo> aplicativos;

	public AplicativoController() throws Exception {
		montaListaAplicativos();
	}

	public List<Aplicativo> getAplicativos() {
		return aplicativos;
	}

	public Aplicativo getAplicativo(int id) {
		return aplicativos.get(id);
	}

	public Aplicativo postAplicativo(Aplicativo aplicativo) {
		aplicativos.add(aplicativo);
		return aplicativo;
	}

	public Aplicativo updateAplicativo(Aplicativo aplicativo) {
		aplicativos.add(aplicativo);
		return aplicativo;
	}

	public Aplicativo removeAplicativo(int id) {
		Aplicativo celularRemovido = aplicativos.get(id);
		aplicativos.remove(id);
		return celularRemovido;
	}

	private List<Aplicativo> montaListaAplicativos() throws Exception {

		aplicativos.add(new Aplicativo(1, "Uber", "Mapas e Navegação", 4.4F, "1.0"));
		aplicativos.add(new Aplicativo(2, "Candy Crush", "‎Jogos", 5.0F, "3.5"));
		aplicativos.add(new Aplicativo(3, "TikTok", "‎Redes Sociais", 3.5F,"‎4.15"));

		return aplicativos;
	}
}
