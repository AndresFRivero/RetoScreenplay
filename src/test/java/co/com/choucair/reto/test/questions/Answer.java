package co.com.choucair.reto.test.questions;

import co.com.choucair.reto.test.userinterface.UTestPageRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        String messageWelcome = Text.of(UTestPageRegister.WELCOME).viewedBy(actor).asString();
        if (question.equals(messageWelcome)) {
            result = true;
        }

        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
