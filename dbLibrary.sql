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

insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('jhon.pineros@mail.escuelaing.edu.co', 'Sebastian Piñeros', '123456', 'Sistemas', 'Comunidad');
insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('juan.martinez-car@mail.escuelaing.edu.co', 'Juan Martinez', 'asdfgh', 'Sistemas', 'Comunidad');
insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('admin@mail.escuelaing.edu.co', 'admin', 'qazwsx', 'NA', 'Administrador');

insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Sala de estudio 1', 'Sala de estudio', 4, 'Bliblioteca 1', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Sala de estudio 2', 'Sala de estudio', 6, 'Bliblioteca 1', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo de estudio 1', 'Equipo de estudio', 1, 'Bliblioteca 1', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo de estudio 2', 'Equipo de estudio', 1, 'Bliblioteca 2', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 1', 'Equipo multimedia', 1, 'Bliblioteca 2', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 2', 'Equipo multimedia', 1, 'Bliblioteca 2', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 3', 'Equipo multimedia', 1, 'Bliblioteca 2', FALSE);
