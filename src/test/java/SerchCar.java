import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class SerchCar extends AbstractTest {

    @Test
    void searchCar() throws InterruptedException {


        try {
        SearchCarPage carPage = new SearchCarPage(getWebDriver());
        carPage.enterRequestCar();

        } catch (Exception e) {
            System.out.println("Не верно указан путь до элемента");
        }

    }
}
