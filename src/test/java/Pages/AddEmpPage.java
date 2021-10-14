package Pages;
import Locator.locator;

public class AddEmpPage {

	public static void AddEmp() {
		locator.AddEmp().click();
	}
	public static void AddName() {
	 	locator.First().sendKeys("ABC");
		locator.Middle().sendKeys("ABD");
		locator.Last().sendKeys("BDJ");
		}
	  public static void AddEmpID() {
	    	 locator.EmpID().sendKeys("12345");
	     }
     public static void AddEmpPhoto() {
    	 locator.Addph().click();
     }
     public static void CheckBox() {
    	 locator.LoginDet().click();
     }
     public static void uname() {
    	 locator.Uname().sendKeys("qwert");
     }
     public static void Pass() {
    	 locator.Pass2().sendKeys("12345678");
     }
     public static void CPass() {
    	 locator.CnfrmPass().sendKeys("12345678");
     }
     public static void Status() {
    	 locator.Status().click();
     }

     public static void save() {
    	 locator.Save().click();
     }
}
