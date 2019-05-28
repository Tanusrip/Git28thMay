package utility;

import java.util.ArrayList;



import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverScript.Mainmethod;


public class CommonMethods {
	public static WebDriver driver;
	public static boolean  bvalue;
	static String value;
	static List<WebElement> elements;
	
	public static WebDriver Browsertype(String bname) {
		if (bname.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			Log.info("The Browser which got reopened is :" +bname);
			Log.info("message testing...");
			
		} else if(bname.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			Log.info("The Browser which got reopened is :" +bname);

		}
		
		return driver;
	}
	
	public static void openURL(String testData) {
		try {
			driver.get(testData);
			driver.manage().window().maximize();
			Log.info("The url got opened is : " +testData );
			
		} catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not able to open the url  : " +testData );
		}
		
	}
	
	public static void enterText(String locVariable, String testData) {
		try {
		WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable));
		element.sendKeys(testData);
		Log.info("Sucessfully entered text is : " +locVariable + " And the value is :" +testData);
		} catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Sucessfully entered text is : " +locVariable + " And the value is :" +testData);
		}
		
	}
	public static void enterKeys(String locVariable, Keys testData) {
		try {
		WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable));
		element.sendKeys(testData);
		Log.info("Succesfully entered key in :" +locVariable);
		}
		catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully entered key in :" +locVariable);
		}
	}
	public static void click(String locVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable)); 
			element.click();	
			Log.info("Succesfully clicked webelement is  :" +locVariable);
		} catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully clicked webelement is  :" +locVariable);
		}

	}
	
	public static void mouseHoverwithoutClick(String locVariable) {
		try {
		WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Log.info("Succesfully worked mousehovering is  :" +locVariable);
		}catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully worked mousehovering is  :" +locVariable);
		}
		
	}
	
	public static void mouseHoverwithtClick(String locVariable) {
		try {
		WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
		Log.info("Succesfully performed and clicked  mousehovering is  :" +locVariable);
		}catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully performed and clicked  mousehovering is  :" +locVariable);
		}
		
		}
	public static String fetchValues(String locVariable) {
		try {
		WebElement element = driver.findElement(LocatorSplitutility.locatersplit(locVariable));
		value = element.getText();
		System.out.println(value);
		Log.info("Succesfully fetched  value from webelement is   :" +locVariable +"And the value is :" +value);
		
		}catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully fetched  value from webelement is   :" +locVariable +"And the value is :" +value);
		}
		return value;
	}
	
	public static void allWindows(int testData) {
		try {
		List<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allwindows.get(testData));
		Log.info("Succesfully worked to a new window");
		}catch (Exception e) {
			Mainmethod.tvalue=false;
			e.printStackTrace();
			Log.error("Not Succesfully worked to a new window");
		}
		
	}
	public static void closeBrowser() {
		driver.quit();
		Log.info("Succesfully closed the browser");
	}
	
	public static void calenderDate(String locVariable, String testData) throws Exception {
		try {
			List<WebElement> RowData = driver.findElements(LocatorSplitutility.locatersplit(locVariable));
			int rowcount = RowData.size();
			System.out.println(" The total number of rows in calander is :" +rowcount);
			
			for(int i=0;i<rowcount;i++) {
				if (bvalue==true) {
					break;

				} else {
					
					List<WebElement> TableData = RowData.get(i).findElements(By.tagName("td"));
					int datacount = TableData.size();
					System.out.println(" The number of data in each row number " +i + "  is " +datacount);
					
					for(int j=0;j<datacount;j++) {
						String TableValue = TableData.get(j).getText();
						System.out.println("The value in row # " +i +"And" +"column # " +j + " is :" +TableValue );
						if (TableValue.equals(Constantvalues.Date)) {

							TableData.get(j).click();
							bvalue=true;
							break;
						}
					}	
				}
			}
			Log.info("Sucessfully fetch the date from calander :" +testData);
		} catch (Exception e) {
			Mainmethod.tvalue = false;
			e.printStackTrace();
			Log.error("Not Sucessfully fetch the date from calander :" +testData);
			
		}
		
		
	}
	public static List<WebElement> allelements(String locVariable){
		elements = driver.findElements(LocatorSplitutility.locatersplit(locVariable));
		return elements;
	}

	

	
	
	
}
