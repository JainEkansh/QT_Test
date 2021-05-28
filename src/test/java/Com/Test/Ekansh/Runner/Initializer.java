package Com.Test.Ekansh.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Test.Ekansh.Utils.BaseFunctions;
import Com.Test.Ekansh.Utils.PropFileHandler;

public class Initializer extends BaseFunctions
{
	
	public static WebDriver driver;
	PropFileHandler obj;
	
	protected Initializer() {
		super(driver);
	}

	
	public void initializeBrowser()
	{
		logMessage("*************************************** Session Started ***************************************");
		obj = new PropFileHandler();
		System.setProperty("webdriver.chrome.driver","src/test/resources/SeleniumWebdrivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropFileHandler.readProperty("implicitTimeOut")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(PropFileHandler.readProperty("pageLoadTimeOut")), TimeUnit.SECONDS);
	}
	
	
	public void closeSession()
	{
		driver.quit();
		logMessage("*************************************** Session closed ***************************************");
	}
}
