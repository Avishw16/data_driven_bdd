package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepdef {

    WebDriver driver;

    @Given("User is in flipkart home page")
    public void user_is_in_flipkart_home_page() {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\avish\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @When("User login")
    public void user_login() {
        System.out.println("pass");
    }

    @Then("successful login")
    public void successful_login() {
        System.out.println("pass");
    }
}
