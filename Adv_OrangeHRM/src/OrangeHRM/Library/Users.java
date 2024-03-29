package OrangeHRM.Library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class Users extends AppUtils
{

 public boolean addUser(String role,String empname,String uname,String pwd) 
 {
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.linkText("User Management")).click();
	driver.findElement(By.linkText("Users")).click();
	driver.findElement(By.id("btnAdd")).click();
	
	Select drpdwn = new Select(driver.findElement(By.id("systemUser_userType")));
	drpdwn.selectByVisibleText(role);
	
	driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
	driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
	driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
	driver.findElement(By.id("btnSave")).click();
    
	driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
	driver.findElement(By.id("searchBtn")).click();
	
	WebElement table = driver.findElement(By.id("resultTable"));
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	boolean isuserexist = false;
	
	for(int i=1;i<rows.size();i++) 
	{
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		
		if(cols.get(1).getText().equals(uname)) 
		{
			return true;
		}
		
	}
	return isuserexist;
	
	
	
	
	
	
	 
 }

}
