package pages.horizontal_button;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SearchPage {
    String controlText = "//a[text()='Litora torqent per conubia']";


    @Step
    public void searchControlText(String text) {
        $(byXpath(controlText + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

}
