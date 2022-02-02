# ![Serenity BDD](docs/youtube.png "Logo Title Text 1")


# Prueba automatizada para realizar la búsqueda de un video en YouTube

# ![Serenity BDD](docs/serenity.png "Logo Title Text 1")

## Framework

* Serenity: Se utiliza como framework Serenity BDD, que utiliza los resultados de las pruebas para realizar la documentación describiendo lo que hace la aplicación, informa que pruebas se han realizado, las pruebas que fallaron y las que pasaron. 

## Patron de desarrollo

* Se utiliza Screenplay pattern ya que esta centrado en el usuario y orientado a tareas, utiliza los principios S.O.L.I.D. Con screenplay se puede escribir el codigo en un lenguaje mas natural.

## Herramientas de compilación 

# ![Serenity BDD](docs/gradle.png "Logo Title Text 1")

### Gradle

* Es un gestor de proyectos.

# ![Serenity BDD](docs/cucumber.png "Logo Title Text 1")

### Cucumber

* Es una herramienta que permite escribir los casos de prueba.

## La estructura completa del proyecto es la siguiente:

* Features: Utiliza lenguaje Gherkin y contienen los escenarios de negocio del caso de prueba. 
* Tasks: Clases que representan tareas que realiza el actor a nivel de proceso de negocio. 
* Questions: Comprueban los resultados de las operaciones realizadas. 
* Exceptions: Son las excepciones que se visualizan cuando un test falla o tiene errores. 
* Interfaces: Es una clase abstracta que se utiliza para agrupar métodos relacionados con cuerpos vacíos.


# Requerimientos

* Java JDK 1.8 
* Gestor de proyectos Gradle 

# Comandos para ejecutar el proyecto.

* gradle clean test aggregate


## Autores

Juan Francisco Builes Montoya - juanfranciscobumo@gmail.com
