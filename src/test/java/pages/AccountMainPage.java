package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AccountMainPage {
    SelenideElement profileName = $(byXpath("//span[text()='George']"));


    @Step
    public void checkAccountName (){
        profileName.shouldBe(Condition.visible);
        logger.info("OK");
    }
}
