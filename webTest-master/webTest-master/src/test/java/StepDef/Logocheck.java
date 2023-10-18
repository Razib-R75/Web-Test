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
    public void CloseDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("Check sing me up button is available in site section")
    public void checkSignMeUpButtonIsAvailableInSiteSection() {
        WebElement signUpButton = homepage.getSingMeUp();
        Assert.assertTrue("Sign me up button is not available.", signUpButton.isDisplayed());

    }

    @When("Click on sign me up button")
    public void clickOnSignMeUpButton() {
        homepage.getSingMeUp().click();

    }

    @And("Click on continue with Google button")
    public void clickOnContinueWithGoogleButton() throws InterruptedException {
        homepage.getGoogle().click();
        Thread.sleep(3000);
        CloseDriver();
    }


    @And("Click on continue with Apple button")
    public void clickOnContinueWithAppleButton() {
        homepage.getApple().click();

    }


    @Given("Check login button is available in blow")
    public void checkLoginButtonIsAvailable() {
        WebElement loginButton = homepage.getLogin();
        Assert.assertTrue("Login button is not available.", loginButton.isDisplayed());
    }


    @When("Click On Login button")
    public void clickOntLoginButton() {
        homepage.getLogin().click();

    }

    @And("Click on continu with Email button")
    public void clickOnContinueWithEmailButton() {
        WebElement continueWithEmailButton = homepage.getEmail();
        continueWithEmailButton.click();
    }

    @Then("Enter Email in Email text field")
    public void enterEmailInEmailTextField() {
        WebElement emailTextField = homepage.getemailfild();
        emailTextField.sendKeys("raz15-4132@diu.edu.bd");
    }

    @When("Click on next button")
    public void clickOnNextButton() {
        homepage.getLogNext().click();

    }

    @Then("Input The Password in Password field")
    public void inputPasswordInPasswordField() {
        WebElement passwordField = homepage.getpassfile();
        passwordField.sendKeys("Razib4144#");
    }

    @When("Click on Log in button")
    public void clickOnLoginButton() throws InterruptedException {
        homepage.getLog_in().click();

    }

   

    @Given("Check Text Button is available in Display")
    public void checkTextButtonIsAvailableInDisplay() throws InterruptedException {

        homepage.getTextB().isDisplayed();

    }

    @When("Click On the Text Button")
    public void clickOnTheTextButton() throws InterruptedException {
        Thread.sleep(6000);
        homepage.getTextB().click();
    }

    @Then("show the Expolore available is display")
    public void showTheTitleAvailableIsDisplay() throws InterruptedException {

        Thread.sleep(6000);

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

    

    

    @Given("Check the masage button in site")
    public void checkTheMasageButtonInSite() throws InterruptedException {

        homepage.getMasage().isDisplayed();
    }

    @When("Click on Massage button")
    public void clickOnMassageButton() throws InterruptedException {
        homepage.getMasage().click();
        Thread.sleep(2000);
    }

    @Then("Show the inbox are avaolable")
    public void showTheInboxAreAvaolable() {
        homepage.getMasage().isDisplayed();
    }

    @When("Click on again Massage page is  not available in Display")
    public void clickOnAgainMassagePageIsNotAvailableInDisplay() throws InterruptedException {
        homepage.getMasage().click();
        Thread.sleep(2000);
    }

    @Given("show the explore is display")
    public void showTheExploreIsDisplay() {
    }
}




