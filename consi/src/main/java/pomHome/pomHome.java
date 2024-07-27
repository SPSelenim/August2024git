package pomHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomHome {

	public WebDriver driver=null;
	public String First="fname";
	public String Last="lname";
	
	
	public pomHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFirstName()
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(By.id(First));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return element;
	}
	

	public WebElement getLastName()
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(By.id(Last));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void sendDataInFirstName(String FirstData)
	{
		getFirstName().sendKeys(FirstData);
	}

	public void sendDataInLastName(String LastData)
	{
		getLastName().sendKeys(LastData);
	}

}


