package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.book.store.userinterfaces.BookStoreUi.LBL_ISBN;
import static co.com.book.store.userinterfaces.BookStoreUi.BTN_ADD_TO_YOUR_COLLECTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToYourCollection implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_ISBN, isVisible()).forNoMoreThan(3).seconds(),
                Scroll.to(BTN_ADD_TO_YOUR_COLLECTION).andAlignToTop()
        );
        BTN_ADD_TO_YOUR_COLLECTION.resolveFor(actor).click();

    }
    public static Performable addToYourCollection() {
        return instrumented(AddToYourCollection.class);
    }
}
