package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Driver.Driver_Factory;

import org.openqa.selenium.WebElement;


public class DataStructures {
	
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement Username;
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement Password;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement LoginButtn;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Signinlnkhome;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;
	@FindBy (xpath="/html/body/div[3]/div[1]/div/div/a") WebElement DSGetstarted;
	@FindBy (xpath="/html/body/div[2]/ul/a") WebElement timecomplink;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement Tryhere;
	@FindBy (xpath="//pre[@role='presentation']") WebElement CodeTxtEditor;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement runclick;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement runresult;
	
	
	
	
	
	//Actions act=new Actions(dr);
	
	
	
	
public DataStructures(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}


public void login_success(String user3,String pass3)
{
	Signinlnkhome.click();
	Username.sendKeys(user3);
	Password.sendKeys(pass3);
	System.out.println("User id:"+user3+"Pass:"+pass3);
}

public void login_submit()
{
	LoginButtn.click();
	
}

public void sign_out()
{
	signout.click();
}

public String home_page_title()
{
	return dr.getTitle();
	
}

public void user_click_DSGetStart()
{
	DSGetstarted.click();
}

public String DS_page_title()
{
	return dr.getTitle();
}

public void time_complex_click()
{
	timecomplink.click();
}

public String time_complex_title()
{
	return dr.getTitle();
}

public void tryhere_click()
{
	Tryhere.click();
}

public String tryeditor_title()
{
	return dr.getTitle();
}

public void valid_phyton_code(String code)

{
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor,code).build().perform();
	//CodeTxtEditor.sendKeys(code);
}

public void run_click()
{
	runclick.click();
}
public void run_result()
{
	String result=runresult.getText();
	System.out.println("The run result is:"+result);
	
	
	//CodeTxtEditor.clear();
	
}


public void invalid_phython_code(String code1) throws InterruptedException
{
	
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	
	act.sendKeys(CodeTxtEditor,code1).build().perform();
	//CodeTxtEditor.sendKeys(code);
	
}

public void handle_alert()

{
	try {

	    runclick.click();

	} catch(UnhandledAlertException f) {

	    try {
	Alert alert = dr.switchTo().alert();
	String alertMessage= dr.switchTo().alert().getText();
	 System.out.println(alertMessage);
	 alert.accept();
	    } catch (NoAlertPresentException e) {

	        e.printStackTrace();

	    }
	
}

}
}


