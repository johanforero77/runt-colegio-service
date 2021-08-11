INSERT INTO COLEGIOS (nombre) VALUES ('El colegio del Olimpo');

INSERT INTO CURSOS (grado, salon) VALUES (10, 'A');
INSERT INTO CURSOS (grado, salon) VALUES (10, 'B');
INSERT INTO CURSOS (grado, salon) VALUES (11, 'A');
INSERT INTO CURSOS (grado, salon) VALUES (11, 'B');

INSERT INTO colegios_cursos (colegio_id,curso_id) VALUES (1,1);
INSERT INTO colegios_cursos (colegio_id,curso_id) VALUES (1,2);
INSERT INTO colegios_cursos (colegio_id,curso_id) VALUES (1,3);
INSERT INTO colegios_cursos (colegio_id,curso_id) VALUES (1,4);

--profesores
INSERT INTO PROFESORES (NOMBRE) VALUES ('Némesis');
INSERT INTO PROFESORES (NOMBRE) VALUES ('Príapo');
INSERT INTO PROFESORES (NOMBRE) VALUES ('Iris');


--10A
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Matemáticas', 1, 1);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Español', 1, 2);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Ingles básico', 1, 3);
--10B
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Matemáticas', 2, 1);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Español', 2, 2);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Ingles avanzado', 2, 3);
--11A
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Matemáticas',3, 1);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Pre Icfes',3, 1);
--11B
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Matemáticas', 4, 1);
INSERT INTO ASIGNATURAS (nombre, cursos_id, profesor_id) VALUES ('Pre Icfes', 4, 1);




--ESTUDIANTES



INSERT INTO ESTUDIANTES (NOMBRE) VALUES  ('Afrodita'),('Apolo'),('Ares');
INSERT INTO ESTUDIANTES (NOMBRE) VALUES  ('Artemisa'),('Atenea'),('Dionisio');
INSERT INTO ESTUDIANTES (NOMBRE) VALUES  ('Hefesto'),('Hera');
INSERT INTO ESTUDIANTES (NOMBRE) VALUES  ('Hermes'),('Hades'),('Poseidón'), ('Zeus');


--ESTUDIANTES 10A

INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (1,1), (1,2), (1,3);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (2,1), (2,2), (2,3);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (3,1), (3,2), (3,3);

--ESTUDIANTES 10B
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (4,4), (4,5), (4,6);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (5,4), (5,5), (5,6);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (6,4), (6,5), (6,6);

--ESTUDIANTES 11A
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (7,7), (7,8);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (8,7), (8,8);


--ESTUDIANTES 11B
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (9,9), (9,10), (9,11), (9,12);
INSERT INTO asignaturas_estudiantes (asignatura_id, estudiante_id) VALUES (10,9), (10,10), (10,11), (10,12);