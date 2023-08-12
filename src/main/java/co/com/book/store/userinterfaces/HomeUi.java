package co.com.book.store.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUi extends PageObject {
    public static final Target BTN_BOOK_STORE = Target.the("Button Book store").located(By.xpath("//span[text()='Book Store']"));
    public static final Target BTN_PROFILE = Target.the("Button profile").located(By.xpath("//span[text()='Profile']"));

}
