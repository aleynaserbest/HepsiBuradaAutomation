package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    public final String email = "txtUserName";
    public final String loginBtn = "btnLogin";
    public final String password = "txtPassword";
    public final String btnLogin = "//button[@id='btnEmailSelect']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
