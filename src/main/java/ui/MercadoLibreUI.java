package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class MercadoLibreUI extends PageObject {


    public static final Target TXT_BUSCADOR = Target.the("Ingresar dato a buscar").locatedBy("//input[@class='nav-search-input']");
    public static final Target BTN_LUPA = Target.the("lupa buscar dato").locatedBy("//div[@class='nav-icon-search']");
    public static final Target LST_CATEGORIA = Target.the("lista de categorias").locatedBy("//span[@class='ui-search-filter-name']");
    public static final Target LST_COLOR_NEGRO = Target.the("color negro").locatedBy("/html/body/main/div/div/aside/form/div[8]/ul/li[1]/ul/li[1]/div/a/div");
    public static final Target SPAN_RESULTADO = Target.the("resultado de la busqueda").locatedBy("//span[@class='ui-search-search-result__quantity-results']");
    public static final Target LST_RESULTADO_ZAPATOS = Target.the("Lista de zapatos").locatedBy("//h2[@class='ui-search-item__title ui-search-item__group__element']");
    public static final Target LST_CATEGORIA_SELECCIONAR = Target.the("Seleccionar categoria").locatedBy("/html/body/main/div/div/aside/form/div[5]/ul/li[2]");
}
