package saucedemo.testcases.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemo.constants.User;
import saucedemo.pages.InventoryPage;
import saucedemo.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class LoginTest  extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Steps
    LoginPage loginPage;

    InventoryPage inventoryPage;

    @Test
    public void verifyValidUserLogin() throws InterruptedException {

//        openUrl(SAUCEDEMO_URL);
//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        assertThat(driver.findElement(By.cssSelector(".title")).getText()).isEqualToIgnoringCase("Products");


        loginPage.loginAs(User.STANDARD_USER);
        assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");
    }


}
