package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverScript.Mainmethod;
import utility.CommonMethods;
import utility.ConstantLocators;

public class Flight_select {

	public void FlightPrice() throws Exception {
		Thread.sleep(10000);
		String fightPrice = CommonMethods.fetchValues(ConstantLocators.flightPrice_FlightSelectPage);
		System.out.println(fightPrice);
	}
	
	public void flightTime() {
	
	CommonMethods.click(ConstantLocators.selectTime_FlightSelectPage);
	}
	
	public void NoofFlights() throws Exception {
		List<WebElement> availableFlights = CommonMethods.allelements(ConstantLocators.allFlights_FlightSelectPage);
		
		int noOfFlights = availableFlights.size();
				System.out.println(noOfFlights);
				
				for (int i = 0; i < noOfFlights-1; i++) {
				String flPrice = availableFlights.get(i).getText();
				System.out.println(flPrice);	
				Thread.sleep(1000);
				
					if (flPrice.equalsIgnoreCase("8,072")) {
						availableFlights.get(i).click();
					}
			}	
	}
	

}

