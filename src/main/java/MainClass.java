import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        //MainClass m=new MainClass();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/washing_machines/");
        List<WebElement> lis= driver.findElements(By.xpath("//dt[text()='Производители']/parent::dl/parent::div//dd[@class='filter-attr__value']"));
        //lis.get(3).click();
        
        for (WebElement chechbox : lis){
            chechbox.click();
        }






    }


}
