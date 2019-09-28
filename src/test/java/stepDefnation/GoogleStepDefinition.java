package stepDefnation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import static stepDefnation.LoginStepDefnation.driver;

public class GoogleStepDefinition {

    @Given("^user using chrome website$")
    public void user_using_chrome_website() throws Throwable {
        System.out.println("user using chrome website");
        System.setProperty("webdriver.chrome.driver", "C://Users//Chetakrao//IdeaProjects//AutomationPractice3//src//test//java//chromedriver.exe");
                driver=new ChromeDriver();
           driver.get(" https://www.google.com");


    }

    @When("^user enter the google page$")
    public void user_enter_the_google_page() throws Throwable {
        System.out.println("user enter the google page");

    }

    @Then("^user can see the search button$")
    public void user_can_see_the_search_button() throws Throwable {
        System.out.println("user can see the search button");
        Assert.assertEquals(true,driver.getTitle().contains("Google"));

       //driver.quit();

    }


}
