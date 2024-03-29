package OrangeHRM.testcases;

import OrangeHRM.Library.Employee;
import OrangeHRM.Library.LoginPage;
import Utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args)
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.Login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.addEmployee("Rama", "Krishna");
		
		if(res) 
		{
			System.out.println("Employe ID exists - Test Pass");
		}
		else
		{
			System.out.println("Employee ID not exists - Test Fail");
		}
		
		

	}

}
