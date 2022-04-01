package co.com.chocair.reto.task;

import co.com.chocair.reto.userinterface.UTestPageRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InPlatform implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String language;
    private String password;
    private String confirmPassword;

    public InPlatform(String firstName, String lastName, String email, String language, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.language = language;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Performable in(String firstName, String lastName, String email, String language, String password, String confirmPassword) {
        return Tasks.instrumented(InPlatform.class,firstName, lastName, email, language, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPageRegister.BUTTON_JOIN),
                Enter.theValue(firstName).into(UTestPageRegister.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UTestPageRegister.INPUT_LAST_NAME),
                Enter.theValue(email).into(UTestPageRegister.INPUT_EMAIL),
                Click.on(UTestPageRegister.SELECT_MONTH),
                Click.on(UTestPageRegister.SELECT_DAY),
                Click.on(UTestPageRegister.SELECT_YEAR),
                Enter.theValue(language).into(UTestPageRegister.INPUT_LANGUAGE),
                Click.on(UTestPageRegister.BUTTON_SELECT_LANGUAGE),
                Click.on(UTestPageRegister.BUTTON_NEXT_LOCATION),
                Click.on(UTestPageRegister.BUTTON_NEXT_DEVICES),
                Click.on(UTestPageRegister.BUTTON_NEXT_LAST_STEP),
                Enter.theValue(password).into(UTestPageRegister.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(UTestPageRegister.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestPageRegister.CHECK_BUTTON_TERMS),
                Click.on(UTestPageRegister.CHECK_BUTTON_PRIVACY),
                Click.on(UTestPageRegister.BUTTON_COMPLETE));
    }
}
