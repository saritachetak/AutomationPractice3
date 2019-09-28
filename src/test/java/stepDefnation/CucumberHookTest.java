package stepDefnation;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberHookTest {
    public static WebDriver driver;
    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Chetakrao//IdeaProjects//AutomationPractice2//src//test//java//chromedriver.exe");
        driver=new ChromeDriver();


    }

    @After
    public void afterScenario(){
        driver.quit();

    }

}
