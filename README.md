# ProyectoFinal

MICROSERVICIO HOTEL: 
Este microservicio proporciona funcionalidades para la gestión de hoteles en una agencia de viajes.
Está desarrollado en Spring Boot y utiliza una base de datos MySQL para almacenar la información de los hoteles. 
Permite consultar hoteles disponibles y obtener datos específicos por nombre.

Características Principales
- Arquitectura basada en microservicios.
- Uso de base de datos MySQL.
- Integración con otros microservicios de la agencia, como los de vuelos y reservas.
- Exposición de endpoints para interactuar con las entidades de hotel.
  
Tecnologías Utilizadas
- Spring Boot: Infraestructura eficiente para microservicios.
- Swagger: Documentación y visualización de API RESTful.
- JUnit: Pruebas unitarias en Java.
  
Inicio Rápido
Clonar el repositorio: git clone https://github.com/xxx.git

Entidades
Hotel: Representa un hotel con las propiedades idHotel, nombre, categoría, precio y disponibilidad.

Funcionalidades
Listar todos los hoteles disponibles.
Consultar un hotel específico por su nombre.
Endpoints
Puerto 8080
Listar todos los hoteles disponibles

URL: /hoteles/disponibles
Método: GET
Consultar un hotel por nombre

URL: /hoteles/{nombre}
Método: GET

MICROSERVICIO VUELOS: 
Este microservicio proporciona funcionalidades para la gestión de vuelos en una agencia de viajes. 
Permite consultar vuelos disponibles y actualizar las plazas de un vuelo específico.

Características Principales
- Arquitectura basada en microservicios.
- Uso de base de datos MySQL.
- Integración con otros microservicios de la agencia, como los de hotel y reservas.
- Exposición de endpoints para interactuar con las entidades de vuelo.
  
Tecnologías Utilizadas
- Spring Boot: Infraestructura eficiente para microservicios.
- Swagger: Documentación y visualización de API RESTful.
- JUnit: Pruebas unitarias en Java.

Inicio Rápido
Clonar el repositorio: 


Entidades
Vuelo: Representa un vuelo con las propiedades idVuelo, compañía, fecha de vuelo, precio y plazas disponibles.

Funcionalidades
Listar todos los vuelos disponibles para una cantidad específica de plazas.
Actualizar las plazas disponibles en un vuelo.
Endpoints
Puerto 8081
Listar vuelos disponibles

URL: /vuelos?plazas={número_de_plazas}
Método: GET
Actualizar plazas de un vuelo

URL: /vuelos/{idVuelo}/plazas?plazasReservadas={número}
Método: PUT



MICROSERVICIO RESERVAS:
Este microservicio proporciona funcionalidades para la gestión de reservas en una agencia de viajes.
Permite registrar una nueva reserva e interactúa con los microservicios de vuelos 
hoteles para actualizar la disponibilidad y obtener información de los hoteles.

Características Principales
- Arquitectura basada en microservicios.
- Uso de base de datos MySQL.
- Interacción con el microservicio de vuelos para actualizar plazas disponibles y con el de hoteles para obtener el idHotel.
- Exposición de endpoints para interactuar con las entidades de reserva.

Tecnologías Utilizadas
- Spring Boot: Infraestructura eficiente para microservicios.
- Swagger: Documentación y visualización de API RESTful.
- JUnit: Pruebas unitarias en Java.

Inicio Rápido
Clonar el repositorio:

Entidades
Reserva: Representa una reserva con las propiedades idReserva, nombreCliente, dni, idHotel e idVuelo.

Funcionalidades
- Registrar una nueva reserva.
- Consultar reservas existentes para un hotel específico.
- Endpoints
Puerto 8082
Registrar una nueva reserva

URL: /reservas?totalPersonas={número}
Método: POST
Cuerpo: JSON con la estructura:
json
Copiar código:
{
  "idVuelo": 1,
  "idHotel": 2,
  "nombreCliente": "Juan Pérez",
  "dni": "12345678A"
}

Consultar reservas por nombre de hotel
URL: /reservas/hotel/{nombreHotel}
Método: GET
