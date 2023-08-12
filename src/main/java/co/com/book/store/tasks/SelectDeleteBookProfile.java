package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.com.book.store.userinterfaces.ProfileUi.BTN_DELETE;
import static co.com.book.store.userinterfaces.WindowProfile.LBL_MESSAGE;
import static co.com.book.store.userinterfaces.WindowProfile.BTN_OK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDeleteBookProfile implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DELETE),
                Ensure.that(LBL_MESSAGE).text().isEqualTo("Do you want to delete this book?"),
                Click.on(BTN_OK)
        );
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }
    public static Performable selectDeleteBookProfile() {
        return instrumented(SelectDeleteBookProfile.class);
    }

}
