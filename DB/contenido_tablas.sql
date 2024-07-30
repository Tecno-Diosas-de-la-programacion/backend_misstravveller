USE misstravveller;
SHOW TABLES;

 SELECT UUID();
 
 /*contenido de tabla VIAJES*/

INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Pueblo mágico de Peña", 1700, "Te invitamos a un día de aventura en Querétaro", 22);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Barroco y sabor", 800, "Adéntrate en la magia de Puebla", 21);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES  
(UUID(), "La ciudad de Plata", 800, "Descubre Taxco, Pueblo Mágico", 13);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES  
(UUID(), "Costa esmeralda y Tecolutla", 2700, "Sol, Playa y Arena", 30);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES  
(UUID(), "Tetotihuacán", 800, "Ciudad donde los hombres se hacen Dioses", 7);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Acapulco", 2700, "Disfruta de las playas de Acapulco", 13);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Museo de Cera", 300, "Explora el Museo de Cera en la Ciudad de México", 7);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Huatulco", 3000, "Descubre las playas y cultura de Huatulco, Oaxaca", 20);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES 
(UUID(), "Mariposa monarca", 900, "Explora el santuario de la Mariposa Monarca en Michoacán", 16);
INSERT INTO  viajes  (id, nombre, precio, descripcion, estados_id) VALUES  
(UUID(), "Festival cervantino", 1500, "Vive la cultura y el arte en el Festival Internacional Cervantino", 12);

/*contenido de tabla ESTADOS*/

INSERT INTO  estados (id, nombre) VALUES 
 (1, "Aguascalientes");
 INSERT INTO  estados (id, nombre) VALUES 
 (2, "Baja California");
 INSERT INTO  estados (id, nombre) VALUES 
 (3, "Baja California Sur");
 INSERT INTO  estados (id, nombre) VALUES 
(4, "Campeche");
 INSERT INTO  estados (id, nombre) VALUES 
 (5, "Chiapas");
 INSERT INTO  estados (id, nombre) VALUES 
 (6, "Chihuahua");
 INSERT INTO  estados (id, nombre) VALUES 
 (7, "Ciudad de México");
 INSERT INTO  estados (id, nombre) VALUES
 (8, "Coahuila");
 INSERT INTO  estados (id, nombre) VALUES 
 (9, "Colima");
 INSERT INTO  estados (id, nombre) VALUES 
 (10, "Durango");
 INSERT INTO  estados (id, nombre) VALUES 
 (11, "Estado de México");
  INSERT INTO  estados (id, nombre) VALUES
 (12, "Guanajuato");
  INSERT INTO  estados (id, nombre) VALUES
 (13, "Guerrero");
 INSERT INTO  estados (id, nombre) VALUES 
 (14, "Hidalgo");
 INSERT INTO  estados (id, nombre) VALUES
 (15, "Jalisco");
 INSERT INTO  estados (id, nombre) VALUES
 (16, "Michoacan");
INSERT INTO  estados (id, nombre) VALUES
 (17, "Morelos");
 INSERT INTO  estados (id, nombre) VALUES
 (18, "Nayarit");
 INSERT INTO  estados (id, nombre) VALUES 
 (19, "Nuevo León");
 INSERT INTO  estados (id, nombre) VALUES 
 (20, "Oaxaca");
 INSERT INTO  estados (id, nombre) VALUES 
 (21, "Puebla");
 INSERT INTO  estados (id, nombre) VALUES 
 (22, "Querétaro");
  INSERT INTO  estados (id, nombre) VALUES 
 (23, "Quintana Roo");
 INSERT INTO  estados (id, nombre) VALUES 
