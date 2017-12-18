import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
public class dku {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriverManager.getInstance().setup();
        WebDriver Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(Webdriver, 300,500);
        Webdriver.get("https://cabinet.nsd.ru/dcs-web2/pages/wr/login/login.xhtml");
        Webdriver.findElement(By.xpath("//*[@id=\"login_form:in_user_name\"]")).sendKeys("friend");
        Webdriver.findElement(By.xpath("//*[@id=\"login_form:password\"]")).sendKeys("Reg1str@tor!");
        Webdriver.findElement(By.xpath("//*[@id=\"login_form:do_login\"]")).click();
        Thread.sleep(2000);
        Webdriver.quit();
    }
}