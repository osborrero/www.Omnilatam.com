@Cucumber
  Feature: Ingresar a Mercado libre

    Scenario: Mostrar Articulo de mercado libre
      Given Usuario ingresa a mercado libre
      When Filta por Zapatos "Zapato"
      And Selecciona la opcion de categoría "Botas y Botines"
      And Marca el color "negro"
      Then Muestra el numero de zapatos consultados