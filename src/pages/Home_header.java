package pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverScript.Mainmethod;
import utility.CommonMethods;
import utility.ConstantLocators;
import utility.Constantvalues;

public class Home_header {
	//	....Scrolling implimentation .......


	public  void selectDeparture() {
		for(int i =0;i<30;i++) {
			CommonMethods.enterKeys(ConstantLocators.from_destination_Home_headerpage, Keys.BACK_SPACE);
			}
		CommonMethods.enterText(ConstantLocators.from_destination_Home_headerpage, Constantvalues.departure_city);
		CommonMethods.enterKeys(ConstantLocators.from_destination_Home_headerpage, Keys.ENTER);
	}

	

	public  void selectDest() throws Exception {
		Thread.sleep(1000);
		CommonMethods.enterText(ConstantLocators.To_destination_Home_headerpage, Constantvalues.Arrival_city);
		CommonMethods.enterKeys(ConstantLocators.To_destination_Home_headerpage, Keys.TAB);
	}



	//-------------------------Working with  table logic for DEPARTURE----------------------
	public  void selectDate() throws Exception {
		Thread.sleep(1000);
		CommonMethods.click(ConstantLocators.date_tablerows_Home_headerpage);
		CommonMethods.calenderDate(ConstantLocators.date_tablerows_Home_headerpage, Constantvalues.Date);
	}
	

	public  void passengerlink() throws Exception {
		Thread.sleep(1000);
		CommonMethods.click(ConstantLocators.passengerlink_Home_headerpage);
	}

	public  void passengercount() {
		for(int i =1;i<4;i++) {
			CommonMethods.click(ConstantLocators.noOfPassengers_HomeHeaderPage);
		}
	}

	public  void ConfirmPassenger() throws Exception {
		Thread.sleep(1000);
		CommonMethods.click(ConstantLocators.confirmPassenger_HomeHeaderPage);
	}

	public  void SearchFlight() {
		CommonMethods.click(ConstantLocators.ele_Searchflight_Home_headerpage);
	}

	

}
