package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public final String myAccount = "//div[@id='myAccount']";
    public final String login = "//a[@id='login']";
    public final String search = "[placeholder='Ürün, kategori veya marka ara']";
    public final String searchTik = "//div[text()='Ürün, kategori veya marka ara']";
    public final String searchBox = "div[class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']";
    public final String buton = "button[id='onetrust-accept-btn-handler']";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
