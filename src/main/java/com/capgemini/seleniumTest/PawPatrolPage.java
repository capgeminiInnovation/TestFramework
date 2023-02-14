package com.capgemini.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PawPatrolPage extends PathPage{

    @FindBy(how = How.CSS, using = "section[id=\"home_together\"]")
    WebElement pageElement;

    @Override
    public void goTo() {
        Browser.driver.findElement(By.cssSelector("a[href=\"https://pawpatrolandfriends.com/\"]")).click();
    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }
}
