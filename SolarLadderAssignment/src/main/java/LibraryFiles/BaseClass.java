package LibraryFiles;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BaseClass
{
public ChromeOptions ops;
public WebDriver driver;
public void initializeBrowser() throws IOException
{
System.setProperty("webdriver.chrome.driver", 
		"D:\\NewJAVA\\SolarLadderAssignment\\Browser Files\\chromedriver.exe");
ops = new ChromeOptions();
ops.addArguments("--remote-allow-origins=*");
ops.addArguments("--disable-notifications");
driver=new ChromeDriver(ops);
//driver = new FirefoxDriver();  

driver.get(UtilityClass.getPFData("URL"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
}					
}
