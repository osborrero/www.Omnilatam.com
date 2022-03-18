package steps;

import Question.VerificarResultadoQuestion;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.ConsultarProductoTask;
import task.IngresarCategoriaTask;
import task.ReescribirTeXtoTask;
import task.SeleccionarColorTask;
import ui.MercadoLibreUI;

public class MercadoLibreSteps {

    Actor Usuario;

    @Before
    public void ingresarPagina(){
        OnStage.setTheStage(new OnlineCast());
        Usuario = Actor.named("Usuario");
        Usuario.can(BrowseTheWeb.with(driver));
    }

    @Managed
    WebDriver driver;


    @Given("Usuario ingresa a mercado libre")
    public void usuario_ingresa_a_mercado_libre(){
        Usuario.attemptsTo(Open.browserOn().the(MercadoLibreUI.class));


        }

    @When("Filta por Zapatos {string}")
    public void filtaPorZapatos(String zapato) {
        Usuario.attemptsTo(ConsultarProductoTask.consultarProducto(zapato));
    }

    @And("Selecciona la opcion de categoría {string}")
    public void seleccionaLaOpcionDeCategoría(String categoria) {
        Usuario.attemptsTo(IngresarCategoriaTask.ingresarCategoria(categoria));

    }

    @And("Marca el color {string}")
    public void marcaElColor(String color) {
        Usuario.attemptsTo(SeleccionarColorTask.seleccionarColor(color));

    }

    @Then("Muestra el numero de zapatos consultados")
    public void muestraElNumeroDeZapatosConsultados() {
        Usuario.should(GivenWhenThen.seeThat(VerificarResultadoQuestion.verificarResultado()));
        Usuario.attemptsTo(ReescribirTeXtoTask.reescribirTexto());
    }
}
