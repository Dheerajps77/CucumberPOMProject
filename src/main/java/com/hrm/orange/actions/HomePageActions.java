package com.hrm.orange.actions;

import org.openqa.selenium.support.PageFactory;

import com.hrm.orange.locators.HomePageLocators;
import com.hrm.orange.utils.HelperClass;

public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
    
    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }
   
    
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }

}
