package pages.vertical_button;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NequeAdipiscingAnCursusMainPage {
    SelenideElement buttonNequeAdipiscingAnCursus = $(byXpath("//*[@id='recent-posts-2']//a"));
    String controlText ="//h2";

    @Step
   public void pressButtonNequeAdipiscingAnCursus(){
        buttonNequeAdipiscingAnCursus.click();
        logger.info("OK");
    }

    @Step
    public void checkControlText(String text){
        $(byXpath(controlText+"[text()='"+text+"']")).shouldBe(Condition.visible);
        logger.info("control text "+ text + " is visible");
    }
}

