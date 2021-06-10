# project_java_fullstack_polotics

## Instalar ambiente de desarrollo en Windows.

Vamos a instalar las herramientas necesarias para trabajar con Hibernate y Spring. Recuerda verificar la arquitectura de tu computadora para descargar las versiones adecuadas (la puedes encontrar en Control Panel > System Security > System > System Type).

Después de instalar las herramientas (puedes encontrar los links en la sección de enlaces) debemos configurar las variables de entorno con la ruta de instalación de las herramientas, vamos a entrar a Control Panel > System Security > System > Advanced system settings > Environment Variables y vamos a añadir las variables JAVA_HOME y MAVEN_HOME.

También debemos configurar los PATHs para ejecutar nuestro código desde cualquier lugar de nuestra computadora.

## ¿Cómo funcionan las Aplicaciones Web?

Normalmente, las aplicaciones web se componen de los siguientes elementos: el cliente (navegadores como Chrome, Firefox y Safari), el servidor web (donde alojamos la aplicación y llegan las peticiones) y la base de datos (donde persistimos toda la información de los usuarios y la aplicación).

Las aplicaciones web se acceden a través de una URL o dirección web, compuesta por los siguientes elementos: Protocolo de comunicación (http:// y https://), el dominio o IP del servidor y el contexto o sección de la aplicación (por ejemplo, /appventas o /cursos/marca).

Ventajas de las aplicaciones web:

    Facilidad para su instalación y actualización
    Ahorro de recursos en equipos y dispositivos
    Compatibilidad Multiplataforma (independencia del Sistema Operativo)
    Soporte para múltiples usuarios concurrentes
    Acceso multidispositivo (computadoras, tablets, TV, teléfono móvil, etc)
    Soporte para peticiones síncronas y asíncronas
    
## Patrón de Diseño MVC.

Los Patrones de Diseño funcionan a partir de una serie de capas o secciones con sus respectivas responsabilidades, que se comunican entre sí pero deben estar muy bien separadas para agilizar el desarrollo. Gracias a los patrones de diseño podemos reducir la duplicación de código y facilitar mantenimiento de la aplicación.

El Patrón de Diseño MVC tiene los siguientes elementos:

    Capa de Modelo: Organización y estructura de todas las clases o componentes relacionados con la base de datos.
    Capa de Negocio: Reglas, análisis y requerimientos funcionales principales o secundarios de la aplicación.
    Capa de Vista: Formularios y componentes visuales con los que los usuarios deben interactuar.

## Características de los Servlet.

Los Servlets son componentes o clases de Java del lado del servidor web que permiten procesar peticiones del cliente y responderlas a través de la generación de contenido dinámico o redireccionarlas a otros recursos. Los Servlets de tipo HttpServlet son los más utilizados ya que funcionan con el protocolo HTTP (lo encontramos en el paquete javax.servlet.http) pero, también podemos utilizar los GenericServlets si necesitamos cualquier otro protocolo (el paquete es javax.servlet).
Características y práctica de JSP.

Las JSP (JavaServer Page) son componentes del lado del servidor que nos permiten desarrollar páginas web con soporte para contenido dinámico gracias a la inclusión de código Java en código html utilizando los Tags (una sintaxis especial que podemos utilizar en cualquier momento para añadir contenido dinámico: <% for(1=0; i<10: i++) %>).

El desafío de esta clase es crear una página con JSP para visualizar la información de los usuarios que se registran.

## Persistencia de objetos.

En el mundo del desarrollo de software de cualquier aplicación independientemente la tecnología, plataforma en que esté desarrollado o se ponga en producción. Toda aplicación necesita almacenar su información, tomando en cuenta que lo más preciado e importante es dicha información en base a la cual gira el desarrollo del negocio y se insume la aplicación para la automatización de los procesos.

Esta información debe poder ser recuperada en cualquier momento dado tal como fue ingresada, a este proceso de almacenar información y poder recuperarla en cualquier momento dado de forma íntegra independientemente el medio de almacenamiento, se la conoce con el nombre de persistencia.

Existen varios mecanismos de persistencia entre estos se tiene archivos planos, archivos binarios, base de datos relacional, base de datos documentales, etc.

A nivel de especificaciones o tecnologías utilizadas en Java para poder persistir información, se tiene las siguientes:

# JDBC
    Conjunto de clases para poder gestionar la información de la base de datos de forma natural utilizando sentencias DML y DDL. Capas de Persistencia.- También conocida como ORM, ejemplos de estás se tiene a Hibernate, EclipseLink, ToplLink, Datanucleos, entre otras. Las cuales permiten persistir información y gestionar la data pero como objetos. gracias a que una de las principales características de este tipo de capas de persistencia es mapear un modelo relacional a un modelo objetual.

# JPA
    Es un administrador de persistencia que utiliza a una capa de persistencia como proveedor de persistencia. Otorgando caracterìsticas estandarizadas en cuanto al tema transaccional, consultas y pool de conexión independientemente de la capa de persistencia.

Cabe mencionar finalmente que JPA es la especificaciòn jerárquica que utiliza a las capas de persistencia, y éstas utilizan JDBC para persistir la información.

## Mapear Tablas de la Base de Datos.

El proceso de mapear las tablas de la base de datos a clases en nuestra capa de modelo se conoce como ORM (Object Relational Mapping), vamos a convertir las columnas de las tablas en atributos de las clases y las relaciones entre tablas pasan a ser atributos de tipo objeto o lista de objetos.

Antes de comenzar debemos configurar las dependencias para la base de datos que vamos a utilizar y el manejo/soporte del administrador de capas de persistencia (JPA) en el archivo pom.xml.

## Añadir JPA Repository.

Los repositorios son la herramienta principal, trabajan sobre una capa de abstracción un poco más alta en las operaciones CRUD y nos evitan el trabajo de crear una clase abstracta con todas las operaciones CRUD relacionadas con la base de datos y, a partir de esta clase, crear una nueva clase para administrar las diferentes entidades. Existen varios repositorios de acuerdo a la tecnología a utilizar, como CrudRepository, JPARepository y MongoRepository (ambos basados en PageAndSortingRepository).

## Implementar las operaciones de Consulta con JPA Repository.

Realizar consultas personalizadas basado en los atributos de la clase base que se generan de forma automática en el tiempo de ejecución (Query Generation Strategy). También soporta otro tipo de consultas basadas en JPQL (Java Persistence Query Language) como @Query y @NamedQuery.
