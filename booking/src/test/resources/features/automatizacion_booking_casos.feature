
#Author: jairo henao arbelaez
Feature: Realizar los casos de pruebas correspondientes en el sitio web booking.com

  @caso1
  Scenario:  Verificar la disponibilidad de vuelos por fechas
    Given ingreso al sitio web
    When  ingreso en Vuelos y Diligencio todos los campos
      |  desde                     |  destino                               | fechaida      |fechavuelta  |
      |  Medellín, Colombia (MDE)  |  Cartagena de Indias, Colombia (CTG)   | 11/05/2022    |05/06/2022   |
    Then  Verifico la disposibilidad del Vuelos para esa fecha "El mejor"

  @caso2
  Scenario: Verificar alojamientos disponibles por nombre nombre de hoteles
    Given ingreso al sitio web
    When  ingreso la ciudad y Digito los datos
      |  ciudad                   |
      |  Hotel Greenview Medellin |
    Then  Verifico el alojamiento"Hotel Greenview Medellin"

  @caso3
  Scenario: Verificar el cambio de idioma del sitio web
    Given ingreso al sitio web
    When  ingreso el pais y hago click en buscar
    Then  Verifico que el idioma cambie"Register"

  @caso4
  Scenario:  verificar que salgan los mensaje de inicio de sesion incorrecto
    Given ingreso al sitio web
    When  ingreso en iniciar sesion y Digito los datos
      |  correosession   |
      |  usb11            |
    Then  Verifico el mensaje  "Comprueba si el e-mail que has introducido es correcto"


  @caso5
  Scenario: verificar el registro de un usuario en booking
    Given ingreso al sitio web
    When  Diligencio  todos los campos y registro un usuario
      |  correo             |  Password1    | Password2     |
      |  usb112@gmail.com   |  qZXCVBNMAS12   | qZXCVBNMAS12  |
    Then  Verifico el registro exitoso"¿Eres un robot?"

