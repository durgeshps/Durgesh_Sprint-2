package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browser.browser;

public class locator extends browser {
	public static WebElement username() {
		WebElement uname1 =  driver.findElement(By.name("txtUsername"));
		return uname1;
	}
	public static WebElement password() {

		WebElement pass =  driver.findElement(By.name("txtPassword"));
		return pass;
	}
	public static WebElement loginbtn() {

		WebElement login_btn =  driver.findElement(By.id("btnLogin"));
		return login_btn;
	}
	public static String geturl() {

		String url =  driver.getCurrentUrl();
		return url;
	}
	public static WebElement pim() {
		WebElement pim = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		return pim;                                   //*[@id="menu_pim_viewPimModule"]/b
	}
	public static WebElement AddEmp() {
		WebElement add_emp = driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]"));
		return add_emp;
	}
	public static WebElement First() {
		WebElement first = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		return first;
	}
	public static WebElement Middle() {
		WebElement middle = driver.findElement(By.xpath("//*[@id=\"middleName\"]"));
		return middle;
	}
	public static WebElement Last() {
		WebElement last = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		return last;
	}
	public static WebElement EmpID() {
		WebElement empid = driver.findElement(By.xpath("//*[@id=\"employeeId\"]")) ;
		return empid;
	}
	public static WebElement Addph() {
		WebElement addph = driver.findElement(By.id("photofile"));
		return addph;
	}
	public static WebElement LoginDet() {
		WebElement logindet = driver.findElement(By.xpath("//*[@id=\"chkLogin\"]"));
		return logindet;
	}
	public static WebElement Uname() {
		WebElement uname2 = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
		return uname2;
	}
	public static WebElement Pass2() {
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
		return pass;
	}
	public static WebElement CnfrmPass() {
		WebElement cnfrmpass = driver.findElement(By.xpath("//*[@id=\"re_password\"]"));
		return cnfrmpass;
	}
	public static WebElement Status() {
		WebElement status = driver.findElement(By.xpath("//*[@id=\"status\"]"));
		return status;
	}
	public static WebElement Save() {
		WebElement save = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		return save;
	}
}
