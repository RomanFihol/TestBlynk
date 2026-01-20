package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class LoginPageTest extends BaseTest {

    private final String email = "pivoki2933@oremal.com";
    private final String pass = "qwerty!@#";

    @Test(description = "Test login")
    public void loginTest() {
        DashboardPage dashboardPage = openLoginPage()
                .login(email, pass);
        dashboardPage.checkPageIsOpen();
    }

    @Test(description = "Check that main elements are presented")
    public void elementsCheck() {
        openLoginPage().checkMainElements();
    }

}
