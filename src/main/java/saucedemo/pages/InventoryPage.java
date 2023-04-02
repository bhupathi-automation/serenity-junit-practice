package saucedemo.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class InventoryPage extends UIInteractionSteps {

    public String getHeading(){
        return $(".title").getText();
    }
}
