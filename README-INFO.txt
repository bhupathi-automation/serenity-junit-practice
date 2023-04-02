Extend below classes to use serenity methods:
1. UIInteractionSteps  [import net.serenitybdd.core.steps.UIInteractionSteps]
2. PageObject  [import net.serenitybdd.core.pages.PageObject]


Locator Strategies:
===================
driver.findElement(By.id("username"));  ==> find(By.id("username"));

ID::    find(By.id("username"))     ==> $("#username")
Name::  find(By.id("username"))     ==> $("[name='username']")
