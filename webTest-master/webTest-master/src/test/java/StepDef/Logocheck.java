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
    public void clickOnContinueWithGoogleButton() {
        homepage.getGoogle().click();
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
        public void clickOnLoginButton() {
           homepage.getLog_in().click();
        }

    @Then("show the home page is display")
        public void checkHomePageIsDisplayed() {
            // Add your code to check if the home page is displayed
        }
    }



