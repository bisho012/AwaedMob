package org.awaed;

import Utils.ExcelFileManager;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void Login() throws IOException {

        loginPage.setTxtUserName(ExcelFileManager.setDataFromExcelFile(0,1));
        loginPage.setTxtPassword(ExcelFileManager.setDataFromExcelFile(1,1));
        loginPage.pressLogin();
    }
}
