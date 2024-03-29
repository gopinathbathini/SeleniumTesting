package OrangeHRM.Library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginPage extends AppUtils
{
	public void Login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public boolean IsAdminModuleDisplayed() 
	{
		try {
			  driver.findElement(By.linkText("Admin")).isDisplayed();
			  return true;
			
		} catch (Exception e) {

             return false;
		}
	}
	
	public void logOut()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean isErrorMessageDisplayed() 
	{
		String error = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		
		if(error.contains("invalid") || error.contains("empty"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public boolean isEmployeeModuleDisplayed()
	{
		
		try 
		{
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return false;
		} 
		catch (Exception e) 
		{

			return true;

		}
		
		 
		 		 
		
	}
	
}
