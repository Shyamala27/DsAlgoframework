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




public class HomePage {
	
private WebDriver dr;

	
	//String Url="https://dsportalapp.herokuapp.com/";
	String HomeUrl="https://dsportalapp.herokuapp.com/home";
	@FindBy (xpath="//*[@class='btn']") WebElement GetStart;

	@FindBy (xpath="/html/body/div[2]/div[1]/div/div/a") WebElement DSButton;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div/a") WebElement ArrButton;
	@FindBy (xpath="/html/body/div[2]/div[3]/div/div/a") WebElement LLButton;
	@FindBy (xpath="/html/body/div[2]/div[4]/div/div/a") WebElement StkButton;
	@FindBy (xpath="/html/body/div[2]/div[5]/div/div/a") WebElement QuButton;
	@FindBy (xpath="/html/body/div[2]/div[6]/div/div/a") WebElement TrButton;
	@FindBy (xpath="/html/body/div[2]/div[7]/div/div/a") WebElement GphButton;
	@FindBy (xpath="/html/body/div[2]") WebElement Mess;
	@FindBy (linkText="Sign in") WebElement Signin;
	@FindBy (xpath=" //*[contains (text(), 'Register!')]") WebElement Register;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Arrlist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Lnklist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Stklist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Qulist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Trlist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]") WebElement Gphlist;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a") WebElement toggle;
	@FindBy (xpath="/html/body") WebElement SShotwarning;
	
	public HomePage(WebDriver dr)
	
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);	
	}
	
	
	
	public String open_portallink()
	
	{
		return dr.getTitle();
		
		
	}
public void launch() 
	
	{
	//dr.get(Url);	
		//Thread.sleep(2000);
		
		GetStart.click();	
	}
	
public void homepage()
{
	//dr.get(HomeUrl);
	String actaltitle=dr.getTitle();
	String expectedtitle="NumpyNinja" ;
	Assert.assertEquals(actaltitle, expectedtitle);
}

public void Getstart_click(String opt)
{
	
	
 if (opt.equalsIgnoreCase("Datastructures"))
 {
	 DSButton.click();
 }
 else if (opt.equalsIgnoreCase("Arrays"))
 {
	 ArrButton.click();
 }
 else if (opt.equalsIgnoreCase("Linkedlist"))
 {
	 LLButton.click();
 }
 else if (opt.equalsIgnoreCase("Stack"))
 {
	 StkButton.click();
 }
 else if (opt.equalsIgnoreCase("Queue"))
 {
	 QuButton.click();
 }
 else if (opt.equalsIgnoreCase("Tree"))
 {
	 TrButton.click();
 }
 else if (opt.equalsIgnoreCase("Graph"))
 {
	 GphButton.click();
 }
 else
 {
	 System.out.println("Invalid Element");
 }
	
	
}
	public void warning_mess(String Warning) throws IOException
	{
		Warning="You are not logged in";
		String actualmess= Mess.getText();
		Assert.assertEquals(Warning, actualmess);
		
		TakesScreenshot ts = (TakesScreenshot) SShotwarning;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File src1 = ((TakesScreenshot) SShotwarning).getScreenshotAs(OutputType.FILE);
		Date dt = new Date();
		DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		File trg = new File(".\\Screenshots\\image.png");
		FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
		// imag131_5_2021_1_26_30
		
	
	}
	
	public void droplist(String opt)
	{
		toggle.click();
		
	if (opt.equalsIgnoreCase("Arrays"))
	 {
		Arrlist.click();
	 }
	 else if (opt.equalsIgnoreCase("Linkedlist"))
	 {
		 Lnklist.click();
	 }
	 else if (opt.equalsIgnoreCase("Stack"))
	 {
		 Stklist.click();
	 }
	 else if (opt.equalsIgnoreCase("Queue"))
	 {
		 Qulist.click();
	 }
	 else if (opt.equalsIgnoreCase("Tree"))
	 {
		 Trlist.click();
	 }
	 else if (opt.equalsIgnoreCase("Graph"))
	 {
		 Gphlist.click();
	 }
	 else
	 {
		 System.out.println("Invalid Element");
	 }
	}
		
	
	
	public void signin_click()
	{
		Signin.click();
	}
	
	public String launch_signin()
	{
		return dr.getTitle();
	}
	
	public void register_click()
	{
		Register.click();
	}
	
	public String launch_register()
	{
	return dr.getTitle();	
	}
	

}


