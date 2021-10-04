package webservicesoap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "webservicesoap.CelularInterface")
public class CelularController implements CelularInterface{

	private List<Celular> celulares = new ArrayList<>();;

	public CelularController() throws Exception {
		montaListaCelulares();
	}

	public List<Celular> getCelulares() {
		return celulares;
	}

	public Celular getCelular(int id) {
        for(Celular celular : celulares) {
            if(celular.getId() == id) {
                return celular;
            }
        }
        return null;
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
		Celular celularRemovido = getCelular(id);
		celulares.remove(celularRemovido);
		return celularRemovido;
	}
	
	public List<Aplicativo> addAplicativo(int celularId, Aplicativo aplicativo){
		Celular celular = celulares.get(celularId);
		celular.addAplicativo(aplicativo);
		
		return celular.getAplicativos();
	}
	
	public List<Aplicativo> removeAplicativo(int celularId, int aplicativoId){
		Celular celular = celulares.get(celularId);
		List<Aplicativo> aplicativos = celular.getAplicativos();	
		
		aplicativos.remove(aplicativoId);		
		return celular.getAplicativos();
	}

	private List<Celular> montaListaCelulares() throws Exception {

		celulares.add(new Celular(1, "Xiaomi Redmi 9A", "Android 10.0", "‎Preto"));
		celulares.add(new Celular(2, "ASUS Zenfone Shot Plus", "‎Android 8.0", "‎Vermelho"));
		celulares.add(new Celular(3, "Smartphone One Vision", "‎Android", "‎Azul Safira"));

		return celulares;
	}
}
