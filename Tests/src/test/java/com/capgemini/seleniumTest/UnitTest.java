package com.capgemini.seleniumTest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    //this will test if the page has the correct title
    @Test
    public void canGoToHomePage(){
        Pages.homepage().goTo();
        Assert.assertTrue(Pages.homepage().isAt());
    }

    @Test
    public void canSearch() {
        Pages.pathPages().goTo();
        Pages.pathPages().Search();
        PathPage pathPage = Pages.pathPages().getPathPage("PawPatrol");
        pathPage.goTo();
        Assert.assertTrue(
                pathPage.isAtPathPage("BETTER TOGETHER\n" +
                "BETTER TOGETHER\n" +
                "The power of friendship comes to life with PAW Patrol and Abby Hatcher. " +
                        "Each friend has a special skill to share, showing kids that working together and combining " +
                        "strengths makes solving problems a little easier—and a lot more fun."));
    }

    @AfterClass
    public static void cleanUp() {
        Browser.close();
    }
}
