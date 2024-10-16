package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import HomePage.Homepage;
import utilis.TestContextSetup;

public class Logocheck {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Homepage homepage;

    public Logocheck(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }


    @Given("Check login button is available in blow")
    public void checkLoginButtonIsAvailable() {
       homepage.getLogin().isDisplayed();
    }


    @When("Click On Login button")
    public void clickOntLoginButton() {
        homepage.getLogin().click();

    }

    @And("Click on continu with Email button")
    public void clickOnContinueWithEmailButton() {
       homepage.getEmail().click();
    }

    @Then("Enter Email in Email text field")
    public void enterEmailInEmailTextField() {
        homepage.getemailfild().sendKeys("raz15-4132@diu.edu.bd");
    }

    @When("Click on next button")
    public void clickOnNextButton() {
        homepage.getLogNext().click();

    }

    @Then("Input The Password in Password field")
    public void inputPasswordInPasswordField() {
        homepage.getpassfile().sendKeys("Razib4144#");
    }

    @When("Click on Log in button")
    public void clickOnLoginButton(){
        homepage.getLog_in().click();

    }
    @Then("Show the Home Page is available in Display")
    public void showTheHomePageIsAvailableInDisplay() throws InterruptedException {
        homepage.getHomeIcon().isDisplayed();
        Thread.sleep(2000);
    }




  

   

    @Given("Check Activity is available in site")
    public void checkActivityIsAvailableInSite() throws InterruptedException {
        homepage.getActivity().isDisplayed();
        Thread.sleep(2000);

    }

    @When("Click on Activity button")
    public void clickOnActivityButton() {
        homepage.getActivity().click();
    }

    @Then("Show the Activity Page is available in Display")
    public void showTheActivityPageIsAvailableInDisplay() throws InterruptedException {

        homepage.getActivity().isDisplayed();
        Thread.sleep(2000);

    }


    @Given("show the explore is display")
    public void showTheExploreIsDisplay() {
        homepage.getExpolore().isDisplayed();

    }
    @When("Click On the explore Button")
    public void clickOnTheTextButton() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getExpolore().click();

    }

    @Then("show the Expolore available is display")
    public void showTheExpoloreAvailableIsDisplay() {
        homepage.getExpolore().isDisplayed();

    }

    @Given("Show Inbox button  is available in site")
    public void showInboxButtonIsAvailableInSite() {
        homepage.getInbox().isDisplayed();
    }

    @When("Click the Inbox button")
    public void clickTheInboxButton() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getInbox().click();
    }

    @Then("Show the inbox  is available in Display")
    public void showTheInboxIsAvailableInDisplay() throws InterruptedException {
        homepage.getInboxmenu().isDisplayed();
        Thread.sleep(2000);
    }

    @Given("Show mesage button  is available in site")
    public void showMssageButtonIsAvailableInSite() throws InterruptedException {
        homepage.getMessage().isDisplayed();
        Thread.sleep(2000);
}

    @When("Click on the message button")
    public void clickOnTheMessageButton() {
        homepage.getMessage().click();
    }

    @Then("Show the message box  is available in Display")
    public void showTheMessageBoxIsAvailableInDisplay() throws InterruptedException {
        homepage.getMessageBox().isDisplayed();
        Thread.sleep(2000);
    }

    @Given("Show account button  is available in site")
    public void showAccounButtonIsAvailableInSite() {
        homepage.getAccount().isDisplayed();

    }

    @When("Click on the account button")
    public void clickOnTheAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getAccount().click();
    }

    @Then("Show the account sub menu is available in Display")
    public void showTheAccountSubMenuIsAvailableInDisplay() throws InterruptedException {
        homepage.getLike().isDisplayed();
        Thread.sleep(2000);
    }

    @When("Click on the like button")
    public void clickOnTheLikeButton() {
        homepage.getLike().click();
    }

    @Then("show the all post and like")
    public void showTheAllPostAndLike() throws InterruptedException {
        homepage.getLikepage().isDisplayed();
        Thread.sleep(2000);

    }

    @When("Click on the following button")
    public void clickOnTheFollowingButton() throws InterruptedException {

        Thread.sleep(2000);
        homepage.getFollow().click();
    }

    @Then("show the all following page is available in Display")
    public void showTheAllFollowingPageIsAvailableInDisplay() throws InterruptedException {
        homepage.getFollowPage().isDisplayed();
        Thread.sleep(2000);
    }

    @Given("Show setting button  is available in site")
    public void showSettingButtonIsAvailableInSite() throws InterruptedException {
        homepage.getSetting().isDisplayed();
        Thread.sleep(2000);
    }

    @When("Click on the setting button")
    public void clickOnTheSettingButton() {
        homepage.getSetting().click();
    }

    @Then("Show the setting is available in Display")
    public void showTheSettingIsAvailableInDisplay() throws InterruptedException {

        homepage.getSettingPage().isDisplayed();
        Thread.sleep(2000);
    }


    @Given("Show TumblrMart button  is available in site")
    public void showTumblrMartButtonIsAvailableInSite() {
        homepage.getTumblrMart().isDisplayed();

    }

    @When("Click on the TumblrMart button")
    public void clickOnTheTumblrMartButton() throws InterruptedException {
        homepage.getTumblrMart().click();
        Thread.sleep(1500);
    }

    @Then("Show the TumblrMartis available in Display")
    public void showTheTumblrMartisAvailableInDisplay() {
        homepage.getTumblrPage().isDisplayed();
    }

    @Given("Show Go a domain button  is available in site")
    public void showGoADomainButtonIsAvailableInSite() {
        homepage.getGoAadmin().isDisplayed();
    }

    @When("Click on the Go a domain button")
    public void clickOnTheGoADomainButton() throws InterruptedException {
        homepage.getGoAadmin().click();
        Thread.sleep(2000);
    }

    @Then("Show the Go a domain is available in Display")
    public void showTheGoADomainIsAvailableInDisplay() {
        homepage.getGoAadminPage().isDisplayed();
    }

    @Given("Show the create button  is available in site")
    public void showTheCreateButtonIsAvailableInSite() {
        homepage.getCreate().isDisplayed();

    }

    @When("Click on the create button")
    public void clickOnTheCreateButton() throws InterruptedException {
        homepage.getCreate().click();
        Thread.sleep(2000);
    }

    @Then("Show the post type is available in Display")
    public void showThePostTypeIsAvailableInDisplay() {
        homepage.getCreatePage().isDisplayed();
    }

    @Given("Show the GoAdd_free button  is available in site")
    public void showTheGoAdd_freeButtonIsAvailableInSite() {
        homepage.getAddFree().isDisplayed();
    }

    @When("Click on the GoAdd_free button")
    public void clickOnTheGoAdd_freeButton() {
        homepage.getAddFree().click();
    }

    @Then("Show the Ad-Free Browsing is available in Display")
    public void showTheAdFreeBrowsingIsAvailableInDisplay() {
        homepage.getAddFreePage().isDisplayed();
    }
}




