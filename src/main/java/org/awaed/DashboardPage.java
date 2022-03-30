package org.awaed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends PageBase {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public By lblDashboard = By.xpath("//div[@class='v-app-bar-title__content']");

    public boolean isDashboardDisplayed(){
        waitElement(lblDashboard);
        return action(lblDashboard).isDisplayed();
    }

}