(24, "San Luis Potosí");
 INSERT INTO  estados (id, nombre) VALUES
 (25, "Sinaloa");
  INSERT INTO  estados (id, nombre) VALUES
 (26, "Sonora");
  INSERT INTO  estados (id, nombre) VALUES 
 (27, "Tabasco");
 INSERT INTO  estados (id, nombre) VALUES 
 (28, "Tamaulipas");
 INSERT INTO  estados (id, nombre) VALUES 
 (29, "Tlaxcala");
 INSERT INTO  estados (id, nombre) VALUES 
 (30, "Veracruz");
 INSERT INTO  estados (id, nombre) VALUES 
 (31, "Yucatán");
 INSERT INTO  estados (id, nombre) VALUES 
 (32, "Zacatecas");


/*contenido CLIENTE*/
INSERT INTO cliente (cliente_id, usuario_id) VALUES (
"21e0a8dc-4e17-11ef-b807-b0a460691274","372b4ab4-4e13-11ef-b807-b0a460691274");
INSERT INTO cliente (cliente_id, usuario_id) VALUES (
"21e5124a-4e17-11ef-b807-b0a460691274","372c97a4-4e13-11ef-b807-b0a460691274");
INSERT INTO cliente (cliente_id, usuario_id) VALUES (
"21e627b6-4e17-11ef-b807-b0a460691274","372db4d5-4e13-11ef-b807-b0a460691274");
INSERT INTO cliente (cliente_id, usuario_id) VALUES (
"21e74b14-4e17-11ef-b807-b0a460691274","372ec398-4e13-11ef-b807-b0a460691274");
INSERT INTO cliente (cliente_id, usuario_id) VALUES (
"22153110-4e17-11ef-b807-b0a460691274","372fc0b5-4e13-11ef-b807-b0a460691274");


/*contenido FORMULARIOCONTACTO*/
INSERT INTO formulariocontacto (cliente_id, nombre_completo, correo_electronico, telefono, mensaje) VALUES (
UUID(), "Carmelo Torres Mendoza", "carmelo@example.com", 5050229966, "Hola, quiero informes del viaje a Querétaro");
INSERT INTO formulariocontacto (cliente_id, nombre_completo, correo_electronico, telefono, mensaje) VALUES (
UUID(), "Christian Nodal Hernández","chris@example.com", 2020363698, "Hola, tengo duda del viaje a Puebla");
INSERT INTO formulariocontacto (cliente_id, nombre_completo, correo_electronico, telefono, mensaje) VALUES (
UUID(), "Ericka Martínez Acosta", "ericka@example.com", 1010202030, "Hola, quiero informes del viaje a Veracruz");
INSERT INTO formulariocontacto (cliente_id, nombre_completo, correo_electronico, telefono, mensaje) VALUES (
UUID(), "Hola, quiero informes del viaje a Veracruz", "enrique@example.com", 7070808090, "Hola, quiero informes del viaje a Museo de cera");
INSERT INTO formulariocontacto (cliente_id, nombre_completo, correo_electronico, telefono, mensaje) VALUES (
UUID(), "Fernanda Quintana Herrera", "fer@example.com", 2050603070, "Hola, tengo duda del viaje a Taxco");



/*contenido RESERVACIONES*/
INSERT INTO reservaciones (reservaciones_id, cliente_id, viajes_id) VALUES (
UUID(),"21e0a8dc-4e17-11ef-b807-b0a460691274","ed1594b8-4d5e-11ef-b807-b0a460691274");
INSERT INTO reservaciones (reservaciones_id, cliente_id, viajes_id) VALUES (
UUID(),"21e5124a-4e17-11ef-b807-b0a460691274","056e5877-4d5f-11ef-b807-b0a460691274");
INSERT INTO reservaciones (reservaciones_id, cliente_id, viajes_id) VALUES (
UUID(),"21e627b6-4e17-11ef-b807-b0a460691274","056be1dd-4d5f-11ef-b807-b0a460691274");
INSERT INTO reservaciones (reservaciones_id, cliente_id, viajes_id) VALUES (
UUID(),"21e74b14-4e17-11ef-b807-b0a460691274","056ce79a-4d5f-11ef-b807-b0a460691274");
INSERT INTO reservaciones (reservaciones_id, cliente_id, viajes_id) VALUES (
UUID(),"22153110-4e17-11ef-b807-b0a460691274","056e5877-4d5f-11ef-b807-b0a460691274");


