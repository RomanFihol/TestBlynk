package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp (){
        Configuration.browser = "chrome";
    }

    public LoginPage openLoginPage () {
        open("https://blynk.cloud/dashboard/login");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        return new LoginPage();
    }
}
