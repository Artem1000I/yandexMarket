import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class KidsMarketPage extends AbstractPage{
    public KidsMarketPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = ".//div[@class='_2jsCq _3DHTH']")
    private WebElement giftsСhildren;

    public KidsMarketPage clickGiftsСhildren() {
        giftsСhildren.click();
        return this;
    }


    @FindBy(xpath = ".//div[text()='Конструкторы']")
    private WebElement constructor;

    public KidsMarketPage clickConstructor() {
        constructor.click();
        return this;
    }

    @FindBy(xpath = ".//div[@data-auto='item'][2]")
    private WebElement lego;

    public KidsMarketPage clickLego() {
        lego.click();
        return this;
    }
}
