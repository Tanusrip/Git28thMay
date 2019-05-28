package testcases;

import pages.Contact_us;

public class TC003 {
	public static void tc03() throws Exception {
		Contact_us CS = new Contact_us();
		
		Thread.sleep(5000);
		CS.contactLink();
		Thread.sleep(2000);
		CS.windowhandle();
		Thread.sleep(5000);
		CS.Coaddress();
		
	}

}
