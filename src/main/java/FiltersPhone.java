import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPhone extends AbstractPage{

    public FiltersPhone(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[5]/div/div/div/div/aside/div/div[3]/div/div/div/div/div[1]/div/fieldset/div/div/div/div[1]/span/div/div/input")
    private WebElement minPrice;

    public FiltersPhone writeMinPrice(){
        minPrice.click();
        minPrice.sendKeys("60567");
        return this;
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[5]/div/div/div/div/aside/div/div[3]/div/div/div/div/div[1]/div/fieldset/div/div/div/div[2]/span/div/div/input")
    private WebElement maxPrice;

    public FiltersPhone writeMaxPrice(){
        maxPrice.sendKeys("109876");
        return this;
    }



    @FindBy(xpath = ".//span[text()='Сегодня']")
    private WebElement delivery;

    public FiltersPhone clickDeliveryTime(){
        delivery.click();
        return this;
    }


    @FindBy(xpath = ".//span[text()='256 ГБ']")
    private WebElement phoneMemory;

    public FiltersPhone clickPhoneMemory(){
        phoneMemory.click();
        return this;
    }

    //Выдача списка телефонов посмотреть выдача списка для всех запросов одинаковая или нет
    //если везде то можно добавить путь в MainPage

    @FindBy(xpath = ".//div[@data-item-index='1']")
    private WebElement phone;

    public FiltersPhone clickPhone(){
        phone.click();
        return this;
    }


    @FindBy(xpath = ".//span[@class='_1CSaT _2mcnk']")
    private WebElement basket;

    public FiltersPhone addToBasket(){
        basket.click();
        return this;
    }
    //Перейти в корзину
    @FindBy(xpath = ".//a[@rel='noopener nofollow']")
    private WebElement goBasket;

    public FiltersPhone goToBasket(){
        goBasket.click();
        return this;
    }


    //Перейти к оформлению
    @FindBy(xpath = ".//span[text()='Перейти к оформлению']")
    private WebElement design;

    public FiltersPhone goToDesign(){
        design.click();
        return this;
    }


    //Войти чтобы получить скидку нажимаем не сейчас

    @FindBy(xpath = ".//button[@data-autotest-id='notNow']")
    private WebElement notNow;

    public FiltersPhone clickNotNow(){
        notNow.click();
        return this;
    }

    //Курьер
    @FindBy(xpath = ".//div[text()='Курьер']")
    private WebElement deliveryPoint;

    public FiltersPhone clickDeliveryPoint(){
        deliveryPoint.click();
        return this;
    }
    //Курьер
    @FindBy(xpath = ".//div[text()='Курьер']")
    private WebElement courier;

    public FiltersPhone clickСourier(){
        courier.click();
        return this;
    }


}

