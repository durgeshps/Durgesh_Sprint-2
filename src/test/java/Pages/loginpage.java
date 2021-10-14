package Pages;

import Browser.browser;
import Locator.locator;

public class loginpage {
public static void login() {
	 browser.go_to_url("https://opensource-demo.orangehrmlive.com/");
		locator.username().sendKeys("Admin");
		locator.password().sendKeys("admin123");
	    locator.loginbtn().click();
}	
public static void login23(String url) {
	 browser.go_to_url(url);
		locator.username().sendKeys("Admin");
		locator.password().sendKeys("admin123");
	    locator.loginbtn().click();
}	

public static String go_to_url() {
	 String curl = locator.geturl();
	    return curl;
}
}
