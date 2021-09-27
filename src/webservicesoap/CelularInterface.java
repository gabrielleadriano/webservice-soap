package webservicesoap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CelularInterface {

	@WebMethod
	Celular getCelular(int id);

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
