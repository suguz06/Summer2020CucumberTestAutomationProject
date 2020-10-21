package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.LogoutPage;
import com.vytrack.utils.BrowserUtils;
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

public class LogoutStepDefinitions {


    WebDriver driver;
    LoginPage loginpage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("user on the home page")
    public void user_on_the_home_page() throws InterruptedException {
//        System.out.println("home page");
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("http://qa1.vytrack.com");
//        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager110");
//        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        // Thread.sleep(3000);
        //      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        Driver.getDriver().get("http://qa1.vytrack.com");
        loginpage.login();
        BrowserUtils.wait(5);

    }

    @When("user logs out")
    public void user_logs_out() throws InterruptedException {
        System.out.println("log out");
//        driver.findElement(By.partialLinkText("Yesenia")).click();
//        driver.findElement(By.partialLinkText("Logout")).click();

        logoutPage.logut();
        Thread.sleep(3000);
    }

    @Then("user should see login page")
    public void user_should_see_login_page() {
        System.out.println("login page");
        String expected = "Login";
        //String actual = driver.getTitle();
       // System.out.println(actual);
        String actual=logoutPage.getloginPageTitle();
        Assert.assertTrue(actual.equals("Login"));
    }


}
