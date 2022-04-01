package co.com.choucair.reto.test.task;

import co.com.choucair.reto.test.userinterface.UTestPageRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InPlatform implements Task {
    public static Performable in() {
        return Tasks.instrumented(InPlatform.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPageRegister.BUTTON_JOIN),
                Enter.theValue("Andres").into(UTestPageRegister.INPUT_FIRST_NAME),
                Enter.theValue("Rivero").into(UTestPageRegister.INPUT_LAST_NAME),
                Enter.theValue("ara@mail.com").into(UTestPageRegister.INPUT_EMAIL),
                Click.on(UTestPageRegister.SELECT_MONTH),
                Click.on(UTestPageRegister.SELECT_DAY),
                Click.on(UTestPageRegister.SELECT_YEAR),
                Enter.theValue("Spanish").into(UTestPageRegister.INPUT_LANGUAGE),
                Click.on(UTestPageRegister.BUTTON_SELECT_LANGUAGE),
                Click.on(UTestPageRegister.BUTTON_NEXT_LOCATION),
                Click.on(UTestPageRegister.BUTTON_NEXT_DEVICES),
                Click.on(UTestPageRegister.BUTTON_NEXT_LAST_STEP),
                Enter.theValue("hNsJmS7wm8HiBjr").into(UTestPageRegister.INPUT_PASSWORD),
                Enter.theValue("hNsJmS7wm8HiBjr").into(UTestPageRegister.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestPageRegister.CHECK_BUTTON_TERMS),
                Click.on(UTestPageRegister.CHECK_BUTTON_PRIVACY),
                Click.on(UTestPageRegister.BUTTON_COMPLETE));
    }
}
