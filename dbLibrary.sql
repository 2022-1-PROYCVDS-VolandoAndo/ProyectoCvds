CREATE SEQUENCE IF NOT EXISTS idUser;
CREATE SEQUENCE IF NOT EXISTS idRecur;
CREATE SEQUENCE IF NOT EXISTS idReserv;
CREATE SEQUENCE IF NOT EXISTS idDisp;

CREATE TABLE IF NOT EXISTS Recursos(
    idRecurso INT NOT NULL DEFAULT nextval('idRecur'),
    nombre VARCHAR(45) NOT NULL UNIQUE,
    tipo VARCHAR(45) NOT NULL,
    capacidad INT NOT NULL,
    ubicacion VARCHAR(20) NOT NULL,
    estado BOOLEAN NOT NULL,
    PRIMARY KEY (idRecurso))
;

CREATE TABLE IF NOT EXISTS Usuarios(
    idUsuario INT NOT NULL DEFAULT nextval('idUser'),
    mail VARCHAR(50) NOT NULL UNIQUE,
    nombre VARCHAR(45) NOT NULL,
    contrasena VARCHAR(20) NOT NULL,
    programa VARCHAR(30) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    PRIMARY KEY (idUsuario))
;

CREATE TABLE IF NOT EXISTS Disponibilidad(
    id INT NOT NULL DEFAULT nextval('idDisp'),
    idRecurso INT NOT NULL,
    tiempoInicio time NOT NULL,
    tiempoFinal time NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY(idRecurso) REFERENCES Recursos(idRecurso))
;

CREATE TABLE IF NOT EXISTS Reservas(
    idReserva INT NOT NULL  DEFAULT nextval('idReserv'),
    idRecurso INT NOT NULL,
    idUsuario INT NOT NULL,
    tiempoInicio time NOT NULL,
    tiempoFinal time NOT NULL,
    recurrencia BOOLEAN NOT NULL,
    periodicidad VARCHAR(15),
    finalRecurrencia time,
    fechaSolicitud time NOT NULL,
    estado BOOLEAN NOT NULL,
    PRIMARY KEY (idReserva),
    FOREIGN KEY(idRecurso) REFERENCES Recursos(idRecurso),
    FOREIGN KEY(idUsuario) REFERENCES Usuarios(idUsuario))
;
