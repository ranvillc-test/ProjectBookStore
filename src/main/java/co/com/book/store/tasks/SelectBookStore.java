package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.book.store.userinterfaces.HomeUi.BTN_BOOK_STORE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBookStore implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(BTN_BOOK_STORE).andAlignToTop(),
                Click.on(BTN_BOOK_STORE)
        );

    }
    public static Performable selectBookStore() {
        return instrumented(SelectBookStore.class);
    }
}
