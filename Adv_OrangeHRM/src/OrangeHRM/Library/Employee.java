package OrangeHRM.Library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.AppUtils;

public class Employee extends AppUtils
{
	public boolean addEmployee( String fname, String lname) 
	{
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String id =driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
	
	
	
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(id);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement table = driver.findElement(By.id("resultTable"));
	    List<WebElement> rows =	table.findElements(By.tagName("tr"));
	    
	    boolean isEmpExist = false;
	    
	    for(int i=1; i<rows.size();i++)
	    {
	    	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	    	
	    	 String id2= cols.get(i).getText();
	    	 
	    	 if(id.equals(id2))
	    	 {
	    		 isEmpExist = true;
	    		 break;
	    	 }	    	     		 
	    	 
	    }
	    return isEmpExist;
	}
	

}
