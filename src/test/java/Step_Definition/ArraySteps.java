package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import Util.ExcelReader;

import Driver.Driver_Factory;
import Pages.Array;
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

public class ArraySteps {
	
	private Array Arr= new Array(Driver_Factory.getDriver());

	@When("The user enter valid username and password to prepare for array")
	public void the_user_enter_valid_username_and_password_to_prepare_for_array(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Arr.login_success(uname, pass);
	}

	
	@When("The user click on login button on the login screen")
	public void the_user_click_on_login_button_on_the_login_screen() {
		Arr.login_submit();
	   
	}
	@Then("The user is on the home page screen after logged in and can access array panel")
	public void the_user_is_on_the_home_page_screen_after_logged_in_and_can_access_array_panel() {
		String title=Arr.home_page_title();
		System.out.println("the title:"+title);
		String expectedtitle="NumpyNinja" ;
		Assert.assertEquals(title, expectedtitle);
	}

	
	
	
	@When("The user clicks the Getting Started button in Array Panel")
	public void the_user_clicks_the_getting_started_button_in_array_panel() {
		
		Arr.user_click_ArrayGetStart();

	    
	}

	@Then("The user be directed to ARRAY Data Structure Page")
	public void the_user_be_directed_to_array_data_structure_page() {
		String title=Arr.Array_get_title();
		System.out.println("the title:"+title);
		String expectedtitle="Array" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
		Arr.arr_in_phython();
	    
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		String title=Arr.Arr_Phy_get_title();
		System.out.println("the title:"+title);
		String expectedtitle="Arrays in Python" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		Arr.click_try_here();
	   
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String title=Arr.tryeditor_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
	    
	}

	@When("The user enter a valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_a_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData(".\\Excel\\DsAlgo_data.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArraypythonCode");
		Arr.Arr_valid_phyton_code(code1);
	   
	}

	@When("The user enter a python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_a_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArraypythonCode");
		Arr.Arr_invalid_phyton_code(code1);
	
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array");
		Arr.Arr_using_list();

		
	   
	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		String title=Arr.Arr_list_title();
		System.out.println("the title:"+title);
		String expectedtitle="Arrays Using List" ;
		Assert.assertEquals(title, expectedtitle);
		
	   	}

	@When("The user enter valid python code in tryEditor from the sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_the_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArrayListpythonCode");
		Arr.Arr_valid_list_phyton_code(code1);
	   
	}

	@When("The user enters a python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enters_a_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArrayListpythonCode");
		Arr.Arr_invalid_list_phyton_code(code1);    	
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array");
		Arr.BO_list();
		 }

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		String title=Arr.BO_list_title();
		System.out.println("the title:"+title);
		String expectedtitle="Basic Operations in Lists" ;
		Assert.assertEquals(title, expectedtitle);
		}

	@When("The user enter the valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_the_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("BOpythonCode");
		Arr.BO_valid_list_phyton_code(code1);
	    	}

	@When("The user enter the python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_the_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("BOpythonCode");
		Arr.BO_invalid_list_phyton_code(code1);
	    
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array");
		Arr.App_of_Arr();

	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		String title=Arr.App_of_Arr_title();
		System.out.println("the title:"+title);
		String expectedtitle="Applications of Array" ;
		Assert.assertEquals(title, expectedtitle);
		
	   	}

	@When("The user enters valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("AppArraypythonCode");
		Arr.BO_valid_list_phyton_code(code1);
		
	   	}

	@When("The user enters python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enters_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("AppArraypythonCode");
		Arr.BO_valid_list_phyton_code(code1);
	   	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		Arr.Practice_question();

	    
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		String title=Arr.Practice_question_title();
		System.out.println("the title:"+title);
		String expectedtitle="Practice Questions" ;
		Assert.assertEquals(title, expectedtitle);
		
	   	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		Arr.Search_the_array();
	   	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
		String title=Arr.Search_the_array_title();
		System.out.println("the title:"+title);
		String expectedtitle="Assessment" ;
		Assert.assertEquals(title, expectedtitle);
		//Arr.clear_textarea();

		
	   	}
	@When("The user enter valid search array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_search_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);
	}

@When("The user clicks on run button on the question page")
public void the_user_clicks_on_run_button_on_the_question_page() {
   Arr.click_run_on_question_page();
}


	@When("The user enters a valid search array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enters_a_valid_search_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);
	}

	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
		Arr.click_submit();
	   
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		Arr.submit_result();
	    	}

	@When("The user enter invalid search array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_search_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.invalid_code(code1);
		
	}
	
	@Then("The user should be presented with error message in the question page")
	public void the_user_should_be_presented_with_error_message_in_the_question_page() {
	    Arr.error_alert_handle();
	}


	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array/practice");
		Arr.max_consecutive_click();

	}

	@When("The user enter valid Max Consecutive python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_max_consecutive_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);
	}

	@When("The user enters a valid Max Consecutive python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enters_a_valid_max_consecutive_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);
	}

	@When("The user enter python code with invalid Max Consecutive syntax in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_python_code_with_invalid_max_consecutive_syntax_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.invalid_code(code1);    	
	}

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array/practice");
		Arr.Even_no_click();
	    	}

	@When("The user enter valid python Find Numbers with Even Number of Digits code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_find_numbers_with_even_number_of_digits_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);   	
	}

	@When("The user enters a valid Find Numbers with Even Number of Digits python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enters_a_valid_find_numbers_with_even_number_of_digits_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);   	   	
	}

	@When("The user enter python code with invalid Find Numbers with Even Number of Digits syntax in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_python_code_with_invalid_find_numbers_with_even_number_of_digits_syntax_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.invalid_code(code1);    	
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/array/practice");
		Arr.Sort_Array_click();
	    
	}

	@When("The user enter valid Squares of a Sorted Array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_squares_of_a_sorted_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);   	
	}

	@When("The user enters a valid Squares of a Sorted Array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enters_a_valid_squares_of_a_sorted_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.valid_search_the_array(code1);   	
	}

	@When("The user enter invalid Squares of a Sorted Array python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_squares_of_a_sorted_array_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/DsAlgoProject/Excel/DsAlgo_data (3).xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("QPpythonCode");
		//Arr.clear_textarea();
		//Thread.sleep(3000);
		Arr.invalid_code(code1);
	}
	
}	


