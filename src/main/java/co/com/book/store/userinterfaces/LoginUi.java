package co.com.book.store.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com/login")
public class LoginUi extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input UserName").located(By.id("userName"));

    public static final Target INPUT_PASSWORD = Target.the("Input Password").located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Button Login").located(By.id("login"));



}
