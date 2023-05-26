import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends AbstractTest{

    @Test
    void searchCar() throws InterruptedException {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(getWebDriver());
        MainPage mainPage = new MainPage(getWebDriver());


        mainPage.clickCatalog();

        WebElement electronic = getWebDriver().findElement(By.xpath(".//li[@data-tid='de830508'][4]"));
        actions.moveToElement(electronic)
                .build() //чтобы собрать все методы actions
                .perform(); // и чтобы выполнить*/

        Assertions.assertNotNull(getWebDriver().findElement(By.xpath(".//a[text()='Смартфоны и гаджеты']")).isDisplayed());

        WebElement gaming = getWebDriver().findElement(By.xpath(".//a[text()='Гейминг']"));
        actions.click(gaming)
                .build()
                .perform();
        try {
            Thread.sleep(4000); //заснуть на 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       /* actions.clickAndHold(); //Нажали на элемент и держим кнопку мыши

        actions.doubleClick(); //двойное нажатие кнопкой мыши

        actions.moveToElement()//навести курсор на элемент
                .keyDown() //зажимаем кнопку
                .keyUp() // отжимаем кнопку
                .clickAndHold() //нажать и задержать
                .release() //отпустить(например хажали левую кнопку мыши и чтобы её отпустить используем release)
                .build() //чтобы собрать все методы actions
                .perform(); // и чтобы выполнить*/
    }


}
