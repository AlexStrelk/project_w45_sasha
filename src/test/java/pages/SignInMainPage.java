package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static logger.CustomLogger.logger;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInMainPage {
    SelenideElement fieldLogin = $(byXpath("//input[@id='user_login']"));
    SelenideElement fieldPassword = $(byXpath("//input[@id='user_pass']"));
    SelenideElement pressButtonEnter = $(byXpath("//div/button[@name='submit']"));

    @Step
    public void fillFielLogin (String login){
        fieldLogin.sendKeys(login);
        logger.info(login + " OK ");
    }

    @Step
    public void fillFieldPassword (String password){
        fieldPassword.sendKeys(password);
        logger.info(password + " OK ");
    }

    @Step
    public void pressSubmit(){
        pressButtonEnter.click();
        logger.info("OK");
    }

}