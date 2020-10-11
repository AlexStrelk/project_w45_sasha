package pages.horizontal_button;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AchieveYourGoalMainPage {

    SelenideElement buttonAchieveYourGoal = $(byXpath("//li[@id='menu-item-245']"));
    String controlText = "//div//h1";

    @Step
    public void pressButtonAchieveYourGoal() {
        buttonAchieveYourGoal.click();
        logger.info("OK");
    }


    @Step
    public void findControlText(String text) {
        $(byXpath(controlText + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info("Ok");

    }
}