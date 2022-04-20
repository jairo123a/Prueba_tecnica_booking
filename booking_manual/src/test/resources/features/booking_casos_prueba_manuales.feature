
#Author: jairo henao arbelaez

Feature:Generar 15 casos de pruebas manuales para el sitio web BOOKING

  @manual
  Scenario:verifico si hay atracciones disponibles en Dubai
    Given que yo ingreso al sitio web
    When yo ingreso al menu Atracciones y diligencio los campos de busqueda
    Then yo Verifico que se encuentren atracciones disponibles en Dubai

  @manual
  Scenario:verifico la reservación de un taxi
    Given que yo ingreso al sitio web
    When yo ingreso al menu Taxis aeropuertos y diligencio lleno los campos
    And yo dio click en buscar
    Then yo Verifico que se encuentren atracciones disponibles en Dubai


  @manual
  Scenario:verifico el modulo de alquiler de coches
    Given que yo ingreso al sitio web
    When yo ingreso al menu Alquiler de coches y diligencio  los campos
    And yo dio click en buscar
    Then yo Verifico que la informacion este disponible

  @manual
  Scenario:verifico el modulo de alquiler de coches
    Given que yo ingreso al sitio web
    When yo ingreso al menu Alquiler de coches y diligencio  los campos
    And yo dio click en buscar
    Then yo Verifico que la informacion este disponible




  @manual
  Scenario:verifico la funcnionalidad de casas en colombia
    Given que yo ingreso al sitio web
     And yo ingreso al icono Casas
    When yo busco la informacion de casas
    Then yo Verifico que se encuentren disponibles casas en el sitio web

  @manual
  Scenario:verifico la disponibilidad del sitio web
    Given que yo ingreso al sitio web
    When yo busco la informacion  de la pagina
    Then yo Verifico que el sitio web este disponible

  @manual
  Scenario:verifico la disponibilidad del sitio web
    Given que yo ingreso al sitio web
    When yo busco la informacion  de la pagina
    Then yo Verifico que el sitio web este disponible

  @manual
  Scenario:verifico mensaje de correo incorrecto
    Given que yo ingreso al sitio web
    And yo ingreso a al modulo inicio sesion
    When yo busco diligencio el campo de correo
    Then yo Verifico un mensaje de correo incorrecto

  @manual
  Scenario:verifico informacion disponible de terminos y condicciones
    Given que yo ingreso al sitio web
    And yo ingreso a registrar
    When yo ingreso a terminos y condicciones
    Then yo Verifico un mensaje de correo incorrecto


  @manual
  Scenario:verifico informacion disponible de terminos un condicciones
    Given que yo ingreso al sitio web
    And yo ingreso a registrar
    When yo ingreso a terminos y condicciones
    Then yo Verifico un mensaje de correo incorrecto

  @manual
  Scenario:verifico el mensaje de caracteres requeridos en la contraseña
    Given que yo ingreso al sitio web
    And yo ingreso a iniciar sesion
    When yo ingreso el password
    And yo lo confirmo.
    And yo doi click en crear cuenta
    Then yo Verifico un mensaje de La contraseña debe tener al menos 10 caracteres


  @manual
  Scenario:verifico el inicio de sesion correcto
    Given que yo ingreso al sitio web
    And yo ingreso a iniciar sesion
    And yo ingreso el correo
    When yo ingreso el password
    And y doi click en iniciar sesion
    Then yo Verifico que el incio de sesion sea correcto


  @manual
  Scenario:verifico el registro correcto de un usuario
    Given que yo ingreso al sitio web
    And yo ingreso a Registrar
    And yo ingreso el correo
    When yo ingreso el password
    And yo lo confirmo
    And y doi click en Registrar
    Then yo Verifico que el Registro sea correcto


  @manual
  Scenario:verifico el registro de un alojamiento exitoso
    Given  que yo ingreso al sitio web
    And yo ingreso al menu Registra tu alojamiento
    When yo cuando incio sesion
    And yo Diligencio la informacion de registro de alojamiento
    And yo doi cick en registrar
    Then yo Verifico que el Registro sea correcto


  @manual
  Scenario:verifico el registro de un alojamiento exitoso
    Given  que yo ingreso al sitio web
    And yo ingreso al menu Registra tu alojamiento
    When yo cuando incio sesion
    And yo Diligencio la informacion de registro de alojamiento
    And yo doi cick en registrar
    Then yo Verifico que el Registro sea correcto














