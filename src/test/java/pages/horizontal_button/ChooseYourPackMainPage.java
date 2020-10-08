package pages.vertical;
import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ChooseYourPackMainPage {
    SelenideElement buttonChooseYourPack = $(byXpath("//li[@id='menu-item-246']"));
    String controlText = "//div//h1";

    @Step
    public void pressButtonChooseYourPack() {
        buttonChooseYourPack.click();
        logger.info("OK");


    }

    @Step
    public void findControlText(String text) {
        checkUrl("shedule");
        $(byXpath(controlText+"[text()='"+text+"']")).shouldBe(Condition.visible);
        logger.info("text " +text+" is visible");
    }
}