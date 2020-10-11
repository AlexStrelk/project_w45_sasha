package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static logger.CustomLogger.logger;

public class ItPlatformMainPage {

    SelenideElement searchField = $(byXpath("//input"));

    public void fillSearchField(String text) {
         searchField.sendKeys(text);
         searchField.sendKeys(Keys.ENTER);
         logger.info("text" + text + " filled in search");

    }


}