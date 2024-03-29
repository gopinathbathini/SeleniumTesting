package OrangeHRM.testcases;

import OrangeHRM.Library.LoginPage;
import Utils.AppUtils;

public class EmployeeLoginTest
{

	public static void main(String[] args) 
	{

		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.Login("sanjay123", "Sanjay123!@#");
		
		boolean res = lp.isEmployeeModuleDisplayed();
		
		if(res)
		{
			System.out.println("New Employee able to Login - Test Pass");
		}
		else
		{
			System.out.println("New Employee  not able to Login - Test fail");
		}
		
		lp.logOut();
		AppUtils.closeApp();


	}

}
