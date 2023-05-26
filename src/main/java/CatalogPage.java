import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage {


    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//span[text()='Детские товары']")
    private WebElement childrenGoods;

    public CatalogPage clickChildrenGoods() {
        childrenGoods.click();
        return this;
    }


}
