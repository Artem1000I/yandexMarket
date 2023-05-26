import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCarPage extends AbstractPage{
    public SearchCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='header-search']")
    private WebElement searchRequest;

    public SearchCarPage enterRequestCar(){
        searchRequest.sendKeys("lamborghini", Keys.ENTER);
        return this;
    }
}
