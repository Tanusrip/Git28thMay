package testcases;

import pages.Flight_select;

public class TC002 {
	
	public static void tc02() throws Exception{
		
		Flight_select FS = new Flight_select();
		
		Thread.sleep(3000);
		FS.flightTime();
		Thread.sleep(2000);
		FS.NoofFlights();
		
	}

}
