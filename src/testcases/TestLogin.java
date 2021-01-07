package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import pages.Login;

public class TestLogin {

    @Test
    public void verifyLogin(){
        String driverPath = "C:\\Users\\PNV\\Downloads\\chromedriver_win32\\chromedriver.exe";
        String driver1Path = "C:\\Users\\PNV\\Downloads\\edgedriver_win32\\msedgedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        System.setProperty("webdriver.edge.driver",driver1Path);
        String baseUrl = "https://vungoi.vn/dang-nhap";
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new EdgeDriver();
        driver.get(baseUrl);
        driver1.get(baseUrl);

        Login loginC = new Login(driver);
        loginC.setUserName("particular1");
        loginC.setPassword(")!@#$%^789taucaoKMS");
        loginC.clickLogin();

        Login loginE = new Login(driver1);
        loginE.setUserName("particular1");
        loginE.setPassword(")!@#$%^789taucaoKMS");
        loginE.clickLogin();
    }
}
