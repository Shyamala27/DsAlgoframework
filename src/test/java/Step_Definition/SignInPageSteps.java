package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import Util.ExcelReader;

import Driver.Driver_Factory;
import Pages.HomePage;
import Pages.Register;
import Pages.SignIn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SignInPageSteps {
private SignIn sign= new SignIn(Driver_Factory.getDriver());
	
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		sign.signin_to_register();
		
		
		
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
		String title=sign.verify_register_page_title();
		System.out.println("the title:"+title);
		String expectedtitle="Registration" ;
		Assert.assertEquals(title, expectedtitle);
		
	    
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/register");
		String title=sign.verify_signin_title();
		System.out.println("the title:"+title);
		String expectedtitle="Login" ;
		Assert.assertEquals(title, expectedtitle);
	   
	}

	@When("The user enter invalid username and password")
	public void the_user_enter_invalid_username_and_password(DataTable dataTable) throws IOException {
	
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		sign.invalid_sign_in(uname,pass);
		
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String uname1=testData.get(RowNumber).get("username");
		String pass1=testData.get(RowNumber).get("password");
		sign.signin_excel(uname1, pass1);
		
		
		
		
		

	
	}

	@Then("click login button to verify login and verify Sign out")
	public void click_login_button_to_verify_login_and_verify_Sign_out() {
		sign.click_login();
		sign.capture_signin_mess();
		sign.signout();

	}
	
	


}


