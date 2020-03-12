# RetoSophos

# Introduccion

Objetivos

Realizar la automatización del proceso de compra de un producto en una página web y comparar que el producto si fue agregado al carrito de compras.

Realizar la automatización de la ejecución y respuesta de un servicio Rest mediante una petición get.

#Recomendaciones

Tenga en cuenta que para ejecutar el servicio rest los datos que hay en el feature pueden variar por lo que la automatización puede fallar, por lo tanto
es necesario validar que los datos que hay en el feature, si los este devolviendo el servicio en el momento de la ejecución de lo contrario se deben cambiar.

# Detalles generales

* Serenity: Se utiliza como framework que utiliza los resultados de las pruebas para realizar la documentación describiendo lo que hace la aplicación, 
informa que pruebas se han realizado, las pruebas que fallaron y las que pasaron. 

* Screenplay: Esta centrado en el usuario y orientado a tareas, utiliza los principios S.O.L.I.D. Con screenplay se puede escribir el codigo en un lenguaje 
mas natural.

* Gradle: Es un gestor de proyectos.

* Cucumber: Es una herramienta que permite escribir los casos de prueba.

# La estructura completa del proyecto es la siguiente:


* Feature: Utiliza lenguaje Gherkin y contienen los escenarios de negocio del caso de prueba. 
* Task: Clases que representan tareas que realiza el actor a nivel de proceso de negocio. 
* Interaction: Clases que representan interacciones de una acción directa del usuario con la interfaz.
* Question: Comprueban los resultados de las operaciones realizadas. 
* User Interface: Mapean los componentes de una interfaz de usuario. 
* Util: Clases que estan relcionadas con las utilidades de dominio. 
* Model: Clases donde se encuentran los objetos complejos de negocio.
* Exceptions: Son las excepciones que se visualizan cuando un test falla o tiene errores. 


# Requerimientos


* Java JDK 1.8 
* Gestor de proyectos Gradle 
* Chromedriver
* GOOGLE CHROME en su última versión


# Comandos para ejecutar el proyecto.


Desde el CMD

* gradle clean test aggregate --info 

