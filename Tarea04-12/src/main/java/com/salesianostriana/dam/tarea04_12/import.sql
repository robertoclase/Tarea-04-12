-- Insertar pacientes
INSERT INTO pacientes (nombre, dni, fecha_nacimiento, telefono, alergias) VALUES ('Laura González', '12345678A', '1985-05-15', '611111111', 'Penicilina');
INSERT INTO pacientes (nombre, dni, fecha_nacimiento, telefono, alergias) VALUES ('Pedro Sánchez', '87654321B', '1990-08-22', '622222222', 'Mariscos');
INSERT INTO pacientes (nombre, dni, fecha_nacimiento, telefono, alergias) VALUES ('Marta Rodríguez', '11223344C', '1978-03-10', '633333333', NULL);
INSERT INTO pacientes (nombre, dni, fecha_nacimiento, telefono, alergias) VALUES ('Sofía López', '55667788D', '2005-12-05', '644444444', 'Polen, Ácaros');
INSERT INTO pacientes (nombre, dni, fecha_nacimiento, telefono, alergias) VALUES ('David Torres', '99887766E', '1995-07-30', '655555555', 'Látex');

-- Insertar citas médicas
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-15 09:00:00', 'Revisión anual', 'COMPLETADA', 1, 1);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-15 10:30:00', 'Dolor en el pecho', 'COMPLETADA', 1, 2);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-16 11:00:00', 'Control rutinario', 'CONFIRMADA', 2, 3);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-17 16:15:00', 'Erupción cutánea', 'PROGRAMADA', 3, 4);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-18 12:00:00', 'Vacunación', 'PROGRAMADA', 2, 5);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-20 08:45:00', 'Segunda opinión', 'CANCELADA', 1, 1);
INSERT INTO citas_medicas (fecha_cita, motivo, estado, doctor_id, paciente_id) VALUES ('2024-02-22 14:30:00', 'Chequeo preoperatorio', 'PROGRAMADA', 1, 3);

UPDATE citas_medicas SET diagnostico = 'Hipertensión controlada, continuar tratamiento', prescripcion = 'Tomar medicación diaria y dieta baja en sal' WHERE id = 1;
UPDATE citas_medicas SET diagnostico = 'Angina de pecho, requiere más estudios', prescripcion = 'Reposo y cita para electrocardiograma' WHERE id = 2;

INSERT INTO doctores (nombre, especialidad, licencia, activo) VALUES ('Dr. Juan Pérez', 'Cardiología', 'LIC12345', true);
INSERT INTO doctores (nombre, especialidad, licencia, activo) VALUES ('Dra. María García', 'Pediatría', 'LIC67890', true);
INSERT INTO doctores (nombre, especialidad, licencia, activo) VALUES ('Dr. Carlos López', 'Dermatología', 'LIC11223', true);
INSERT INTO doctores (nombre, especialidad, licencia, activo) VALUES ('Dra. Ana Martínez', 'Ginecología', 'LIC44556', false);
