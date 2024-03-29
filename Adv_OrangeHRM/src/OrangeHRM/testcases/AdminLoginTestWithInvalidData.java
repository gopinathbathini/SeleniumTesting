package OrangeHRM.testcases;

import OrangeHRM.Library.LoginPage;
import Utils.AppUtils;

public class AdminLoginTestWithInvalidData {

	public static void main(String[] args) 
	{


		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.Login("asdd", "sfd");
		
		boolean error = lp.isErrorMessageDisplayed();
		if(error) {
			System.out.println("System Displayed Expected Error message - Test Pass");
		}
		else 
		{
			
			System.out.println("System  not Displayed Expected Error message - Test Fail");
		}
		
		
		AppUtils.closeApp();

	}
	


}
