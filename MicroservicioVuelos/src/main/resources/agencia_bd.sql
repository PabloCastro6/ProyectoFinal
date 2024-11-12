CREATE DATABASE agencia_db;
USE agencia_db;

CREATE TABLE hoteles (
    idHotel INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    precio DECIMAL(10, 2),
    disponible BOOLEAN
);
INSERT INTO hoteles (nombre, categoria, precio, disponible) VALUES 
('Hotel A', '5 estrellas', 250.00, TRUE),
('Hotel B', '4 estrellas', 150.00, TRUE),
('Hotel C', '3 estrellas', 100.00, FALSE),
('Hotel D', '4 estrellas', 200.00, TRUE);



CREATE TABLE vuelos (
    id_Vuelo INT AUTO_INCREMENT PRIMARY KEY,
    compania VARCHAR(100),
    fechaVuelo DATE,
    precio DECIMAL(10, 2),
    plazasDisponibles INT
);

INSERT INTO vuelos (compania, fechaVuelo, precio, plazasDisponibles) VALUES 
('Aerolínea A', '2024-12-01', 200.00, 5),
('Aerolínea B', '2024-12-05', 150.00, 4),
('Aerolínea C', '2024-12-10', 300.00, 2),
('Aerolínea D', '2024-12-15', 250.00, 0);  



CREATE TABLE reservas (
    idReserva INT AUTO_INCREMENT PRIMARY KEY,
    nombreCliente VARCHAR(100) NOT NULL,
    dni VARCHAR(10) NOT NULL,
    idHotel INT,
    id_Vuelo INT,
    FOREIGN KEY (idHotel) REFERENCES hoteles(idHotel),
    FOREIGN KEY (id_Vuelo) REFERENCES vuelos(id_vuelo)
);


INSERT INTO reservas (nombreCliente, dni, idHotel, id_Vuelo) VALUES
('Cliente A', '12345678A', 1, 1),
('Cliente B', '87654321B', 2, 2);


SHOW CREATE TABLE reservas;


Select * from hoteles;
Select * from vuelos;
Select * from reservas;

DROP TABLE IF EXISTS reservas;


SELECT * FROM vuelos WHERE plazasDisponibles >= 5;
DESCRIBE vuelos; 
SHOW TABLES;

ALTER TABLE vuelos CHANGE COLUMN idVuelo id_vuelo INT AUTO_INCREMENT;
ALTER TABLE vuelos CHANGE fechaVuelo fecha_vuelo DATE;
ALTER TABLE vuelos CHANGE plazasDisponibles plazas_disponibles INT;

ALTER TABLE reservas CHANGE idHotel id_hotel INT;
ALTER TABLE reservas CHANGE nombreCliente nombre_cliente VARCHAR(100);

