package co.com.book.store.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WindowProfile extends PageObject {
    public static final Target BTN_OK = Target.the("Button OK").located(By.id("closeSmallModal-ok"));
    public static final Target LBL_MESSAGE = Target.the("Label Message").located(By.xpath("//div[@class='modal-body']"));

}
