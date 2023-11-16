
	package businessLogic;

	import java.awt.Color;
	import java.net.URL;
	import java.util.Locale;

	import javax.swing.UIManager;
	import javax.xml.namespace.QName;
	import javax.xml.ws.Service;

	import configuration.ConfigXML;
	import dataaccess.DataAccess;
	import gui.MainGUI;
	import gui.MainUserGUI;

	public interface BLFactory {

		public BLFacade createBLFacade (ConfigXML c);
		
	}
