package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.MercadoLibreUI.LST_COLOR_NEGRO;

public class SeleccionarColorTask implements Task {
    private String color;

    public SeleccionarColorTask(String color) {
        this.color = color;
    }

    public static Performable seleccionarColor(String color) {
        return instrumented(SeleccionarColorTask.class,color);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(LST_COLOR_NEGRO));

    }
}
