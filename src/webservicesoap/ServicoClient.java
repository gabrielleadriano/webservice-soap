package webservicesoap;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ServicoClient {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/webservicesoap?wsdl");
		QName qname = new QName("http://webservicesoap/", "ServicoSOAPService");
		Service ws = Service.create(url, qname);
		
		ServicoSOAPInterface servicoSOAP = ws.getPort(ServicoSOAPInterface.class);
		
//		ServicoSOAP servicoSOAP = ws.getPort(ServicoSOAP.class);
//		
//		
//		System.out.println("celulares: " + servicoSOAP.getCelulares());
//		System.out.println("celular: " + servicoSOAP.getCelular(1));
//		
//		Aplicativo aplicativo1 = new Aplicativo(4, "IFood", "Alimentos", 5.0F, "2.4");
//		Celular celular1 = new Celular(1, "Iphone XAS@#111", "IOS", "‎Branco");
//		celular1.addAplicativo(aplicativo1);
//		
//		System.out.println("adiciona celular: " + servicoSOAP.postCelular(celular1));
//		
//		celular1.setCor("Amarelo");		
//		System.out.println("atualiza celular: " + servicoSOAP.updateCelular(celular1));
//		
//		System.out.println("celulares atualizados: " + servicoSOAP.getCelulares());
//		
//		System.out.println("celular removido" + servicoSOAP.removeCelular(celular1.getId()));
	}
}
