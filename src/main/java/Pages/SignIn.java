package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import Driver.Driver_Factory;

import org.openqa.selenium.WebElement;


public class SignIn {
	
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement HomeSignin;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]") WebElement RegisterSignIn;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Signinlnk;
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement Uname;
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement Pass;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement loginbutton;
	@FindBy (xpath="/html/body/div[3]") WebElement errormess;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement signout;
	@FindBy (xpath="/html/body/div[2]") WebElement signoutmess;
	@FindBy (xpath="/html/body") WebElement Screenshotmess;
	
	
	
	
	
	

	
	
public SignIn(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public void signin_to_register()
{
	HomeSignin.click();
	RegisterSignIn.click();
	
}

public String verify_register_page_title()
{
	
	
	return dr.getTitle();
	
}

public String verify_signin_title()
{
	Signinlnk.click();
	return dr.getTitle();
}

public void invalid_sign_in(String user1,String pass1) throws IOException
{
	Uname.sendKeys(user1);
	Pass.sendKeys(pass1);
	loginbutton.click();
	String mess=errormess.getText();
	System.out.println("The error:"+mess);
	
	//String mesg = msgs.getText();
	//Assert.assertEquals(mesg, msg);
	TakesScreenshot ts = (TakesScreenshot) Screenshotmess;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File src1 = ((TakesScreenshot) Screenshotmess).getScreenshotAs(OutputType.FILE);
	Date dt = new Date();
	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	File trg = new File(".\\Screenshots\\image.png");
	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
	// imag131_5_2021_1_26_30
	
}

public void signin_excel(String user2,String pass2)
{
	Uname.sendKeys(user2);
	Pass.sendKeys(pass2);
	
}

public String click_login()
{
	loginbutton.click();
	return dr.getTitle();

}

public String validate_password()
{
	String message1=Pass.getAttribute("validationMessage");
	return message1;
	
}
public String validate_username()
{
	String message2=Uname.getAttribute("validationMessage");
	return message2;
}

public void capture_signin_mess()

{
String mess1=errormess.getText();
System.out.println("The error:"+mess1);
}

public void signout()
{
signout.click();	
}

public void signout_message()
{
	String signout_mess=signoutmess.getText();
	System.out.println(signout_mess);
	
}
}


