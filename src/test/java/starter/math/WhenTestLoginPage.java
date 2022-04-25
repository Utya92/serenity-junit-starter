package starter.math;


import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.steps.TestLoginPageSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenTestLoginPage {


    @Steps
    TestLoginPageSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void testPage(){
        steps.openPage();
        steps.clickButtonLogin();
        steps.writeEmail("test@test.com");
        steps.writePassword("1213dwdf3");
        steps.clickButtonLoginInForm();
    }
}
