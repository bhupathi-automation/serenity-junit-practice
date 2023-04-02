package saucedemo.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import saucedemo.constants.General;
import saucedemo.constants.User;

public class LoginPage extends UIInteractionSteps {


    @Step("Login as {0}")
    public void loginAs(User user) throws InterruptedException {

        openUrl(General.SAUCEDEMO_URL);

//        getDriver().findElement(By.id("")).sendKeys("");
//        find(By.id("")).sendKeys("");

//        $("[data-test='username']").sendKeys(user.getUsername());
        $("[name='user-name']").sendKeys(user.getUsername());
        $("[name='password']").sendKeys(user.getPassword());
        $("[name='login-button']").click();
        Thread.sleep(3000);

//        $("#user-name").sendKeys(user.getUsername());
//        $("#password").sendKeys(user.getPassword());
//        $("#login-button").click();

        Thread.sleep(1000);
        System.out.println("title is: ");
    }
}
