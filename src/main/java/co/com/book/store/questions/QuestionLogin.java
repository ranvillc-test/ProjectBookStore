package co.com.book.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.book.store.userinterfaces.ProfileUi.LBL_USER_NAME;

public class QuestionLogin implements Question<Boolean> {
    static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    static String userName = variables.getProperty("user_name");

    @Override
    public Boolean answeredBy(Actor actor) {


        actor.attemptsTo(
                Ensure.that(LBL_USER_NAME).text().isEqualTo(userName)
        );

        return true;
    }
    public static QuestionLogin validateLogin(){
        return new QuestionLogin();
    }
}
