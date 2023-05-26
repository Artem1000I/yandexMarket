import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RAZDELDETSKYI extends AbstractTest{

    @Test
    void myActiontest() throws InterruptedException {
        new WebDriverWait(getWebDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://market.yandex.ru/"));
        String URL = getWebDriver().getCurrentUrl(); //Проверяем урл главной страницы
        Assertions.assertEquals(URL, "https://market.yandex.ru/" );
    }

@Test
    void developmentAndTraining()throws  InterruptedException{
   MainPage mainPage =new MainPage(getWebDriver());
   mainPage.clickCatalog();
    try {
        Thread.sleep(4000); //заснуть на 10 секунд
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    CatalogPage catalogPage= new CatalogPage(getWebDriver());
    catalogPage.clickChildrenGoods();



    KidsMarketPage kidsMarketPage = new KidsMarketPage(getWebDriver());
    kidsMarketPage.clickGiftsСhildren();
    try {
        Thread.sleep(4000); //заснуть на 10 секунд
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    Actions actions = new Actions(getWebDriver())
            .scrollToElement((WebElement) By.xpath(".//div[text()='Конструкторы']"));
    try {
        Thread.sleep(4000); //заснуть на 10 секунд
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    kidsMarketPage.clickConstructor();
    try {
        Thread.sleep(4000); //заснуть на 10 секунд
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    kidsMarketPage.clickLego();
    try {
        Thread.sleep(10000); //заснуть на 10 секунд
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}


}
