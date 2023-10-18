package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    By LoginP = By.xpath("//span[normalize-space()='Log in']");
    By Email = By.xpath("//button[@aria-label='Continue with email']");
    By LoginNext = By.xpath("//body/div[@id='root']/div[@id='base-container']/div[@id='glass-container']/div[@role='dialog']/div[@class='yKniX']/div[@class='hBHAJ tzb9e Rog1D']/div[@class='WAHT_']/div[@class='vVe9A']/div[@class='m4lSb email']/form[@method='post']/div[@class='ehOK3']/div[@class='Kz53t']/button[@aria-label='Next']/span[1]");
    By emailfile = By.xpath("//input[@placeholder='Email']");
    By passfild = By.xpath("//input[@placeholder='Password']");
    By Log_in = By.xpath("//button[@type='submit']//span[@class='EvhBA'][normalize-space()='Log in']");

    By Expolor = By.xpath("//span[normalize-space()='Explore']");

    By Activity = By.xpath("//span[normalize-space()='Activity']");
    By HomeIcon = By.xpath("//span[normalize-space()='Home']");

    By Message = By.xpath("//span[normalize-space()='Messages']");
    By MessageBox = By.xpath("//div[@class='DxQ0f AzqQv P4LH6']");

    By Inbox = By.xpath("//span[normalize-space()='Inbox']");
    By Inboxmnu = By.xpath("//div[@class='cQqe6']");
    By Account = By.xpath("//button[@id='account_button']//div[@class='a132D']");
    By Like = By.xpath  ("//span[normalize-space()='Likes']");
    By LikePage = By.xpath("//div[@class='lSyOz t8f_N']");
    By Following = By.xpath("//span[normalize-space()='Following']");
    By FollowingPage = By.xpath("//input[@placeholder='Enter a username or URL to follow']");

    By setting = By.xpath("//span[normalize-space()='Settings']");
    By settingPage = By.xpath("//h2[@class='mvtqT']");
    By tumblrMart = By.xpath("//span[contains(text(),'TumblrMart')]");
    By tumblrMartpage = By.xpath("//div[@class='HVZtK']");
    By GoADomain = By.xpath("//span[normalize-space()='Get a domain']");
    By GoADomainPage = By.xpath("//header[@class='tU8nj']");
    By GoAdd_free = By.xpath("//span[normalize-space()='Go Ad-Free']");
    By GoAdd_freePage = By.xpath("//div[@class='r9j7Q']");

    By Create = By.xpath("//a[@aria-label='Create a post']//*[name()='svg']");
    By CreatePage = By.xpath("//div[@class='lWf47 eK_JR gjWXz']//*[name()='svg']");










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
    public WebElement getpassfile() {return driver.findElement(passfild);}
    public WebElement getExpolore(){ return driver.findElement(Expolor);}
    public WebElement getActivity(){ return driver.findElement(Activity);}
    public WebElement getHomeIcon(){ return driver.findElement(HomeIcon);}




    public WebElement getInbox(){ return driver.findElement(Inbox);}
    public WebElement getInboxmenu(){ return driver.findElement(Inboxmnu);}
    public WebElement getMessage(){ return driver.findElement(Message);}
    public WebElement getMessageBox(){ return driver.findElement(MessageBox);}

    public WebElement getAccount(){ return driver.findElement(Account);}
    public WebElement getLike(){ return driver.findElement(Like);}
    public WebElement getFollow(){ return driver.findElement(Following);}
    public WebElement getLikepage(){ return driver.findElement(LikePage);}
    public WebElement getFollowPage(){ return driver.findElement(FollowingPage);}

    public WebElement getSetting(){ return driver.findElement(setting);}
    public WebElement getSettingPage(){ return driver.findElement(settingPage);}

    public WebElement getTumblrMart(){ return driver.findElement(tumblrMart);}
    public WebElement getTumblrPage(){ return driver.findElement(tumblrMartpage);}
    public WebElement getGoAadmin(){ return driver.findElement(GoADomain);}
    public WebElement getGoAadminPage(){ return driver.findElement(GoADomainPage);}

    public WebElement getCreate(){ return driver.findElement(Create);}
    public WebElement getCreatePage(){ return driver.findElement(CreatePage);}
    public WebElement getAddFree(){ return driver.findElement(GoAdd_free);}
    public WebElement getAddFreePage(){ return driver.findElement(GoAdd_freePage);}
}