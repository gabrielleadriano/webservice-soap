package webservicesoap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface AplicativoInterface {

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
}
