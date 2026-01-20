package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement mainLogo = $("img.login-logo");
    private final SelenideElement loginForm = $("div.login-form-wrapper");
    private final SelenideElement emailInput = $("#email");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("button[type='Submit']");

    public void checkVisible(SelenideElement element, String elementName) {
        element.shouldBe(Condition.visible);
    }


    public void checkMainElements() {
        checkVisible(mainLogo, "Main logo");
        checkVisible(loginForm, "Login form");
    }

    public DashboardPage login(String email, String pass) {
        emailInput.setValue(email);
        passwordInput.setValue(pass);
        loginButton.click();
        return new DashboardPage();
    }
}
