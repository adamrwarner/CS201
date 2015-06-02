package final_project;

//This program will use the java.net class to look up the IP Address for 
//a users machine, construct a URL from that information and open a browser
//which will load a map of the located IP address

import java.net.*;
import java.awt.*;

public class GeoLocation {

	private String ipAddress;
	private String hostname;
	
	// Constructor takes input from driver
	GeoLocation (String ipAddress, String hostname){
		
		this.ipAddress = ipAddress;
		this.hostname = hostname;		
	}

	public void output() throws Exception{

		System.out.println("Your current IP address is: " + ipAddress);
		System.out.println("Your Current hostname is: " + hostname);
		// Constructs url for IP address lookup and creates map
		URI url = new URI("http://www.infosniper.net/index.php?ip_address="+ipAddress+"&map_source=1&lang=1&map_type=1&zoom_level=13");
		// Opens browser with geolocated IP address
		Desktop.getDesktop().browse(url);
		
	}
}
