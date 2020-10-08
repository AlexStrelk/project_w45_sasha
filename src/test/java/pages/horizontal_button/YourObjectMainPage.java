package pages.vertical;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;

public class YourObjectMainPage {
    SelenideElement buttonYourObjective = $(byXpath("//li[@id='menu-item-244']"));
    String controlText = "//div[@class='perelinkovka_service']//h2";

    @Step
    public void findControlText(String text) {
        checkUrl("5element");
        $(byXpath(controlText + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info("Element " + text + " is visible");

    }


    @Step
    public void pressButtonYourObjective() {
        buttonYourObjective.click();
        logger.info("OK");
    }

}