package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.MercadoLibreUI.*;

public class ConsultarProductoTask implements Task {
    private String zapato;

    public ConsultarProductoTask(String zapato) {
        this.zapato = zapato;
    }

    public static Performable consultarProducto(String zapato) {
        return instrumented(ConsultarProductoTask.class,zapato);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(zapato).into(TXT_BUSCADOR));
        actor.attemptsTo(Click.on(BTN_LUPA));

    }
}
