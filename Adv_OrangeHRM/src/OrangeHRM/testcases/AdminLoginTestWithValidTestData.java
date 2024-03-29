package OrangeHRM.testcases;

import OrangeHRM.Library.LoginPage;
import Utils.AppUtils;

public class AdminLoginTestWithValidTestData {

	public static void main(String[] args) {

        AppUtils.launchApp("http://orangehrm.qedgetech.com");
        
        //login
        LoginPage lp = new LoginPage();
        lp.Login("Admin", "Qedge123!@#");
        
        //AdminModuleDispaly
       boolean res = lp.IsAdminModuleDisplayed();
       
       if(res) 
       {
    	   System.out.println("Admin module Displayed - Test Pass");	
       }
       
       else
       {
    	   System.out.println("Admin module not Displayed - Test fail");
    	   
       }
       
       //logOut
       lp.logOut();
       
       AppUtils.closeApp();
        
        
        

	}

}
