package co.com.book.store.questions;

import com.gargoylesoftware.htmlunit.html.Html;
import io.appium.java_client.functions.ExpectedCondition;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilExpectation;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.model.TestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.com.book.store.userinterfaces.BookStoreUi.BTN_ADD_TO_YOUR_COLLECTION;
import static org.assertj.core.api.Assertions.assertThat;


public class QuestionBookAddedyourCollection implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        Ensure.that(driver.switchTo().alert().getText()).isEqualTo("Book already present in the your collection!");
        driver.switchTo().alert().accept();
        return true;
    }


    public static QuestionBookAddedyourCollection validateMessageAddBook(){
        return new QuestionBookAddedyourCollection();
    }
}
