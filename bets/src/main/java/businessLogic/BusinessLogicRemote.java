package businessLogic;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import configuration.ConfigXML;
import dataaccess.DataAccess;

public class BusinessLogicRemote implements BLFactory{
	
	
	public BLFacade createBLFacade (ConfigXML c) {
		try {
		BLFacade appFacadeInterface;
		 String serviceName= "http://"+c.getBusinessLogicNode() +":"+ c.getBusinessLogicPort()+"/ws/"+c.getBusinessLogicName()+"?wsdl";
		 
			//URL url = new URL("http://localhost:9999/ws/ruralHouses?wsdl");
			URL url = new URL(serviceName);

	 
	        //1st argument refers to wsdl document above
			//2nd argument is service name, refer to wsdl document above
//	        QName qname = new QName("http://businessLogic/", "FacadeImplementationWSService");
	        QName qname = new QName("http://businessLogic/", "BLFacadeImplementationService");
	 
	        Service service = Service.create(url, qname);

	         appFacadeInterface = service.getPort(BLFacade.class);
		return appFacadeInterface;
		}catch(Exception e) {
			System.out.println("Ezin izan da sortu!!");
			return null;
		}
	}
	
	
}
