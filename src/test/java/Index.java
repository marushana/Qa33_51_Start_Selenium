import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/marus/Downloads/21.index%201.html");

    }

    @Test
    public void cssLocators(){
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        //by class
        WebElement divcontaimer = wd.findElement(By.className("container"));
        WebElement divcontaimer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href = '#item3']"));
        //start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));

        //end
        WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder$='name']"));

        //contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder*='your']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name = 'surename']"));
        WebElement inputS1 = wd.findElement(By.name("surename"));

        //bt linkText

        WebElement a4 = wd.findElement(By.linkText("Item 1"));
        WebElement a5 = wd.findElement(By.partialLinkText("m 1"));


    }
}
