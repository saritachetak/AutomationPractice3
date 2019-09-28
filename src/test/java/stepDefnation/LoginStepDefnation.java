package stepDefnation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginStepDefnation {

    public static WebDriver driver;
    @Given("^user using chrome$")
    public void user_using_firefox()  {
        System.out.println("user using chrome");
        System.setProperty("webdriver.chrome.driver","C://Users//Chetakrao//IdeaProjects//AutomationPractice3//src//test//java//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.Facebook.com");


    }

    @When("^create a facebook login page$")
    public void create_a_facebook_login_page()  {
        System.out.println("create a facebook page");

    }
    @Then("^I can see the elements username and password$")
    public void i_can_see_the_elements_username_and_password()  {
        System.out.println("i can see the elements");
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));


    }


}
