package starter.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://unsplash.com/")
public class TestLoginPage extends PageObject {

    private By buttonLogin = By.xpath("//*[@id='app']/div/header/nav/div[5]/a[1]");
    private By inputEmail = By.xpath("//*[@id='user_email']");
    private By inputPassword = By.xpath("//*[@id='user_password']");
    private By buttonLoginInForm = By.xpath("/html/body/div[2]/div/div/div/div/form/div[3]/input");


    public TestLoginPage clickButtonLogin() {
        find(buttonLogin).click();
        return this;
    }

    public TestLoginPage writeInputEmail(String email) {
        find(inputEmail).sendKeys(email);
        return this;
    }

    public TestLoginPage writePassword(String password) {
        find(inputPassword).sendKeys(password);
        return this;
    }

    public TestLoginPage clickButtonLoginInForm() {
        find(buttonLoginInForm).click();
        return this;
    }

}
