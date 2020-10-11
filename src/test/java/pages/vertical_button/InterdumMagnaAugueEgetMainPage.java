package pages.vertical_button;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


public class InterdumMagnaAugueEgetMainPage {
    SelenideElement buttonInterdumMagnaAugueEget =
            $(byXpath("//*[@id='recent-posts-2']//a[text()='Interdum magna augue eget']"));
   String controlText = "//*[@class='entry-header clr']/h2[text()='Interdum magna augue eget']";


    @Step
    public void pressButtonInterdumMagnaAugueEget() {
        buttonInterdumMagnaAugueEget.click();
        logger.info("OK");
    }
    @Step
    public void checkControlText(String text){

        $(byXpath(controlText+ "[text()='"+text+"']")).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }

}


