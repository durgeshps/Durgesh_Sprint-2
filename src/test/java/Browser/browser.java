package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class browser {

	protected static WebDriver driver;
	public static void go_to_url(String url){
		String datapath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",datapath);
		driver= new ChromeDriver();
		driver.get(url);//https://demo.orangeHrm
		driver.manage().window().maximize();  
	}
}
