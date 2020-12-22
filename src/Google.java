import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();      
	    driver.navigate().to("http://www.google.com/"); 
	    System.out.println(driver.getTitle());
	    driver.close();
	}

}
