package co.com.book.store.tasks;

import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.book.store.userinterfaces.BookStoreUi.INPUT_TO_SEARCH;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BookToSearch implements Task {

    @Getter
    private static String book_name;
    public BookToSearch(String book_name) {
        super();
        this.book_name = book_name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_TO_SEARCH, isVisible()).forNoMoreThan(3).seconds(),
                SendKeys.of(book_name).into(INPUT_TO_SEARCH)
        );

    }
    public static Performable bookToSearch(String book_name) {
        return instrumented(BookToSearch.class, book_name);
    }

}
