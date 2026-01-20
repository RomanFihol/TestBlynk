package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final SelenideElement getStarted = $(".get-started-sider-header-container");

    public void checkPageIsOpen() {
        getStarted.shouldBe(Condition.visible);
    }
}
