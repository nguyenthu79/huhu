package testcal.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import testcal.ui.GoogleSearchPage;

public class OpenTheApplication implements Task {

    GoogleSearchPage googleSearchPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(googleSearchPage)
        );
    }
    public static OpenTheApplication openBrower(){
        return instrumented(OpenTheApplication.class);
    }
}
