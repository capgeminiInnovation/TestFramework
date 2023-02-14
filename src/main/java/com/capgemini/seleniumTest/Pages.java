package com.capgemini.seleniumTest;

import org.openqa.selenium.support.PageFactory;

public class Pages {
    public static HomePage homepage() {
        return new HomePage();
    }

    public static PathPages pathPages() {
        PathPages pathPages = new PathPages();
        return pathPages;
    }

    public static PathPage pawPatrolPage() {
        PathPage pawPatrolPage = new PawPatrolPage();
        PageFactory.initElements(Browser.driver, pawPatrolPage);
        return pawPatrolPage;
    }
}
