package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.MercadoLibreUI.*;

public class ReescribirTeXtoTask implements Task {
    public static Performable reescribirTexto() {
        return instrumented(ReescribirTeXtoTask.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("La palabra es:" + LST_RESULTADO_ZAPATOS.resolveFor(actor).getText() );

        String resultado = LST_RESULTADO_ZAPATOS.resolveFor(actor).getText();
        System.out.println(resultado);
        StringBuilder resultadoInverso = new StringBuilder(resultado);
        resultado = resultadoInverso.reverse().toString();
        System.out.println(resultado);


    }

}
