package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DriverScript.Mainmethod;
import utility.CommonMethods;
import utility.ConstantLocators;

public class Lounge_Header {
	public void Manage() {
		CommonMethods.mouseHoverwithoutClick(ConstantLocators.ele_Managemenu_Lounge_Header);
	}
	
	public void lounge_services() {
		CommonMethods.mouseHoverwithtClick(ConstantLocators.ele_Lounge_Lounge_Header);
	}
	
	public void listservices() {
		List<WebElement> allservices = CommonMethods.allelements(ConstantLocators.listservices_Lounge_Header);
		int Noofservices = allservices.size();
		for(int i = 0; i<Noofservices;i++) {
			String servicename = allservices.get(i).getText();
			System.out.println(servicename);
			
		}
		
	}
}
