import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void classwork2(){
        WebElement button = wd.findElement(By.cssSelector("[name='login']"));
        String text = button.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("***********************");
        System.out.println(textForm);


        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("***********************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("***********************");
        System.out.println("text br--->" + br.getText());


    }



    @Test
    public void classwork(){
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[1]"));//one option

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement>list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[3]/preceding-sibling::a[2]"));
        List<WebElement>list3 = wd.findElements(By.xpath("//a[3]/preceding-sibling::*"));
    }


    @Test
    public void cssLocators() {
        //by tagName
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));


        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a_1 = wd.findElement(By.cssSelector("a"));
        WebElement a_2 = wd.findElement(By.xpath("//a"));
        List<WebElement> list_a = wd.findElements(By.cssSelector("a"));
        List<WebElement> list_a1 = wd.findElements(By.xpath("//a"));

        WebElement a_3_css = wd.findElement(By.cssSelector("a:nth-child(3)"));
        WebElement a_3 = wd.findElement(By.xpath("//a[3]"));
        WebElement a_3_1 = wd.findElement(By.xpath("//a[last()]"));


        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form_1 = wd.findElement(By.cssSelector("form"));
        WebElement form_2 = wd.findElement(By.xpath("//form"));


        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input_1 = wd.findElement(By.cssSelector("input"));
        WebElement input_2 = wd.findElement(By.xpath("//input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button_1 = wd.findElement(By.cssSelector("button"));
        WebElement button_2 = wd.findElement(By.xpath("//button"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el22 = wd.findElement(By.xpath("//div[@class='container']"));

        WebElement el2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el3 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el23 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        WebElement el4 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el24 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));


        //by id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));
        WebElement el16 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement el8 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el17 = wd.findElement(By.xpath("//a[@href='/home']"));

        WebElement el9 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el25 = wd.findElement(By.xpath("//*[@href='/about']"));


        WebElement el10 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el11 = wd.findElement(By.name("email"));
        WebElement el26 = wd.findElement(By.xpath("//*[@name='email']"));


        WebElement el12 = wd.findElement(By.cssSelector("[placeholder='Password]"));
        WebElement el18 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        // one of elements find by attribute ==> start & end & contains value
        //start
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        WebElement el19 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));
        //end
        WebElement el14 = wd.findElement(By.cssSelector("[placeholder $='rd']"));
        WebElement el21 = wd.findElement(By.xpath("//input[contains(@placeholder,'rd')]"));
        //contains
        WebElement el15 = wd.findElement(By.cssSelector("[placeholder *='ssw']"));
        WebElement el20 = wd.findElement(By.xpath("//input[contains(@placeholder,'ssw')]"));


    }

}
