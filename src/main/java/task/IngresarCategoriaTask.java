package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.MercadoLibreUI.LST_CATEGORIA_SELECCIONAR;

public class IngresarCategoriaTask implements Task {
    private String categoria;

    public IngresarCategoriaTask(String categoria) {
        this.categoria = categoria;
    }

    public static Performable ingresarCategoria(String categoria) {
        return instrumented(IngresarCategoriaTask.class,categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LST_CATEGORIA_SELECCIONAR));
        /*
        List<WebElementFacade> listaCategoria = LST_CATEGORIA.resolveAllFor(actor);
        List<WebElementFacade> listaCategoriaSeleccionar = LST_CATEGORIA_SELECCIONAR.resolveAllFor(actor);


        for (int i = 0; i< listaCategoria.size(); i++){
            System.out.println("las categorias son :" + listaCategoria.get(i).getText());
            }


        for (int i = 0; i< listaCategoria.size(); i++){
            System.out.println("la categoria consultar es : "+ categoria);
            if (categoria.equals(listaCategoria.get(i).getText())){
                actor.attemptsTo(Click.on(listaCategoriaSeleccionar.get(i)));
                System.out.println("la categoria seleccionada es :" + listaCategoria.get(i).getText());
            }
        }*/
    }
}
