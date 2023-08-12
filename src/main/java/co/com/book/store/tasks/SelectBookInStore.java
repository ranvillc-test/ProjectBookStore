package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.book.store.userinterfaces.BookStoreUi.BTN_BOOK_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBookInStore implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BOOK_SEARCH)
        );

    }
    public static Performable selectBookInStore() {
        return instrumented(SelectBookInStore.class);
    }
}
