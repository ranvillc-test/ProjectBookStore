package co.com.book.store.stepdefinitions;

import co.com.book.store.userinterfaces.LoginUi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.book.store.questions.QuestionBookAddedyourCollection.validateMessageAddBook;
import static co.com.book.store.questions.QuestionLogin.validateLogin;
import static co.com.book.store.questions.QuestionsBook.validateBookNoFound;
import static co.com.book.store.questions.QuestionsNameBook.validateNameBook;
import static co.com.book.store.tasks.AddToYourCollection.addToYourCollection;
import static co.com.book.store.tasks.BookToSearch.bookToSearch;
import static co.com.book.store.tasks.EnterCredentials.enterCredentials;
import static co.com.book.store.tasks.Login.login;
import static co.com.book.store.tasks.SelectBookInStore.selectBookInStore;
import static co.com.book.store.tasks.SelectBookStore.selectBookStore;
import static co.com.book.store.tasks.SelectDeleteBookProfile.selectDeleteBookProfile;
import static co.com.book.store.tasks.SelectProfile.selectProfile;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;


public class BookStoreStep {
    Actor user = Actor.named("User");

    static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    static String enviromentUrl = variables.getProperty("enviroment.url");

    @Before
    public void prepararElEscenario() {
        OnStage.setTheStage(new OnlineCast());

    }
    @Managed
    WebDriver driver;


    @Given("user is in the login page")
    public void userIsInTheLoginPage() {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(Open.browserOn().the(LoginUi.class));
    }

    @When("user enters credentials")
    public void userEntersCredentials() {
        user.attemptsTo(enterCredentials());
        user.attemptsTo(login());
    }

    @Then("user enters correctly")
    public void userEntersCorrectly() {
        validateLogin().answeredBy(user);
    }

    /////......................................................


    @Given("user is in Book Store")
    public void userIsInBookStore() throws InterruptedException {
        user.attemptsTo(selectBookStore());
    }
    @When("user search {string}")
    public void userSearch(String book_name) {
        user.attemptsTo(bookToSearch(book_name));
        validateNameBook().answeredBy(user);

    }
    @When("user add book to the collection")
    public void userAddBookToTheCollection() {
        user.attemptsTo(selectBookInStore());
        user.attemptsTo(addToYourCollection());
        validateMessageAddBook().answeredBy(user);
        user.attemptsTo(selectProfile());
        validateNameBook().answeredBy(user);

    }
    @When("user delete book")
    public void userDeleteBook() throws InterruptedException {
        user.attemptsTo(selectDeleteBookProfile());

    }
    @Then("user validate that the book is not found")
    public void userValidateThatTheBookIsNotFound() {
        validateBookNoFound().answeredBy(user);

    }


}
