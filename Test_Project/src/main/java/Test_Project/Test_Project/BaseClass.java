package Test_Project.Test_Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	

	public static WebDriver driver;
	
	static String uname = "//*[@id=\"username\"]";
	static String pwd = "//*[@id=\"password\"]";
	static String loginbtn = "//*[@id=\"Login\"]";
	//static String main = "//div[@class='slds-no-print oneAppNavContainer']//span[normalize-space()='\"+mainMenu+\"']";
	//static String sub =  "//span[contains(text(),'\"+subMenu+\"')]";
	
	
	public static void launchApp(String browserName) {
		
		//launching the browser
		if(browserName.equals("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "//Drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./Drivers\\\\\\\\chromedriver.exe");
	
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {	
			System.setProperty("webdriver.gecko.driver", "./Drivers\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//navigating to the url
		driver.get("https://srsconsultinginc2.my.salesforce.com");
		System.out.println("The title is : " + driver.getTitle());
	}
	
	public static void login(String userName, String password) {		
		driver.findElement(By.xpath(uname)).sendKeys(userName);
		driver.findElement(By.xpath(pwd)).sendKeys(password);
		driver.findElement(By.xpath(loginbtn)).click();
		System.out.println("The title is : " + driver.getTitle());
	}
	
	 public static void selectNavigationLink(String mainMenu, String subMenu) {
		driver.findElement(By.xpath("//div[@class='slds-no-print oneAppNavContainer']//span[normalize-space()='\"+mainMenu+\"']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'\"+subMenu+\"')]"));
		} 
	
	

	public static void tearDown()  {
		// TODO Auto-generated method stub
		
		driver.close();
		
	}
	

}
