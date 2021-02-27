# Autor Amir
  @stories
  Feature: Navegacion en phptravels

    Background: Abrir sito web
      Given Un sitio web en la pagina phptravels
    @scenario1
    Scenario: login en sitio
      When Ingresamos el usuario y contrasena
      Then Login Exitoso