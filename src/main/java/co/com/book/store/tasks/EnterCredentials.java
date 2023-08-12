package co.com.book.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import static co.com.book.store.userinterfaces.LoginUi.INPUT_USERNAME;
import static co.com.book.store.userinterfaces.LoginUi.INPUT_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterCredentials implements Task {
    static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    static String userName = variables.getProperty("user_name");
    static String password = variables.getProperty("password");


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(INPUT_USERNAME, isVisible()).forNoMoreThan(5).seconds(),
                Enter.keyValues(userName).into(INPUT_USERNAME),
                Enter.keyValues(password).into(INPUT_PASSWORD)
        );

    }
    public static Performable enterCredentials() {
        return instrumented(EnterCredentials.class);
    }

}
