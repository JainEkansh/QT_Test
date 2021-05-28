package Com.Test.Ekansh.Utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

public class BaseFunctions
{
	
	private WebDriver driver;
	
	protected BaseFunctions(WebDriver webdriver)
	{
		this.driver=webdriver;
	}
	
	
	public void logMessage(String msg)
	{
		Reporter.log(msg, true);
	}
	
	
	public void launchApplication(String url) 
	{
        driver.get(url);
        logMessage("**[INFO]: Application URL :: " + url);
	}
	
	
	protected void mouseHover(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	protected WebElement waitForElementToBeVisible(WebElement e) 
	{
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				   .withTimeout(20, TimeUnit.SECONDS)
				   .pollingEvery(3, TimeUnit.SECONDS)
				   .ignoring(NoSuchElementException.class)
				   .ignoring(TimeoutException.class);
        return (WebElement) wait1.until(ExpectedConditions.visibilityOf(e));
    }
}
