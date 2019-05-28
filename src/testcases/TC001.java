package testcases;

import org.openqa.selenium.JavascriptExecutor;

import pages.Flight_select;
import pages.Home_header;
import utility.CommonMethods;
import utility.Constantvalues;

public class TC001 {
	public static void tc01() throws Exception{
		CommonMethods.Browsertype(Constantvalues.browserName);
		CommonMethods.openURL(Constantvalues.webSiteURL);
		JavascriptExecutor js	 = (JavascriptExecutor)CommonMethods.driver;
		js.executeScript("window.scrollBy(0,200)");
		
		Home_header HH = new Home_header();
		Flight_select FS = new Flight_select();
		
		HH.selectDeparture();
		HH.selectDest();
		HH.selectDate();
		HH.passengerlink();
		HH.passengercount();
		HH.ConfirmPassenger();
		HH.SearchFlight();
		
		Thread.sleep(3000);
		FS.FlightPrice();
	}

}
