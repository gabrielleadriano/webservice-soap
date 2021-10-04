package webservicesoap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "webservicesoap.AplicativoInterface")
public class AplicativoController implements AplicativoInterface {
	private List<Aplicativo> aplicativos = new ArrayList<>();

	public AplicativoController() throws Exception {
		montaListaAplicativos();
	}

	public List<Aplicativo> getAplicativos() {
		return aplicativos;
	}

	public Aplicativo getAplicativo(int id) {
        for(Aplicativo aplicativo : aplicativos) {
            if(aplicativo.getId() == id) {
                return aplicativo;
            }
        }
        return null;
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
		Aplicativo aplicativoRemovido = getAplicativo(id);
		aplicativos.remove(aplicativoRemovido);
		return aplicativoRemovido;
	}

	public List<Celular> addCelular(int aplicativoId, Celular celular) {
		Aplicativo aplicativo = aplicativos.get(aplicativoId);
		aplicativo.addCelular(celular);
		return aplicativo.getCelulares();
	}

	public List<Celular> removeCelular(int aplicativoId, int celularId) {
		Aplicativo aplicativo = aplicativos.get(aplicativoId);
		List<Celular> celulares = aplicativo.getCelulares();

		celulares.remove(celularId);
		return aplicativo.getCelulares();
	}

	private List<Aplicativo> montaListaAplicativos() throws Exception {

		aplicativos.add(new Aplicativo(1, "Uber", "Mapas e Navegação", 4.4F, "1.0"));
		aplicativos.add(new Aplicativo(2, "Candy Crush", "‎Jogos", 5.0F, "3.5"));
		aplicativos.add(new Aplicativo(3, "TikTok", "‎Redes Sociais", 3.5F, "‎4.15"));

		return aplicativos;
	}
}
