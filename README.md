# **Casos de pruebas booking


## Introduccion ##
-estas automatizaciones se hacen con el fin de realizar una prueba técnica donde se tienen como base el sitio web www.booking.com
-El desarrollo de esta automatización se realizó bajo el patrón de diseño Screen Play.

## Importante:

	- Los Step Definition de la automatización vienen por separado cada caso de prueba tiene uno.
    - Todos los caso de prueba tienen un unico Runner llamdo RunnerTagBooking.
    - Se pueden ejecutar una por una de las automatizaciones con la etiqueta tags Ejemplo tags=@caso1.
    - Cada caso de prueba esta bajo una equiqueta para este caso los casos estan de la siguiente forma @caso1 ,@caso2, @caso3, @caso4 ,@caso5.
    - Se pueden ejecutar todos los casos quitando la etiqueta tags en el Runner RunnerTagBooking.


#Requerimientos
1. Para hacer uso de esta automatización se debe tener el pc con intellij.
2. Es necesario que en el equipo donde se va a utilizar esta automatización este previamente configurado java, Gradle.
3. Al seleccionar el runner que desea ejecutar, ir a la opción Run/Edit Configuratons... Luego, le damos la opción + y seleccionamos Junit dentro de opción Build and run colocamos java 11 según la version, en el campo -cp pruebas. test en la opción class ponemos Prueba.runner.RunnerTagBooking también ponemos en el campo Working directory $MODULE_WORKING_DIR$ 
y por último ponemos en el campo Shortem commandline ponemos Jar manifest


#Contenido de la automatización
Tareas:

- **Abrir**: Se encarga de ingresar al sitio web https://www.booking.com/

		-  todas las automatizaciones reutilizan esta tarea 


- **BuscarAlojamiento**: Se encarga de buscar un alojamiento disponible dentro del sitio web-
        
        -Se debe enviar el nombre en el When  en el campo ciudad 
        -El caso en el que se encuentra asociado esta tarea , es el @caso2
        -Se tiene por defecto el siguiente alojamiento "Hotel Greenview Medellin"


- **BuscarIdioma**: Se encarga de ingresar a los idiomas de la página y cambiar el mismo por ingles.
               

				   
- **DiligenciarUnVuelo**: Tarea que se encarga de ingresar al menu de vuelos y alli diligencia todos los campos para buscar la disponibilidad del mismo

   -Se cuenta con cuatro campos que podemos modificar
     -El primer campo se pone de forma automática que es desde donde estamos ubicados.
     -El segundo campo es el nombre del destino al cual vamos.
     -El tercer campo es la fecha de ida el formato de la misma es dia/mes/años.
     -El cuarto campo es la fecha de regreso el formato de la misma es dia/mes/años.


- **IniciarSesion**: Se encarga de ingresar al menu inicio de sesión y digitar el correo.
       -Cuenta con un campo que en este caso es un formato incorrecto para que se pueda comprobar el @caso4
			

- **Registrar**: Se encarga de diligenciar todos los campos para registrar un nuevo usuario

        -Se cuentan con tres campos.
-        -El correo debe llevar un formato correcto ejemplo usb112@gmail.com
         -La Contraseña debe tener Minimo 10 caracteres incluyendo Mayuscuolas y Minisculas Ejemplo qZXCVBNMAS12 
         -Esta Tarea se ejecuta en el @caso5


Preguntas:	
- **PreguntaUsuario**: Se encarga de validar que el registro de un usuario, en este caso como tenemos un antiBot Verificara que e antiBot salga
                 - Esta pregunta se utiliza para el @caso5
                 - En el then debemos enviar el texto que deseamos verificar cuando se registren los datos
	
	
- **VerificarDiligenciamientoVuelo**:Se encarga de verificar la disponibilidad de un vuelo y que este sea la mejor opción
                -esta pregunta se utiliza en el @caso1
                - se debe enviar el texto El mejor para verificar que al momento de diligenciar los campos nos aparezca disponible el vuelo 

				 
- **VerificarElAlojamiento**: Tarea que recibe por parámetro y verifica qwe este disponible este alojamiento dentro de la página de booking.

                     -Esta Tarea se usa en el @caso2
                     - se debe enviar en el then el texto de verificacion que es el nombre del alojamiento + el siguiente texto 1 alojamiento encontrado
                       Ej Hotel Greenview Medellin: 1 alojamiento encontrado
			
- **VerificarIdioma**: Tarea Verifica que el idioma cambie a ingles 
                  Esta tarea se ejecuta en el caso @caso3.
                  Se debe enviar el texto de verificación en el Then en este caso se verifica con el nombre del Botón registrar de la página de inicio 
                  que en ingles es Register
                     Ej Register

	
- **VerificarMensajeCorreo**: Se encarga Verificar el mensaje de correo incorrecto cuando se ingresa uno en el menu de inicio de sesión 
                -Esta tarea se ejecuta en el @caso4
                -para este caso se envía en el then el texto de verificación que sale al ingresar mal el correo 
                 Ejemplo 
-                  Comprueba si el e-mail que has introducido es correcto

	
-

## Ejecutando las pruebas Manuales
  
Una vez descargadas las dependencias se pueden ejecutar las pruebas desde los runners.  
Al correr las pruebas tenga en cuenta lo siguiente:  
  
- Al ejecutar las pruebas manuales saldrán varias ventanas emergentes, una por cada paso de la prueba, donde se deberá indicar si el paso fue exitoso o falló.
En caso de haber fallado saldrá una nueva ventana emergente donde se deberá indicar el motivo por el cual falló.

- Finalmente si al momento de generarse el reporte este no genera la totalidad de los archivos en la carpeta target, es necesario ejecutar por medio de consola el comando <gradle aggregate> para que el reporte de serenity quede completo.
para ello basta con verificar que exista el archivo "index" en la ruta INE_TMN_TCB_Tarjetas_Debito_Mastercard_Manual/manualtest/target/site/serenity

 
##Herramientas utilizadas para crear el proyecto
* [Gradle](https://maven.apache.org/) - Manejador de dependencias.
*Intellij como ID
* Serenity BDD - Biblioteca de código abierto para la generación de reportes.
* Gherkin - Lenguaje Business Readable DSL (Lenguaje específico de dominio legible por el negocio).
 
 
##Versionado
Se utiliza Git para el versionado del proyecto.


##Autor(es)
**Jairo Alonso Henao Arbeláez** henaoarbelaezjairo@gmail.com), 


## Instalación
- Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: 
```git clone https://github.com/jairo123a/Prueba_tecnica_booking.git
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente 
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado
	
## Importación:
	- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente. 
	- Configurar JRE System Library con JavaSE-1.8.	


## Empaquetar el Proyecto
Para compilar el proyecto debes ejecutar el comando:
    
    gradle jar
	
## Para correr el proyecto
	clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity