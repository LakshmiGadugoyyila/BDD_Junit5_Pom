import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pageObjects.HomePage;

public class StepDefinitions
{
    String homePageActualTitle;
    String homePageExpectedTitle="nopCommerce demo store";
    String registerPageActualTitle;
    String registerPageExpectedTitle ="nopCommerce demo store. Register";
    String conExpectedMsg ="Your registration completed";
    String conActualMsg;
    String  loginPageExpectedTitle="nopCommerce demo store. Login";
    String  loginPageActualTitle;
    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.navigateToUrl(url);
    }

    @Then("i should be navigate to homepage")
    public void i_should_be_navigate_to_homepage()
    {
        homePageActualTitle=BasePage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
    }

    @When("i click on login link from the nav bar")
    public void i_click_on_login_link_from_the_nav_bar()
    {
      BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigate to login page")
    public void i_should_be_navigate_to_login_page()
    {
        loginPageActualTitle=BasePage.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
       BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String password)
    {
      BasePage.loginPage.enterPassword(password);
    }

    @When("i click on login button")
    public void i_click_on_login_button()
    {
        BasePage.loginPage.clickLogin();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
      BasePage.homePage.verifyLogout();
    }
    @When("i click on register link from the nav bar")
    public void i_click_on_register_link_from_the_nav_bar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigate to register page")
    public void i_should_be_navigate_to_register_page()
    {
        registerPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle );
    }

    @When("User click any radio button under Community Poll")
    public void user_click_any_radio_button_under_community_poll()
    {
       BasePage.homePage.excellentRadioBtn.click();

    }

    @When("User clicks on Vote button")
    public void user_clicks_on_vote_button()
    {
        BasePage.homePage.voteBtn.click();

    }

    @Then("user should see the error message")
    public void user_should_see_the_error_message()
    {
        BasePage.homePage.geterrorMsg();
    }

    @Then("Print the error message to console")
    public void print_the_error_message_to_console()
    {
        BasePage.homePage.printerrorMsg();
    }

}
