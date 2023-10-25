package Step_Definition;
import java.io.IOException;
import java.time.Duration;
import Driver.Driver_Factory;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import Utilities.Loggerload;

public class HomePageSteps {
	private HomePage hmpg= new HomePage(Driver_Factory.getDriver());
	@Given("The user opens DS Algo portal link")

	public void the_user_opens_ds_algo_portal_link() {
	    String title=hmpg.open_portallink();
	    Loggerload.info(title);
	    System.out.println("The title of launch portal is:"+title);
	    Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		Loggerload.info("******************* Launching Home Page******************");
		hmpg.launch();
	   
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	   hmpg.homepage();
	}


	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
		
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	hmpg.Getstart_click(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) throws IOException {
	   hmpg.warning_mess(string);
	   Loggerload.warn("******************You have got a login failure warning*********************");
	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) throws InterruptedException {
		Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		hmpg.droplist(string);
	    
	}

	@Then("The user get warning message again {string}")
	public void the_user_get_warning_message_again(String string) throws IOException {
		hmpg.warning_mess(string);
		Loggerload.warn("******************You have got a login failure warning*********************");

	}


	@When("The user click the Sign In button")
	public void the_user_click_the_sign_in_button() {
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		hmpg.signin_click();
	    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		String launch=hmpg.launch_signin();
	    //Driver_Factory.getDriver().getTitle();
	System.out.println("The Title of the page is:" + launch);
	Loggerload.info("*************Launching Signin Page*******************");
	}

	@Then("The user clicks Register")
	public void the_user_clicks_register() {
		hmpg.register_click();
	   
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/register");
		
		 String title=hmpg.launch_register();
		 System.out.println("The title of this page is:" +title);
		 Loggerload.info("*************Launching Registration Page*******************");

	}


	}


