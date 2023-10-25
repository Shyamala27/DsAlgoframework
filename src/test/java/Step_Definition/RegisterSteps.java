package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Driver.Driver_Factory;
import Pages.HomePage;
import Pages.Register;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterSteps {
private Register reg= new Register(Driver_Factory.getDriver());
	
	
	@When("The user clicks Register button with {string},{string} and {string} empty")
	public void the_user_clicks_register_button_with_and_empty(String string, String string2, String string3) {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.all_empty(string, string2, string3);
		
		
	    
	}

	@Then("It should display an error Please fill out this field. below Username textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox() {
		String message=reg.err_username();
	    System.out.println("Warning mess is:" + message);
	  
	}

	@When("The user clicks Register button after entering username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(DataTable dataTable) {
		//DataTable
		
		List<Map<String,String>> Reglist=dataTable.asMaps();
		String uname=Reglist.get(0).get("username");
		String pass = null;
		String conf = null;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.name_otherempty(uname,pass,conf);
		
		
		
		
	  
	}

	@Then("It should display an error Please fill out this field below Password textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_textbox() {
		String message1=reg.err_password();
		System.out.println("Warning mess is:" + message1);
	   
	}

	@When("The user clicks Register button after entering username and password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty(DataTable dataTable) {
		List<Map<String,String>> Reglist1=dataTable.asMaps();
		String uname=Reglist1.get(0).get("username");
		String pass = Reglist1.get(0).get("password");
		String conf = null;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.confirmpass_empty(uname,pass,conf);
		
		
	}

	@Then("It should display an error Please fill out this field. below Password Confirmation textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_confirmation_textbox() {
		String message2=reg.err_confirmpassword();
		System.out.println("Warning mess is:" + message2);  
	}
	@When("The user enters a username with characters other than Letters, digits and symbols")
	public void the_user_enters_a_username_with_characters_other_than_letters_digits_and_symbols(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.uname_character(uname,pass,conf);
	   
	}

	@Then("It should display an error message Please enter a valid username")
	public void it_should_display_an_error_message_please_enter_a_valid_username() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="Please enter a valid username";
		Assert.assertEquals(message3, expectedmessage);

	}

	@When("The user enters a valid existing username with password and password confirmation")
	public void the_user_enters_a_valid_existing_username_with_password_and_password_confirmation(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.uname_existing(uname,pass,conf);
	    
	}

	@Then("It should display an error message Username already exists")
	public void it_should_display_an_error_message_username_already_exists() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="Username already exists";
		Assert.assertEquals(message3, expectedmessage);

	  	}

	@When("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields")
	public void the_user_clicks_register_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.pass_mismatch(uname,pass,conf);
	   
	}

	@Then("It should display an error message password mismatch The two password fields didnt match")
	public void it_should_display_an_error_message_password_mismatch_the_two_password_fields_didnt_match() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(message3, expectedmessage);


	   
	}

	@When("The user enters a valid username and password with characters less than eight")
	public void the_user_enters_a_valid_username_and_password_with_characters_less_than_eight(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.pass_mismatch(uname,pass,conf);
		
	   
	}

	@Then("It should display an error message Password should contain at least eight characters")
	public void it_should_display_an_error_message_password_should_contain_at_least_eight_characters() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="Password should contain at least 8 characters";
		Assert.assertEquals(message3, expectedmessage);

	    
	}

	@When("The user enters a valid username and password with only numbers")
	public void the_user_enters_a_valid_username_and_password_with_only_numbers(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.only_number(uname,pass,conf);
	   
	}

	@Then("It should display an error message Password cant be entirely numeric")
	public void it_should_display_an_error_message_password_cant_be_entirely_numeric() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="Password can’t be entirely numeric.";
		Assert.assertEquals(message3, expectedmessage);

	}

	@When("The user enters a valid username and password similar to username")
	public void the_user_enters_a_valid_username_and_password_similar_to_username(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.uname_pass_similar(uname,pass,conf);
	    
	}

	@Then("It should display an error message password cant be too similar to your other personal information")
	public void it_should_display_an_error_message_password_cant_be_too_similar_to_your_other_personal_information() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="password can’t be too similar to your other personal information.";
		Assert.assertEquals(message3, expectedmessage);

	    
	}

	@When("The user enters a valid username and commonly used password password")
	public void the_user_enters_a_valid_username_and_commonly_used_password_password(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.commonly_used_pass(uname,pass,conf);
	    
	}

	@Then("It should display an error message Password cant be commonly used password")
	public void it_should_display_an_error_message_password_cant_be_commonly_used_password() throws IOException {
		String message3=reg.err_Alert();
		reg.Sshot();
		String expectedmessage="Password can’t be commonly used password";
		Assert.assertEquals(message3, expectedmessage);

	    
	}

	@When("The user enters a valid username and password and password confirmation")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		String conf = Reglist2.get(0).get("password confirmation");;
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		reg.Register_success(uname,pass,conf);
	    
	}

	@Then("The user should be redirected to Homepage with the message New Account Created You are logged in as username")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_as_username() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		String Success=reg.success_mess();
	   
	}

	@When("The user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password(DataTable dataTable) {
		List<Map<String,String>> Reglist2=dataTable.asMaps();
		String uname=Reglist2.get(0).get("username");
		String pass = Reglist2.get(0).get("password");
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		reg.signin_success(uname,pass);
		
	   	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		String Success=reg.login_success_mess();
		
	    	}


	}


