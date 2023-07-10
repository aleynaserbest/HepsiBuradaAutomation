package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    WebDriver driver;

    public Page (WebDriver driver){
        this.driver = driver;

    }

    public void waitVisible (String elementXpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath)));
    }

    public void waitVisibleId (String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void waitVisibleCss (String elementCss) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementCss)));
    }

    public void buttonClick (String buttonXpath) {

        driver.findElement(By.xpath(buttonXpath)).click();
    }

    public void butonClick (String buttonId) {

        driver.findElement(By.id(buttonId)).click();
    }

    public void butonClickCss (String butonCss) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", driver.findElement(By.xpath(butonCss)));
    }

    public void writeField (String elementId, String email) {
        driver.findElement(By.id(elementId)).sendKeys(email);
    }

    public void writeFieldSearch (String elementCss,String search) {
        driver.findElement(By.cssSelector(elementCss)).sendKeys(search);

    }

    public void waitClickable (String elementXpath){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
    }


    public void searchBox (String elementXpath) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", driver.findElement(By.cssSelector(elementXpath)));
    }

    public void buton (String element) {
        driver.findElement(By.cssSelector(element));
    }
}
