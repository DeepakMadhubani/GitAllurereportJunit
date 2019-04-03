package allurereport;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestAllure {

	
	WebDriver driver;
	
	
	
    @Before
	public void startSetting()
	{   	 
    	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumJars\\chromedriver.exe");
    	/*System.setProperty("webdriver.gecko.driver", "E:\\Allure Report test\\geckodriver.exe");
    	driver=new FirefoxDriver(); This is fixed in latest Firefox 62.0 Nightly builds*/  
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("enable-automation");
    	options.addArguments("--headless");
    	options.addArguments("--window-size=1920,1080");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-extensions");
    	options.addArguments("--dns-prefetch-disable");
    	options.addArguments("--disable-gpu");
    	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    	driver=new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS); 
    	driver.manage().window().maximize();
	}
	
	@Test
	public void macysLoginTest() throws InterruptedException
	{
		driver.get("http:amazon.com");
		/*driver.get("http://mdc2vr030/UI/");
		driver.findElement(By.id("txtLoginId")).sendKeys("superbauser");
		driver.findElement(By.id("login_password")).sendKeys("haht");
		driver.findElement(By.id("login_loginBtn")).click();
		
		new WebDriverWait(driver,10000L).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='grey-btn ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"))).click();
		System.out.println("Title is::"+driver.getTitle());
		new WebDriverWait(driver,10000L).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout-link']"))).click();*/
		
	}
	
	@Test
	public void googlePageTest()
	{
		
		driver.get("http:google.com");
		driver.findElement(By.name("q")).sendKeys("Allure Report testNg");
		
	}
	@Test
	public void macysLoginBadUNameTest()
	{
		driver.get("http:udemy.com");
		
		/*driver.get("http://mdc2vr030/UI/");
		driver.findElement(By.id("txtLoginId")).sendKeys("superbauser");
		driver.findElement(By.id("login_password")).sendKeys("haht");
		driver.findElement(By.id("login_loginBtn")).click();
		System.out.println("Title is::"+driver.getTitle());
		new WebDriverWait(driver,10000L).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='grey-btn ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"))).click();
		System.out.println("Title is::"+driver.getTitle());
		assertEquals("STELLA Dashboard", driver.getTitle());*/
		
	}
	
	@After
	public void closeDriver()
	{
		

	}
	
	@After
	public void generateReport() throws IOException, InterruptedException
	{	 
        
        /*System.out.println("Path is::"+System.getProperty("user.dir"));
         Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Allure_Execute.bat");
		 Thread.sleep(15000L);
	       Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Delete_Allure_File.bat");*/
	       driver.close();
	}
	
}
