package businessLogic;

import configuration.ConfigXML;
import dataaccess.DataAccess;

public class BusinessLogicLocal implements BLFactory{
	
	
	public BLFacade createBLFacade (ConfigXML c) {
		BLFacade appFacadeInterface;
		DataAccess da= new DataAccess(c.getDataBaseOpenMode().equals("initialize"));
		appFacadeInterface=new BLFacadeImplementation(da);
		return appFacadeInterface;
	}
	
	
}
