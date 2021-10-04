package webservicesoap;

import java.util.List;

import javax.jws.WebService;
@WebService
public class ServicoSOAP{

	private AplicativoInterface aplicativo;	
	private CelularInterface celular;
	
	public ServicoSOAP() throws Exception {
		aplicativo = new AplicativoController();
		celular = new CelularController();
	}
	
	// Celular
	
	public List<Celular> getCelulares() {
		return this.celular.getCelulares();
	}
	
	public Celular getCelular(int id) {
		return this.celular.getCelular(id);
	}

	public Celular postCelular(Celular celular) {
		return this.celular.postCelular(celular);
	}

	public Celular updateCelular(Celular celular) {
		return this.celular.updateCelular(celular);
	}

	public Celular removeCelular(int id) {
		return this.celular.removeCelular(id);
	}
	
	public List<Aplicativo> addAplicativo(int celularId, Aplicativo aplicativo){
		Celular celular = getCelular(celularId);
		addCelular(aplicativo.getId(), celular);
		
		return this.celular.addAplicativo(celularId, aplicativo);
	}
	
	public List<Aplicativo> removeAplicativoCelular(int celularId, int aplicativoId){		
		removeCelularAplicativo(aplicativoId, celularId);
		
		return this.celular.removeAplicativo(celularId, aplicativoId);
	}
	
	// Aplicativo
	
	public List<Aplicativo> getAplicativos() {
		return this.aplicativo.getAplicativos();
	}

	public Aplicativo getAplicativo(int id) {
		return this.aplicativo.getAplicativo(id);
	}

	public Aplicativo postAplicativo(Aplicativo aplicativo) {
		return this.aplicativo.postAplicativo(aplicativo);
	}

	public Aplicativo updateAplicativo(Aplicativo aplicativo) {
		return this.aplicativo.updateAplicativo(aplicativo);
	}

	public Aplicativo removeAplicativo(int id) {
		return this.aplicativo.removeAplicativo(id);
	}
	
	public List<Celular> addCelular(int aplicativoId, Celular celular) {
		return this.aplicativo.addCelular(aplicativoId, celular);
	}

	public List<Celular> removeCelularAplicativo(int aplicativoId, int celularId) {
		return this.aplicativo.removeCelular(aplicativoId, celularId);
	}
}
