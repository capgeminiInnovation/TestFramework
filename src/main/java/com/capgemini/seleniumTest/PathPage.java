package com.capgemini.seleniumTest;

public abstract class PathPage {

    public abstract void goTo();

    public abstract String pathName();

    public boolean isAtPathPage(String paw_patrol){
        return pathName().equals(paw_patrol);
    }
}
