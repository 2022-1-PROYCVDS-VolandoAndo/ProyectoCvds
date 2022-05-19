CREATE SEQUENCE IF NOT EXISTS idUser;
CREATE SEQUENCE IF NOT EXISTS idRecur;
CREATE SEQUENCE IF NOT EXISTS idReserv;

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
    dia VARCHAR(10) NOT NULL,
    idRecurso INT NOT NULL,
    tiempoInicio time NOT NULL,
    tiempoFinal time NOT NULL,
    PRIMARY KEY (dia,idRecurso),
    FOREIGN KEY(idRecurso) REFERENCES Recursos(idRecurso))
;

CREATE TABLE IF NOT EXISTS Reservas(
    idReserva INT NOT NULL  DEFAULT nextval('idReserv'),
    idRecurso INT NOT NULL,
    idUsuario INT NOT NULL,
    tiempoInicio TIMESTAMP NOT NULL,
    tiempoFinal TIMESTAMP NOT NULL,
    recurrencia BOOLEAN NOT NULL,
    periodicidad VARCHAR(15),
    finalRecurrencia TIMESTAMP,
    fechaSolicitud TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    etapa VARCHAR(12) NOT NULL,
    estado BOOLEAN NOT NULL,
    PRIMARY KEY (idReserva),
    FOREIGN KEY(idRecurso) REFERENCES Recursos(idRecurso),
    FOREIGN KEY(idUsuario) REFERENCES Usuarios(idUsuario))
;

insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('jhon.pineros@mail.escuelaing.edu.co', 'Sebastian Piñeros', '123456', 'Sistemas', 'Comunidad');
insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('juan.martinez-car@mail.escuelaing.edu.co', 'Juan Martinez', 'asdfgh', 'Sistemas', 'Comunidad');
insert into Usuarios (mail, nombre, contrasena, programa, tipo) VALUES ('admin@mail.escuelaing.edu.co', 'admin', 'qazwsx', 'NA', 'Administrador');

insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Sala de estudio 1', 'Sala de estudio', 4, 'Biblioteca Central', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Sala de estudio 2', 'Sala de estudio', 6, 'Biblioteca Central', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo de estudio 1', 'Equipo de estudio', 1, 'Biblioteca Central', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo de estudio 2', 'Equipo de estudio', 1, 'Biblioteca Satelite', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 1', 'Equipo multimedia', 1, 'Biblioteca Satelite', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 2', 'Equipo multimedia', 1, 'Biblioteca Central', TRUE);
insert into Recursos (nombre, tipo, capacidad, ubicacion, estado) VALUES ('Equipo multimedia 3', 'Equipo multimedia', 1, 'Biblioteca Satelite', FALSE);

-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (1, 1, '2022-05-18 13:00:00', '2022-05-18 14:30:00', FALSE, NULL, NULL, 'Terminado', TRUE);
-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (2, 1, '2022-05-24 11:30:00', '2022-05-24 13:00:00', FALSE, NULL, NULL, 'Activo', TRUE);
-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (2, 2, '2022-05-24 8:30:00', '2022-05-24 10:00:00', FALSE, NULL, NULL, 'Activo', TRUE);
-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (2, 1, '2022-05-25 11:30:00', '2022-05-25 13:00:00', FALSE, NULL, NULL, 'Cancelado', TRUE);
-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (5, 2, '2022-05-25 14:00:00', '2022-05-25 15:00:00', FALSE, NULL, NULL, 'Activo', TRUE);
-- insert into Reservas (idRecurso, idUsuario, tiempoInicio, tiempoFinal, recurrencia, periodicidad, finalRecurrencia, etapa, estado) VALUES (6, 1, '2022-05-25 13:00:00', '2022-05-25 14:30:00', FALSE, NULL, NULL, 'Activo', TRUE);

-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Lunes', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Martes', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Jueves', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Viernes', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Sabado', 1, '7:00', '19:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Lunes', 2, '7:00', '17:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Martes', 2, '7:00', '17:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 2, '7:00', '17:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Jueves', 2, '7:00', '17:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Viernes', 2, '7:00', '17:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Lunes', 3, '10:00', '16:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Martes', 3, '10:00', '16:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 3, '10:00', '16:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Jueves', 3, '10:00', '16:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Viernes', 3, '10:00', '16:00');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Lunes', 4, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Martes', 4, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 4, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 5, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Jueves', 5, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Viernes', 5, '8:30', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Lunes', 6, '10:00', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Miercoles', 6, '10:00', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Viernes', 6, '10:00', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Martes', 7, '10:00', '17:30');
-- insert into Disponibilidad (dia, idRecurso, tiempoInicio, tiempoFinal) VALUES ('Jueves', 7, '10:00', '17:30');