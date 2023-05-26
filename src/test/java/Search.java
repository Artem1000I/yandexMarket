import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Document;
import java.time.Duration;

public class Search extends AbstractTest {
    @Test
    void searchPhone() throws InterruptedException {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.enterRequest();
        mainPage.clickFind();
        try {
            Thread.sleep(4000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //выставляем цену
        FiltersPhone filtersPhone = new FiltersPhone(getWebDriver());
        filtersPhone.writeMinPrice();
        filtersPhone.writeMaxPrice();
        try {
            Thread.sleep(4000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filtersPhone.clickDeliveryTime();
        filtersPhone.clickPhoneMemory();
        try {
            Thread.sleep(4000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filtersPhone.clickPhone();
        filtersPhone.addToBasket();
        filtersPhone.goToBasket();
        try {
            Thread.sleep(4000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filtersPhone.goToDesign();


        filtersPhone.clickNotNow();
        try {
            Thread.sleep(400000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        filtersPhone.clickDeliveryPoint();
        filtersPhone.clickСourier();
        try {
            Thread.sleep(4000000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
