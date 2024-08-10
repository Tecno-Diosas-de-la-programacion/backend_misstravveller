![fondo miss travveller](https://github.com/user-attachments/assets/7342a9fe-ae47-464f-8624-a95076900f2c)
# MissTraveller Backend

Este repositorio contiene el código del backend para la aplicación de la agencia de viajes MissTraveller, desarrollada por el equipo Tecno Diosas de la Programación. El backend está desarrollado en Java con Spring Boot y utiliza diversas tecnologías para la gestión de datos, seguridad y documentación de la API.
Descripción del Proyecto
El backend de MissTraveller está diseñado para soportar la plataforma de viajes, gestionando la creación, actualización, eliminación y consulta de destinos, itinerarios, reservas y otros servicios turísticos. Utiliza una base de datos MySQL y las tecnologías JDBC y JPA para la interacción con la base de datos, además de integrar Lombok para la reducción de código boilerplate y Hibernate como implementación de JPA para el mapeo objeto-relacional.
Tecnologías Utilizadas
Java
Spring Boot: Framework de aplicación Java para crear aplicaciones independientes basadas en Spring.
MySQL: Sistema de gestión de bases de datos relacional.
JDBC: API estándar de Java para la conexión con bases de datos.
JPA (Java Persistence API): Especificación de Java para gestionar la persistencia de datos en aplicaciones Java.
Lombok: Biblioteca que ayuda a reducir el código boilerplate en Java.
Hibernate: Framework ORM (Object-Relational Mapping) para Java.
Swagger Documentation: Herramienta para la documentación automática de APIs.
Visual Studio Code: Editor de código fuente desarrollado por Microsoft.
IntelliJ IDEA: Entorno de desarrollo integrado (IDE) para Java.
Git: Sistema de control de versiones distribuido.
Postman: Plataforma de colaboración para el desarrollo de APIs.
Requisitos del Sistema
Para ejecutar este proyecto localmente, necesitarás tener instalados los siguientes programas:
Java JDK 

MySQL
Git
IDE de desarrollo Java (como IntelliJ IDEA)
Instalación
Sigue los siguientes pasos para configurar el backend en tu máquina local:
Clonar el repositorio:
bash
Copiar código
git clone https://github.com/Tecno-Diosas-de-la-programacion/backend_misstravveller.git
Importar el proyecto en tu IDE:
Abre el proyecto en tu IDE (IntelliJ IDEA recomendado) como un proyecto Maven.
Configurar la base de datos:
Crea una base de datos MySQL llamada misstraveller y asegúrate de configurar las credenciales en el archivo application.properties.
Ejecutar la aplicación:
Ejecuta la aplicación desde tu IDE o mediante el comando Maven:
bash
Copiar código
mvn spring-boot:run
Probar la API:
Accede a la documentación de Swagger en http://localhost:8080/swagger-ui.html para explorar y probar los endpoints de la API.
Estructura del Proyecto
La estructura de archivos del backend es la típica de una aplicación Spring Boot:
css
Copiar código
backend_misstravveller/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── tecno_diosas_de_la_programacion/
│   │   │           └── misstraveller/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               └── MissTravellerApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
src/main/java/: Contiene los paquetes para controladores, modelos, repositorios y servicios.
src/main/resources/: Contiene archivos de configuración como application.properties.
pom.xml: Archivo de configuración Maven que define las dependencias del proyecto.
Contribución
¡Contribuciones son bienvenidas! Si deseas colaborar en este proyecto, por favor sigue estos pasos:
Realiza un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza tus cambios y haz un commit (git commit -m 'Agregar nueva funcionalidad').
Sube tus cambios a tu fork (git push origin feature/nueva-funcionalidad).
Abre un Pull Request en el repositorio principal.
Autores
Este proyecto fue desarrollado por el equipo Tecno Diosas de la Programación:

Dulce Camacho Arantxa Vazquez Jaqueline Torres Abigail Ramirez Diana Gallegos Karina Robles Fanny Contreras

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
Contacto
Para cualquier pregunta o sugerencia, por favor, contacta a los autores a través de sus perfiles de GitHub o crea un nuevo Issue en este repositorio.
