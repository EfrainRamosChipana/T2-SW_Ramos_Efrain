DROP DATABASE IF EXISTS BDCibertec ;
CREATE DATABASE BDCibertec ;
USE BDCibertec ;

CREATE TABLE Medico
(
 IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)
);

CREATE TABLE Especialidad
(
 IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)
 );
 
 INSERT INTO Medico (NomMedico, ApeMedico, FechNacMedico) VALUES
('Juan', 'Perez', '1970-05-20'),
('Ana', 'Garcia', '1982-11-15'),
('Carlos', 'Lopez', '1990-03-10'),
('Maria', 'Hernandez', '1985-07-25'),
('Luis', 'Martinez', '1975-09-05');


INSERT INTO Especialidad (Titulo, Funcion, FechGraduacion, IdMedico) VALUES
('Cardiologia', 'Tratamiento de enfermedades del corazón', '1995-06-15', 1),
('Neurologia', 'Diagnostico de enfermedades del sistema nervioso', '2007-12-22', 2),
('Pediatria', 'Cuidado médico de niños y adolescentes', '2010-05-30', 3),
('Dermatologia', 'Diagnostico y tratamiento de enfermedades de la piel', '2009-09-18', 4),
('Oncologia', 'Tratamiento de cáncer', '2002-03-12', 5);
