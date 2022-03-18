package Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static ui.MercadoLibreUI.*;

public class VerificarResultadoQuestion implements Question {

    public static VerificarResultadoQuestion verificarResultado() {
        return new VerificarResultadoQuestion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        System.out.println(SPAN_RESULTADO.resolveFor(actor).getText());
        return true;
    }
}
