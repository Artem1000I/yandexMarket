import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{
    public MainPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = ".//button[@id='catalogPopupButton']")
    private WebElement buttonCatalog;

    public MainPage clickCatalog(){
        buttonCatalog.click();
        return this;
    }



    @FindBy(xpath = ".//input[@id='header-search']")
    private WebElement searchRequest;

    public MainPage enterRequest(){
        searchRequest.sendKeys("iphone 13 Pro max");
        return this;
    }

    @FindBy(xpath = ".//span[text()='Найти']")
    private WebElement buttonFind;

    public MainPage clickFind(){
        buttonFind.click();
        return this;
    }


    @FindBy(css = "._3WgR5")
    private WebElement cssF;

    public MainPage clickCss(){
        cssF.click();
        return this;
    }


}
