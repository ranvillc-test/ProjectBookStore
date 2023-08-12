package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.book.store.userinterfaces.HomeUi.BTN_PROFILE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProfile implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PROFILE)
        );

    }
    public static Performable selectProfile() {
        return instrumented(SelectProfile.class);
    }
}
