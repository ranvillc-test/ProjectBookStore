package co.com.book.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.book.store.userinterfaces.BookStoreUi.LBL_TITLE_BOOK;

public class QuestionsBook implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LBL_TITLE_BOOK).isNotDisplayed()
        );
        return true;
    }
    public static QuestionsBook validateBookNoFound(){
        return new QuestionsBook();
    }
}
