package co.com.book.store.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProfileUi extends PageObject {
    public static final Target LBL_HEADER_FRONT = Target.the("Label main header").located(By.xpath("//div[@class='main-header']"));

    public static final Target LBL_USER_NAME = Target.the("Label user name").located(By.id("userName-value"));
    public static final Target BTN_DELETE = Target.the("Button delete").located(By.id("delete-record-undefined"));

}
