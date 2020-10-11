package pages.vertical_button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;


public class PraesentLibroSeCursusAnteMainPage {
   SelenideElement buttonPraesentLibroSeCursusAnte =
           $(byXpath("//*[@id='recent-posts-2']//a[text()='Praesent libro se cursus ante']"));
   String controlText = "//*[@class='entry-header clr']/h2";

     @Step
    public void pressButtonPraesentLibroSeCursusAnte(){
         buttonPraesentLibroSeCursusAnte.click();
         logger.info("OK");
     }

    @Step
    public void checkControlText(String text){
         $(byXpath(controlText+ "[text()='"+text+"']")).shouldBe(Condition.visible);
         logger.info(text + " is visible");
    }

}
