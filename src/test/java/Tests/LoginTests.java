package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

   private WebDriver driver;
   private HomePage homePage;
   private LoginPage loginPage;


    @BeforeEach
    void setup () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get("https://www.hepsiburada.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

    }

    @Test
    void hepsiburadaLoginTest () throws InterruptedException {

        homePage.waitVisible(homePage.myAccount);
        homePage.buttonClick(homePage.myAccount);

        homePage.waitClickable(homePage.login);
        homePage.buttonClick(homePage.login);

        loginPage.waitVisibleId(loginPage.email);
        loginPage.writeField(loginPage.email, "test@gmail.com");

        loginPage.waitVisibleId(loginPage.loginBtn);
        loginPage.butonClick(loginPage.loginBtn);

    }

    @Test
    void HepsiBuradaSearchTest () throws InterruptedException {

        homePage.buton(homePage.buton);
        homePage.butonClickCss(homePage.searchTik);
        homePage.waitVisibleCss(homePage.search);
        homePage.writeFieldSearch(homePage.search, "Telefon");
        homePage.searchBox(homePage.searchBox);

    }

    @AfterEach
    void teardown (){
        driver.close();
    }
}

