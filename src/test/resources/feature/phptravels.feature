# Autor Amir
@stories
Feature: Navegacion en phptravels

  Background: Abrir y como usuario registrado loguearse en la plataforma
    Given Autentificarse ingresando usuario y clave
      |email|clave|
      |admin@phptravels.com|demoadmin|
  @scenario1
  Scenario: Como usuario navegar en el menu y agregar una nueva categoria en la pestaña blog
    When Registar cada uno de los datos para agregar una nueva categoria
    |categoria|estado|vietnan|ruso|arabe|irak|turco|frances|espanol|aleman|
    |Test|Enable|Andree|Annn|Annnm|Aggger|Amn|Amiii|Amot|Amin|

    Then Verificar que se realizo el registro exitoso Test

    @Scenario2
    Scenario: Como usuario navegar en el menu y agregar un nuevo post en la pestaña blog
      When Crear un post con la categoria creada
        |titulo|link|mensaje|palabras|descripcion|selectestado|selectcategoria|relations|
        |Automatizacion con Serenity BDD|https://www.phptravels.net//blog/serenitybBDD|Serenity BDD|Patron de Diseño, SOLID, POO, Cucumber|Automatizacion de software|Enable|Test|Kinda 2,000 Years After His Death|
      Then Test Passad