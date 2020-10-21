package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {

//WebDriver driver;

LoginPage loginpage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//         driver.get("http://qa1.vytrack.com");

        Driver.getDriver().get("http://qa1.vytrack.com");
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @When("user logs in")
    public void user_logs_in() throws InterruptedException {
//        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager110");
//        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
      loginpage.login();

       Thread.sleep(6000);

    }

    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "Dashboard";
       // String actual = driver.findElement(By.className("oro-subtitle")).getText().trim();

        String  actual=loginpage.getPageSubTitleText();

        Assert.assertEquals("Title is not correct!", expected, actual);
        System.out.println("I see the Dashboard page!");

//        System.out.println("I see the Dashboard page!");
//        System.out.println("I see the Dashboard page!");

       Driver.closeDriver();
    }

    //when driver
    //when salesmanager
    //storemanager

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) throws InterruptedException {
       loginpage.login(string);
        Thread.sleep(6000);
    }

    @When("user logs in as a {string} and {string}")
    public void user_logs_in_as_a_and(String string, String string2) throws InterruptedException {
        loginpage.login(string,string2);
        Thread.sleep(6000);
    }


}
