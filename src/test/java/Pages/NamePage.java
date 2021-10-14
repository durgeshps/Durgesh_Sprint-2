package Pages;

import Browser.browser;
import Locator.locator;

public class NamePage {

	public static void name() {
		locator.pim().click();
		locator.AddEmp().click();
		
	}
	public static void AddEmp() {
		 	locator.First().sendKeys("ABC");
			locator.Middle().sendKeys("ABD");
			locator.Last().sendKeys("BDJ");
			
	}
	
	public static void save() {
		locator.Save().click();
	}
}
