package test;

import com.codeborne.selenide.Selenide;
import data.Projects;
import data.UserItPlatforma;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import runner.Debug;
import utils.ExcelUtils;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static common.CommonSteps.checkUrl;


public class TestItPlatform extends Debug {
    @DataProvider
    public Object[][] testObjArray1() {
        return ExcelUtils.getTableArray("src//test//resources//TestData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "testObjArray1")
    public void test1(String var1, String var2) {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }

    @Test(priority = 1)
    public void openMainPageItPlaformaAndLogin() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        signInMainPage.pressButtonSignIn();
        signInMainPage.fillFielLogin(UserItPlatforma.login.getValue());
        signInMainPage.fillFieldPassword(UserItPlatforma.password.getValue());
        signInMainPage.pressSubmit();
        accountMainPage.checkAccountName();
        sleep(5000);
    }

    @Test(priority = 2)
    public void negativeTestLoginPasswordEmpty() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        signInMainPage.pressButtonSignIn();
        signInMainPage.fillFielLogin("");
        signInMainPage.fillFieldPassword("");
        signInMainPage.pressSubmit();
        accountMainPage.checkAccountName();
    }

    @Test(priority = 3)
    public void checkYourObject() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        yourObjectMainPage.pressButtonYourObjective();
        yourObjectMainPage.findControlText("Фитнес");
        checkUrl("5element");
        Selenide.back();

    }

    @Test(priority = 4)
    public void checkAchieveYourGoal() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        achieveYourGoalMainPage.pressButtonAchieveYourGoal();
        achieveYourGoalMainPage.findControlText("Семь причин воспользоваться ");
        checkUrl("special_offer");
        Selenide.back();
    }

    @Test(priority = 5)
    public void checkChooseYourPackMainPage() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        chooseYourPackMainPage.pressButtonChooseYourPack();
        chooseYourPackMainPage.findControlText(" Расписания");
        checkUrl("shedule");
    }

    @Test(priority = 6)
    public void checkPricingMainPage() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        pricingMainPage.pressButtonpricing();
        pricingMainPage.findControlText("Клубная карта");
        checkUrl("klubnye-karty");
    }

    @Test(priority = 7)
    public void checkNequeAdipiscingAnCursus() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        nequeAdipiscingAnCursusMainPage.pressButtonNequeAdipiscingAnCursus();
        nequeAdipiscingAnCursusMainPage.checkControlText("Neque adipiscing an cursus");
        checkUrl("neque-adipiscing-an-cursus");
    }

    @Test(priority = 8)
    public void checkLitoraTorqentPerConubia() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        litoraTorqentPerConubiaMainPage.pressButtomLitoraTorqentPerConubia();
        litoraTorqentPerConubiaMainPage.checkControlText("Litora torqent per conubia");
        checkUrl("litora-torqent-per-conubia");
    }

    @Test(priority = 9)
    public void checkPraesentLibroSeCursusAnte() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        praesentLibroSeCursusAnteMainPage.pressButtonPraesentLibroSeCursusAnte();
        praesentLibroSeCursusAnteMainPage.checkControlText("Praesent libro se cursus ante");
        checkUrl("praesent-libro-se-cursus-ante");
    }

    @Test(priority = 10)
    public void checkMetusVitaePharetraAuctor() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        metusVitaePharetraAuctorMainPage.pressButtonMetusVitaePharetraAuctor();
        metusVitaePharetraAuctorMainPage.checkControlText("Metus vitae pharetra auctor");
        checkUrl("metus-vitae-pharetra-auctor");
    }

    @Test(priority = 11)
    public void checkInterdumMagnaAugueEget() {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        interdumMagnaAugueEgetMainPage.pressButtonInterdumMagnaAugueEget();
        interdumMagnaAugueEgetMainPage.checkControlText("Interdum magna augue eget");
        checkUrl("interdum-magna-augue-eget");
    }

    @Test(dataProvider = "testObjArray1")
    public void checkSearchField(String var1) {
        open(Projects.IT_PLATFORMA_MAIN_PAGE.getUrl());
        itPlatformaMainPage.fillSearchField(var1);
        searchPage.searchControlText("Litora torqent per conubia");
        checkUrl("Litora+torqent+per+conubia");
    }

}
