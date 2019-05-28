package utility;

import org.openqa.selenium.By;

public class LocatorSplitutility {
	
	public static By locatersplit(String locVariable) {
		String loctype = locVariable.split(":")[0];
		String locvalue = locVariable.split(":")[1];
		
		System.out.println(loctype);
		System.out.println(locvalue);
		
		if (loctype.equalsIgnoreCase("Name")) {
			return  By.name(locvalue);      //By.name("passenger")
		} else if (loctype.equalsIgnoreCase("ID")) {
			return By.id(locvalue);
		} else if (loctype.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(locvalue);
		} else if (loctype.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(locvalue);
		} else if (loctype.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(locvalue);
		} else if (loctype.equalsIgnoreCase("XPATH")) {
			return By.xpath(locvalue);
		} 
		return null;
	}
	
//	public static void main(String[] args) {
//		
//		locatersplit(from_destination_Home_headerpage);
//		
//	}
	
	

}
