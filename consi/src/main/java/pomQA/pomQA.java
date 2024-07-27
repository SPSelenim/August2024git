package pomQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomQA {

	public WebDriver driver=null;
	public String myQA="//a[@name='QA']";
	public String firstLine="//b";
	
	public pomQA(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getQA()
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(By.xpath(myQA));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public WebElement getFirstLineID()
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(By.xpath(firstLine));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void clickOnQA()
	{
		try
		{
			getQA().click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

public String getFirstLine()
{
	String FirstLine1=null;
	try
	{
		FirstLine1=getFirstLineID().getText();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	return FirstLine1;
}
	
}


