	package utility;

public class Constantvalues {
	
//	public static String browserName = "CHROME";
//	public static String webSiteURL = "https://www.goindigo.in/?linkNav=home_header";
//	public static String departure_city = "Chennai (MAA)";
//	public static String Arrival_city = "Ahmedabad (AMD)";
//	public static String Date = "14";
//	public static String filepath = "C:\\Users\\tanus\\eclipse-workspace\\Data_DrivenFramework\\Indigo Test Cases.xlsx";
		
	
	//public static String showVal= ExcelReadwrite.show();
	public static final String browserName = ExcelReadwrite.readValue("TestCases", 1, 4);
	public static final String webSiteURL = ExcelReadwrite.readValue("TestCases", 2, 4);
	public static final String departure_city = ExcelReadwrite.readValue("TestCases", 3, 4);
	public static final String Arrival_city = ExcelReadwrite.readValue("TestCases", 4, 4);
	public static final String Date = ExcelReadwrite.readValue("TestCases", 5, 4);
	public static final String excelPath = "C:\\Users\\tanus\\eclipse-workspace\\Hybrid_Framework_Logging\\Indigo Test Cases.xlsx";
	public static final String sheetname = "TestCases";
	public static final String testscenariosheet = "Test Scenarios";
	public static final int run_mode = 3;
	public static final int status = 2;
	

	
	

}
