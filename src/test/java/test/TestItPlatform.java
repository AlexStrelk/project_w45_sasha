package test;

import data.UserItPlatforma;
import runner.Debug;
import data.Projects;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class TestItPlatform extends Debug {


    @Test
    public void openMainPageItPlaformaAndLogin() {


        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());

        itPlatformaMainPage.pressButtonSignIn();

        signInMainPage.fillFielLogin(UserItPlatforma.login.getValue());

        signInMainPage.fillFieldPassword(UserItPlatforma.password.getValue());

        signInMainPage.pressSubmit();
        accountMainPage.checkAccountName();
        sleep(5000);
    }

    @Test
    public void negativeTestLoginPasswordEmpty() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());

        itPlatformaMainPage.pressButtonSignIn();

        signInMainPage.fillFielLogin("");

        signInMainPage.fillFieldPassword("");
        signInMainPage.pressSubmit();
        accountMainPage.checkAccountName();



    }

}