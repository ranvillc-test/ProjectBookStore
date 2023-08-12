package co.com.book.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import co.com.book.store.tasks.BookToSearch;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.book.store.userinterfaces.BookStoreUi.LBL_TITLE_BOOK;

public class QuestionsNameBook implements Question<Boolean> {
    BookToSearch book_name;
    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(LBL_TITLE_BOOK).text().isEqualTo(book_name.getBook_name())
        );

        return true;
    }
    public static QuestionsNameBook validateNameBook(){
        return new QuestionsNameBook();
    }
}
