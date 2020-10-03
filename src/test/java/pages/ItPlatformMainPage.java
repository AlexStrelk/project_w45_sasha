package pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static logger.CustomLogger.logger;



public  class ItPlatformMainPage {

    SelenideElement buttonSignIn = $(byXpath("//span[text()='Sign in']"));


    @Step
    public  void pressButtonSignIn(){
        buttonSignIn.click();
        logger.info("OK");


    }



}