package pages.horizontal_button;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PricingMainPage {
    SelenideElement buttonPricing = $(byXpath("//li[@id='menu-item-247']"));
    String controlText = "//h1";

    @Step
    public void pressButtonpricing() {
        buttonPricing.click();
        logger.info("OK");
    }

    @Step
    public void findControlText(String text) {
        $(byXpath(controlText + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info("text " + text + " is visible");
    }

}
