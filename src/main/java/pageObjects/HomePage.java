package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;

    //locators
    @FindBy(linkText = "Register")
    public WebElement registerLink;


    @FindBy(linkText = "Log in")
    public WebElement logInLink;


    @FindBy(id = "small-searchterms")
    public WebElement searchTextbox;

    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    @FindBy(className = "ico-logout")
    public WebElement logoutLink;
    @FindBy(id="pollanswers-1")
    public WebElement excellentRadioBtn;
    @FindBy(id="pollanswers-2")
    public WebElement goodRadioBtn;
    @FindBy(id="pollanswers-3")
    public WebElement poorRadioBtn;
    @FindBy(id="pollanswers-4")
    public WebElement verybadRadioBtn;
    @FindBy(className = "vote-poll-button")
    public WebElement voteBtn;
    @FindBy(className = "poll-vote-error")
    public WebElement errorMsg;


 public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public void clickRegisterLink()
    {
       registerLink.click();
    }
    public void clickLoginLink()
   {
       logInLink.click();
   }
    public void enterSearchItem(String item)
   {
       searchTextbox.sendKeys(item);
   }
    public void clickSearchButton()
    {
       searchButton.click();
    }
    public void clickLogoutLink()
    {
       logoutLink.click();
    }
    public boolean verifyLogout()
    {
        return logoutLink.isDisplayed();
    }
    public void clickexcellentRadioBtn()
    {
        excellentRadioBtn.click();
    }
    public void clickgoodRadioBtn()
    {
        goodRadioBtn.click();
    }
    public void clickpoorRadioBtn()
    {
        poorRadioBtn.click();
    }
    public void clickverybadRadioBtn()
    {
        verybadRadioBtn.click();
    }
    public void clickvoteBtn()
    {
        voteBtn.click();
    }
    public void geterrorMsg()
    {
        String str = errorMsg.getText();

    }
    public void  printerrorMsg()
    {
        String  s=errorMsg.getText();
        System.out.println("Error Message is:"+s);
    }






}
