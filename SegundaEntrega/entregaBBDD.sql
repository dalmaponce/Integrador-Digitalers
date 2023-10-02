CREATE database segunda_entrega;
USE segunda_entrega;


CREATE TABLE TiposBicicleta (
    Codigo INT PRIMARY KEY,
    Descripcion VARCHAR(255)
);

CREATE TABLE Bicicletas (
    Codigo INT PRIMARY KEY,
    Marca VARCHAR(255),
    Modelo VARCHAR(255),
    Color VARCHAR(255),
    Tipo INT,
    AnioFabricacion INT
);

CREATE TABLE Clientes (
    CodigoCliente INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Apellido VARCHAR(255),
    Telefono VARCHAR(15),
    DNI VARCHAR(15),
    Domicilio VARCHAR(255),
    CodigoBicicleta INT
);

INSERT INTO TiposBicicleta (Codigo, Descripcion) VALUES
(1, 'Paseo'),
(2, 'Montaña'),
(3, 'Carrera');

INSERT INTO Bicicletas (Codigo, Marca, Modelo, Color, Tipo, AnioFabricacion) VALUES
(1, 'Marca1', 'Modelo1', 'Rojo', 1, 2020),
(2, 'Marca2', 'Modelo2', 'Azul', 2, 2021),
(3, 'Marca3', 'Modelo3', 'Verde', 3, 2019);

INSERT INTO Clientes (Nombre, Apellido, Telefono, DNI, Domicilio, CodigoBicicleta) VALUES
('Juan', 'Perez', '123456789', '12345678A', 'Calle 123', 1),
('Maria', 'Gomez', '987654321', '98765432B', 'Calle 456', 2),
('Carlos', 'Lopez', NULL, '56789012C', 'Calle 789', 0);

SELECT C.Nombre, C.Apellido, B.Marca, B.Modelo, TB.Descripcion AS TipoBicicleta FROM Clientes AS C LEFT JOIN Bicicletas AS B ON C.CodigoBicicleta = B.Codigo LEFT JOIN TiposBicicleta AS TB ON B.Tipo = TB.Codigo;

