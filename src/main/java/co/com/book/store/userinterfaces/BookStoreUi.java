package co.com.book.store.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookStoreUi extends PageObject {
    public static final Target INPUT_TO_SEARCH = Target.the("Input type to search").located(By.xpath("//input[@id='searchBox']"));

    public static final Target LBL_TITLE_BOOK = Target.the("Label title book").located(By.xpath("//*[@id='see-book-Git Pocket Guide']/a"));

    public static final Target BTN_BOOK_SEARCH = Target.the("Button book search").located(By.id("see-book-Git Pocket Guide"));

    public static final Target LBL_ISBN = Target.the("Label ISBN").located(By.id("ISBN-label"));

    public static final Target BTN_ADD_TO_YOUR_COLLECTION = Target.the("Button Add To Your Collection").located(By.xpath("//div[@class='text-right fullButton']"));

}
