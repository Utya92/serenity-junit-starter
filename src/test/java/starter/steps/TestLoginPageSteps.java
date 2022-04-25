package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.page.TestLoginPage;

public class TestLoginPageSteps {

    TestLoginPage testLoginPage;

    @Step
    public void openPage() {
        testLoginPage.open();
    }

    @Step
    public void clickButtonLogin(){
        testLoginPage.clickButtonLogin();
    }

    @Step
    public void writeEmail(String email) {
     testLoginPage.writeInputEmail(email);
    }

    @Step
    public void writePassword(String password) {
        testLoginPage.writePassword(password);
    }

    @Step
    public void clickButtonLoginInForm(){
        testLoginPage.clickButtonLoginInForm();
    }
}
