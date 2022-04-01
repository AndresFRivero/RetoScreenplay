package co.com.choucair.reto.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestPageRegister extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Button show us the register form")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(), 'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("Field to write first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Field to write last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Field to write email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select to choose Month").located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']//option[@value='number:7']"));
    public static final Target SELECT_DAY = Target.the("Select to choose Day").located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']//option[@value='number:29']"));
    public static final Target SELECT_YEAR = Target.the("Select to choose Year").located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']//option[@value='number:1999']"));
    public static final Target INPUT_LANGUAGE = Target.the("Field to write language spoke")
            .located(By.xpath("//div[@class='ui-select-container ui-select-multiple ui-select-bootstrap dropdown form-control ng-valid ng-not-empty']//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target BUTTON_SELECT_LANGUAGE = Target.the("Button to choose the language").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 select2-theme-form']//span[@class='ui-select-highlight']"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button to pass next item").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Button to pass next item").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));
    public static final  Target BUTTON_NEXT_LAST_STEP = Target.the("Button to pass at last item").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("Field to create a password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Field to confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_BUTTON_TERMS = Target.the("Check button of terms and conditions").located(By.id("termOfUse"));
    public static final Target CHECK_BUTTON_PRIVACY = Target.the("Check button of Privacy & Security Policy").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("Button to complete the register form").located(By.id("laddaBtn"));
    public static final Target WELCOME = Target.the("Message of welcome").located(By.xpath("//div[@id='mainUiView']//h1[contains(text(), 'Welcome to the world's largest community of freelance software testers!')]"));
}
