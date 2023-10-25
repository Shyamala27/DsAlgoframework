package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import Driver.Driver_Factory;

import org.openqa.selenium.WebElement;

public class Array {
	private WebDriver dr;
	@FindBy (xpath="//*[@id=\"id_username\"]") WebElement Username;
	@FindBy (xpath="//*[@id=\"id_password\"]") WebElement Password;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement LoginButtn;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Signinlnkhome;
	@FindBy (xpath="/html/body/div[3]/div[2]/div/div/a") WebElement ArrayGetStarted;
	@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement Arrinphythonlnk;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement TryHereClick;
	@FindBy (xpath="//pre[@role='presentation']") WebElement CodeTxtEditor1;
	@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement Arrinlistlnk;
	@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement BOinList;
	@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement AppOfArraylnk;
	@FindBy (xpath="//*[@id=\"content\"]/a") WebElement Practicequestlnk;
	@FindBy (xpath="/html/body/div[2]/a") WebElement Searchthearraylnk;
	@FindBy (xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement textareacode;
	@FindBy (xpath="//*[@id=\"answer_form\"]/button") WebElement runquestbutton;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement runresult;
	@FindBy (xpath="//*[@id=\"answer_form\"]/input[2]") WebElement submitbutton;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement Submitresult;
	@FindBy (xpath="/html/body/div[3]/a") WebElement MaxConsecutive;
	@FindBy (xpath="/html/body/div[4]/a") WebElement EvenNo;
	@FindBy (xpath="/html/body/div[5]/a") WebElement SortArray;

	
	
	
	
	
	

	
	
public Array(WebDriver dr)
	
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

public String home_page_title()
{
	return dr.getTitle();
	
}


public void user_click_ArrayGetStart()
{
	ArrayGetStarted.click();
}

public String Array_get_title()
{
	return dr.getTitle();
}
public void arr_in_phython()
{
	Arrinphythonlnk.click();
}
public String Arr_Phy_get_title()
{
	return dr.getTitle();
}
public void click_try_here()
{
	TryHereClick.click();
}
public String tryeditor_title()
{
	return dr.getTitle();
}
public void Arr_valid_phyton_code(String code)

{
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void Arr_invalid_phyton_code(String code1)

{
	//CodeTxtEditor1.clear();
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code1).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void Arr_using_list()
{
	Arrinlistlnk.click();
}
public String Arr_list_title()
{
	return dr.getTitle();
}
public void Arr_valid_list_phyton_code(String code2)

{
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code2).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void Arr_invalid_list_phyton_code(String code3)

{
	//CodeTxtEditor1.clear();
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code3).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void BO_list()
{
	BOinList.click();
}
public String BO_list_title()
{
	return dr.getTitle();
}
public void BO_valid_list_phyton_code(String code4)

{
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code4).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void BO_invalid_list_phyton_code(String code5)

{
	//CodeTxtEditor1.clear();
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code5).build().perform();
	//CodeTxtEditor.sendKeys(code);
}


public void App_of_Arr()
{
	AppOfArraylnk.click();
}
public String App_of_Arr_title()
{
	return dr.getTitle();
}
public void App_of_Arr_valid_phyton_code(String code6)

{
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code6).build().perform();
	//CodeTxtEditor.sendKeys(code);
}
public void App_of_Arr_invalid_phyton_code(String code7)

{
	//CodeTxtEditor1.clear();
	Actions act=new Actions(dr);
	//CodeTxtEditor.click();
	act.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

	act.sendKeys(CodeTxtEditor1,code7).build().perform();
	//CodeTxtEditor.sendKeys(code);
}

public void Practice_question()
{
	Practicequestlnk.click();
}
public String Practice_question_title()
{
	return dr.getTitle();
}
public void Search_the_array()
{
	Searchthearraylnk.click();
}
public String Search_the_array_title()
{
	return dr.getTitle();

}

public void valid_search_the_array(String code8) 
{
	
	//CodeTxtEditor1.clear();
	Actions act1=new Actions(dr);
	act1.moveToElement(textareacode).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(textareacode,code8).build().perform();
		}
		
		//CodeTxtEditor.sendKeys(code);	

public void click_run_on_question_page()
{
	try {
		runquestbutton.click();
	String result=runresult.getText();
	System.out.println("The Result is:"+result);
		}catch(UnhandledAlertException f) {
		try 
	    {
	Alert alert1 = dr.switchTo().alert();
	String alertMessage1= alert1.getText();
	 System.out.println(alertMessage1);
	 alert1.accept();
	    } catch (NoAlertPresentException e) {

	        e.printStackTrace();

	    }
	}
	
}

public void click_submit()
{
	
	submitbutton.click();
}
public void submit_result()
{
	
	String submitresult=Submitresult.getText();
	System.out.println("The Submit Result is:"+submitresult);

}

public void invalid_code(String code9)
{
	Actions act1=new Actions(dr);
	act1.moveToElement(textareacode).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();

		act1.sendKeys(textareacode,code9).build().perform();
}

public void error_alert_handle()
{
	
		
		String alertMessage1= "You accepted an alert";
		 System.out.println(alertMessage1);
		 
	

	}



public void max_consecutive_click()
{
	MaxConsecutive.click();
}
public void Even_no_click()
{
	EvenNo.click();
}
public void Sort_Array_click()
{
	SortArray.click();
}

}
	


