package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import Util.ExcelReader;

import Driver.Driver_Factory;
import Pages.DataStructures;
import Pages.HomePage;
import Pages.Register;
import Pages.SignIn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataStructuresSteps {
private DataStructures DS= new DataStructures(Driver_Factory.getDriver());
	
	@When("The user enter valid username and password")
	public void the_user_enter_valid_username_and_password(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		DS.login_success(uname, pass);
	    	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		DS.login_submit();
	   
	}

	@Then("The user is on the home page screen after logged in")
	public void the_user_is_on_the_home_page_screen_after_logged_in() {
		String title=DS.home_page_title();
		System.out.println("the title:"+title);
		String expectedtitle="NumpyNinja" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks the Getting Started button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_getting_started_button_in_data_structure_page_introduction_panel() throws InterruptedException {
	
		DS.user_click_DSGetStart();
		
		}
	

	@Then("The user is on Data Structures Introduction page")
	public void the_user_is_on_data_structures_introduction_page() {
		String title=DS.DS_page_title();
		System.out.println("the title:"+title);
		String expectedtitle="Data Structures-Introduction" ;
		Assert.assertEquals(title, expectedtitle);
	  
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		DS.time_complex_click();
	  
	}

	@Then("The user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		String title=DS.time_complex_title();
		System.out.println("the title:"+title);
		String expectedtitle="Time Complexity" ;
		Assert.assertEquals(title, expectedtitle);
	}

	@When("The user clicks Try Here button on Time Complexity page")
	public void the_user_clicks_try_here_button_on_time_complexity_page() {
		DS.tryhere_click();
	   
	}

	@Then("The user should be redirected to try editor page")
	public void the_user_should_be_redirected_to_try_editor_page() {
		String title=DS.tryeditor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	  
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("Valid Code");
		DS.valid_phyton_code(code1);
	   
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
	   DS.run_click();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
	   DS.run_result();
	
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code2=testData.get(RowNumber).get("Invalid Code");
		DS.valid_phyton_code(code2);
		
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		DS.handle_alert();
		

	    
	}

	@Then("The user logs out successfully")
	public void the_user_logs_out_successfully() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		DS.sign_out();
	}



	
	



}


