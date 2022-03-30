package org.awaed;

import Utils.ExcelFileManager;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void Login() throws IOException, InterruptedException {
        String dashboard = "لوحة التحكم";
        loginPage.setTxtUserName(ExcelFileManager.setDataFromExcelFile(0,1));
        loginPage.setTxtPassword(ExcelFileManager.setDataFromExcelFile(1,1));
        loginPage.pressLogin();
        if (dashboardPage.getLabelDashboard() == true)
        {
            System.out.println("Success");
            System.out.println("Success");
        }
        else
            System.out.println("Failed");
    }
}
