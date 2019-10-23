package stepDefinitions;

import io.cucumber.datatable.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.List;


public class OrangeHRMsteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("launch");

    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("open");
    }

    @Then("I verify the the logo present on page")
    public void i_verify_the_the_logo_present_on_page() {
        boolean status = driver.findElement(By.id("divLogo")).isDisplayed();
        Assert.assertTrue(status);
        System.out.println("logo");
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
        System.out.println("close");
    }

}