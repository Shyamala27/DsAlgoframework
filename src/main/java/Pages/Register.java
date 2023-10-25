package Pages;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import Driver.Driver_Factory;

import org.openqa.selenium.WebElement;


public class Register {
	
private WebDriver dr;
	
	@FindBy (xpath=" //*[@id=\"navbarCollapse\"]/div[2]/ul/a[2] ") WebElement Registerlnk;
	@FindBy (xpath="//*[@id='id_username']") WebElement uname;
	@FindBy (xpath="//*[@id=\"id_password1\"]") WebElement pwd;
	@FindBy (xpath="//*[@id=\"id_password2\"]") WebElement confpwd;
	@FindBy (xpath="//*[@value='Register']") WebElement RegButton;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement Loginlnk;
	@FindBy (linkText=" Sign in ") WebElement Signinlnk;
	@FindBy (xpath="/html/body/div[3]") WebElement Alert;
	@FindBy (xpath="/html/body/div[2]") WebElement Success_Alert;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Signinlnk1;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement LoginButton;
	@FindBy (xpath="/html/body/div[2]") WebElement LoginSuccessAlert;
	
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement Signinpassword;
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement Signinuname;
	@FindBy (xpath="/html/body") WebElement SShotError;
	
	
	
	
	
	
	
public Register(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}

public void all_empty(String user,String pass,String confpass)
{
	user="";
	pass="";
	confpass="";
Registerlnk.click();
uname.sendKeys(user);
pwd.sendKeys(pass);
confpwd.sendKeys(confpass);
RegButton.click();
System.out.println("User id:"+user+"Pass:"+pass+"Confirm:"+confpass);



}

public String err_username()
{
	String message=uname.getAttribute("validationMessage");
	return message;
	
}

public void name_otherempty(String user1,String pass1,String confpass1)
{

	pass1="";
	confpass1="";
	Registerlnk.click();
	uname.sendKeys(user1);
	pwd.sendKeys(pass1);
	confpwd.sendKeys(confpass1);
	RegButton.click();
	System.out.println("User id:"+user1+"Pass:"+pass1+"Confirm:"+confpass1);

}
public String err_password()
{
	String message1=pwd.getAttribute("validationMessage");
	return message1;
	
}

public void confirmpass_empty(String user2,String pass2,String confpass2)
{


	confpass2="";
	Registerlnk.click();
	uname.sendKeys(user2);
	pwd.sendKeys(pass2);
	confpwd.sendKeys(confpass2);
	RegButton.click();
	System.out.println("User id:"+user2+"Pass:"+pass2+"Confirm:"+confpass2);

}
public String err_confirmpassword()
{
	String message1=confpwd.getAttribute("validationMessage");
	return message1;
	
}

public void uname_character(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}
public String err_Alert() 
{
	String message1=Alert.getText();
	System.out.println("The Alert message is:"+message1);
	return message1;
}
public void Sshot() throws IOException
{
	
	TakesScreenshot ts = (TakesScreenshot) SShotError;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File src1 = ((TakesScreenshot) SShotError).getScreenshotAs(OutputType.FILE);
	Date dt = new Date();
	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	File trg = new File(".\\Screenshots\\image.png");
	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
	// imag131_5_2021_1_26_30
	
}

public void uname_existing(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}

public void pass_mismatch(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}
public void only_number(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}

public void uname_pass_similar(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}
public void commonly_used_pass(String user3,String pass3,String confpass3)
{


	
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);

}

public void Register_success(String user3,String pass3,String confpass3)
{
	Registerlnk.click();
	uname.sendKeys(user3);
	pwd.sendKeys(pass3);
	confpwd.sendKeys(confpass3);
	RegButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3+"Confirm:"+confpass3);
}

public String success_mess()
{
	String message1=Success_Alert.getText();
	System.out.println("The Success Alert message is:"+message1);
	return message1;
	
}

public void signin_success(String user3,String pass3)
{
	Signinlnk1.click();
	Signinuname.sendKeys(user3);
	Signinpassword.sendKeys(pass3);
	LoginButton.click();
	System.out.println("User id:"+user3+"Pass:"+pass3);
}

public String login_success_mess()
{
	String message1=LoginSuccessAlert.getText();
	System.out.println("The Success Alert message is:"+message1);
	return message1;
	
}

}


