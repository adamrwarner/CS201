package final_project;

import java.net.InetAddress;

public class GeoLocationDriver {

	public static void main(String args[]) throws Exception {

		// Getting IPAddress of localhost in inetaddress format
		InetAddress IPAddress = InetAddress.getLocalHost();
		// String representation of IP Address	
		String ipAddress = IPAddress.getHostAddress();
		// String representation of host name
		String hostname = IPAddress.getHostName();
		// Send info to constuctor
		GeoLocation locateMe = new GeoLocation (ipAddress,hostname);
		// Get output of ip address and host and open browser with map
		locateMe.output();
		
	}
}
