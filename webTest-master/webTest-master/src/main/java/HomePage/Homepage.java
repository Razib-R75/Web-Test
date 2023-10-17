package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    By singMeUp = By.xpath("//span[contains(text(),'Sign me up \uD83D\uDE4C')]");
    By google = By.xpath("//a[normalize-space()='Continue with Google']");
    By Apple = By.xpath("//a[normalize-space()='Continue with Apple']");

    By LoginP = By.xpath("//span[normalize-space()='Log in']");
    By Email = By.xpath("//button[@aria-label='Continue with email']");
    By LoginNext = By.xpath("//body/div[@id='root']/div[@id='base-container']/div[@id='glass-container']/div[@role='dialog']/div[@class='yKniX']/div[@class='hBHAJ tzb9e Rog1D']/div[@class='WAHT_']/div[@class='vVe9A']/div[@class='m4lSb email']/form[@method='post']/div[@class='ehOK3']/div[@class='Kz53t']/button[@aria-label='Next']/span[1]");
    By emailfile = By.xpath("//input[@placeholder='Email']");

    By passfild = By.xpath("//input[@placeholder='Password']");

    By Log_in = By.xpath("//button[@type='submit']//span[@class='EvhBA'][normalize-space()='Log in']");
    public WebElement getSingMeUp() {
        return driver.findElement(singMeUp);
    }

    public WebElement getGoogle() {
        return driver.findElement(google);
    }
    public WebElement getApple() {
        return driver.findElement(Apple);
    }

    public WebElement getLogin() {
        return driver.findElement(LoginP);
    }
    public WebElement getEmail() {
        return driver.findElement(Email);
    }

    public WebElement getemailfild(){
        return  driver.findElement(emailfile);
    }

    public WebElement getLogNext() {
        return driver.findElement(LoginNext);
    }
    public WebElement getLog_in() {
        return driver.findElement(Log_in);
    }
    public WebElement getpassfile() {
        return driver.findElement(passfild);
    }
}
