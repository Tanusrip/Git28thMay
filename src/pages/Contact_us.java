package pages;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverScript.Mainmethod;
import utility.CommonMethods;
import utility.ConstantLocators;


public class Contact_us {
	
	public void contactLink() {
		CommonMethods.click(ConstantLocators.Contactclick_Contact_us);
	}
	
	public void windowhandle() {
	CommonMethods.allWindows(1);
		
	}
	
	public void Coaddress () {
		String add = CommonMethods.fetchValues(ConstantLocators.address_Contact_us);
		System.out.println(add);
	}

}