/*contenido ITINERARIO*/
INSERT INTO itinerario (destino, punto_reunion, fecha, hora_salida, hora_llegada, hora_regreso, viajes_id) VALUES (
"Querétaro", "Metro Revolución", "24-12-12","07:00:00","10:00:00","6:00:00", "ed1594b8-4d5e-11ef-b807-b0a460691274");
INSERT INTO itinerario (destino, punto_reunion, fecha, hora_salida, hora_llegada, hora_regreso, viajes_id) VALUES (
"Puebla", "Centro Histórico", "24-12-13", "07:00:00","10:00:00","6:00:00", "056793c6-4d5f-11ef-b807-b0a460691274");
INSERT INTO itinerario (destino, punto_reunion, fecha, hora_salida, hora_llegada, hora_regreso, viajes_id) VALUES (
"Veracruz", "Metro Revolución", "24-12-14", "07:00:00","10:00:00","6:00:00", "056ce79a-4d5f-11ef-b807-b0a460691274");
INSERT INTO itinerario (destino, punto_reunion, fecha, hora_salida, hora_llegada, hora_regreso, viajes_id) VALUES (
"Tehotihuacán", "Metro Revolución", "24-12-15", "07:00:00","10:00:00","6:00:00", "056e5877-4d5f-11ef-b807-b0a460691274");
INSERT INTO itinerario (destino, punto_reunion, fecha, hora_salida, hora_llegada, hora_regreso, viajes_id) VALUES (
"Oaxaca", "Metro Revolución", "24-12-16", "07:00:00","10:00:00","6:00:00", "16980343-4d5f-11ef-b807-b0a460691274");


/*contenido USUARIO*/
INSERT INTO usuario (usuario_id, nombre, apellido_paterno, apellido_materno, correo_electronico, contraseña) VALUES(
UUID(), "Paulina", "Carranza", "Gomez", "paulita52@gmail.com", "P0bhsvg6%j");
INSERT INTO usuario (usuario_id, nombre, apellido_paterno, apellido_materno, correo_electronico, contraseña) VALUES(
UUID(), "Leonardo", "Vazquez", "Duarte", "leovazquez@gmail.com", "85K5vcgl/y");
INSERT INTO usuario (usuario_id, nombre, apellido_paterno, apellido_materno, correo_electronico, contraseña) VALUES(
UUID(), "Sara", "Lara", "Vega", "saralaravega@gmail.com", "6Ybnjk1!gd");
INSERT INTO usuario (usuario_id, nombre, apellido_paterno, apellido_materno, correo_electronico, contraseña) VALUES(
UUID(), "Raul", "Alvarez", "Baez", "raulab@gmail.com", "5Drhk%ju4l");
INSERT INTO usuario (usuario_id, nombre, apellido_paterno, apellido_materno, correo_electronico, contraseña) VALUES(
UUID(), "Adrian", "Correa", "Valle", "adriancova@gmail.com", "28&Jyfsl5o");


/*contenido ADMINISTRADOR*/
INSERT INTO administrador (administrador_id, usuario_id) VALUES (
UUID(), "372b4ab4-4e13-11ef-b807-b0a460691274");
INSERT INTO administrador (administrador_id, usuario_id) VALUES (
UUID(), "372c97a4-4e13-11ef-b807-b0a460691274");
INSERT INTO administrador (administrador_id, usuario_id) VALUES (
UUID(), "372db4d5-4e13-11ef-b807-b0a460691274");
INSERT INTO administrador (administrador_id, usuario_id) VALUES (
UUID(), "372ec398-4e13-11ef-b807-b0a460691274");
INSERT INTO administrador (administrador_id, usuario_id) VALUES (
UUID(), "372fc0b5-4e13-11ef-b807-b0a460691274");

