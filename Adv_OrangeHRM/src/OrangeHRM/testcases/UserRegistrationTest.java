package OrangeHRM.testcases;

import OrangeHRM.Library.LoginPage;
import OrangeHRM.Library.Users;
import Utils.AppUtils;

public class UserRegistrationTest {

	public static void main(String[] args) {


		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
		
		Users usr = new Users();
		boolean res = usr.addUser("ESS", "sanjay sahoo", "sanjay123", "Sanjay123!@#");
		
		if(res) 
		{
			System.out.println("User Registered sucessfully - Test Pass");
		}
		else 
		{
			System.out.println("User  Not Registered sucessfully - Test fail");
		}
		
		lp.logOut();
		
		AppUtils.closeApp();
		
		

	}

}
