package pages.vertical_button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static common.CommonSteps.checkUrl;
import static logger.CustomLogger.logger;


public class MetusVitaePharetraAuctorMainPage {
     SelenideElement buttometusVitaePharetraAuctor =
             $(byXpath("//*[@id='recent-posts-2']//a[text()='Metus vitae pharetra auctor']"));
   String controlText = "//*[@class='entry-header clr']/h2";


     @Step
    public void pressButtonMetusVitaePharetraAuctor(){
       buttometusVitaePharetraAuctor.click();
       logger.info("OK");
   }

   @Step
    public void checkControlText(String text){
         $(byXpath(controlText+"[text()='"+text+"']")).shouldBe(Condition.visible);
         logger.info(text + " is visible");
   }
}
