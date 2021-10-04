package webservicesoap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ServicoSOAPInterface {

	@WebMethod
	List<Aplicativo> getAplicativos();

	@WebMethod
	Aplicativo getAplicativo(int id);

	@WebMethod
	Aplicativo postAplicativo(Aplicativo aplicativo);
	
	@WebMethod
	Aplicativo updateAplicativo(Aplicativo aplicativo);
	
	@WebMethod
	Aplicativo removeAplicativo(int id);
	
	@WebMethod
	List<Celular> addCelular(int aplicativoId, Celular celular);
	
	@WebMethod
	List<Celular> removeCelular(int aplicativoId, int celularId);
	
	@WebMethod
	Celular getCelular(int id);
	
	@WebMethod
	List<Celular> getCelulares();

	@WebMethod
	Celular postCelular(Celular celular);

	@WebMethod
	Celular updateCelular(Celular celular);

	@WebMethod
	Celular removeCelular(int id);

	@WebMethod
	List<Aplicativo> addAplicativo(int celularId, Aplicativo aplicativo);

	@WebMethod
	List<Aplicativo> removeAplicativo(int celularId, int aplicativoId);
}
