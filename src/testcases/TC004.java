package testcases;

import pages.Lounge_Header;
import utility.CommonMethods;

public class TC004 {
	public static void tc04() throws Exception {
		Lounge_Header LH = new Lounge_Header();
		LH.Manage();
		Thread.sleep(2000);
		LH.lounge_services();
		Thread.sleep(2000);
		LH.listservices();
		
		CommonMethods.closeBrowser();
	}

}
