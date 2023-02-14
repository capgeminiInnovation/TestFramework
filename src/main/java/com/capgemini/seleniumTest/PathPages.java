package com.capgemini.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PathPages {

    static String url = "https://www.google.com/";
    static String title = "Paw Patrol - Google Search";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }

    public PathPage getPathPage(String page){
        switch (page){
            case "PawPatrol":
                return Pages.pawPatrolPage();
        }
        return null;
    }

    public void Search() {
        WebElement searchPatrol = Browser.driver.findElement(By.name("q"));
        searchPatrol.sendKeys("Paw Patrol");
        searchPatrol.submit();
    }
}
