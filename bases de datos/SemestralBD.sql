Create database SemestralBD
go
Use SemestralBD
go

Create Table Clientes(
ID_cliente Int Primary key IDENTITY(1,1),--codigo generado automaticamente
Nombre Varchar(50),
Apellido Varchar(50),
ID_Personal Varchar(20),
Num_Tarjeta Varchar(16),
Tipo_Tarjeta Char(2) check (Tipo_Tarjeta IN ('DB', 'CR'))--Tarjetas de Debito o Credito
);

Create Table Planes(
ID_Plan Int Primary key IDENTITY(1,1),-- codigo generado automaticamente
Nombre_Plan Varchar(20),
Costo Money, --Valor monetario
);

Create Table Contratos(
ID_Contrato Int Primary key IDENTITY(1,1),--codigo generado automaticamente
ID_Cliente Int,
ID_Plan Int,
Fecha_Inicio DATE check (Fecha_Inicio Between '1997-08-29' AND GETDATE()),--Fehca entre 1997-08-29 y hoy
Foreign key (ID_Cliente) references Clientes (ID_Cliente),
Foreign key (ID_Plan) references Planes (ID_Plan)
);

Create Table Pagos(
ID_Pago Int Primary key IDENTITY(1,1),
ID_Contrato Int,
Fecha_Pago Date,
Monto Money,
Foreign key (ID_Contrato) references Contratos (ID_Contrato)
);

Create Table Programas(
ID_Programa Int Primary key IDENTITY(1000,1),
Nombre_Programa Varchar(50),
Duracion Int check (Duracion Between 30 and 300),
Ano_Inicio Int,
Edad_Recomendada Varchar(20) check (Edad_Recomendada in ('menores de 10', '11 a 17', 'mayores de 18')),
Genero Char(3) check (Genero in ('TE', 'CO', 'PR'))
);

Create Table Doctores(
ID_Doctor Int Primary key IDENTITY(1,1),
Nombre Varchar(50),
Descripcion TEXT,
Imagen Varchar(255)
);

Create Table Citas (
ID_Cita Int Primary key IDENTITY(1,1),
ID_Cliente Int,
ID_Programa Int,
Numero_Consulta Int check (Numero_Consulta Between 1 and 350),
Duracion Int check (Duracion Between 15 and 90),
Descripcion TEXT,
Fecha_Cita Date,
Foreign key (ID_Cliente) References Clientes(ID_Cliente),
Foreign key (ID_Programa) References Programas(ID_Programa)
);
ALTER TABLE Citas
ADD ID_Doctor INT;
ALTER TABLE Citas
ADD CONSTRAINT FK_Citas_ID_Doctor FOREIGN KEY (ID_Doctor) REFERENCES Doctores(ID_Doctor);
go

SET IDENTITY_INSERT Clientes ON;
INSERT INTO Clientes (ID_cliente,Nombre, Apellido, ID_Personal, Num_Tarjeta, Tipo_Tarjeta)--inserta tabla cleintes 
VALUES
(1,'Nancy', 'Davolio', '8-888-8888', '5001-6254-987', 'CR'),
(2,'Andrew', 'Fuller', '7-777-7777', '5001-6667-987', 'CR'),
(3,'Janet', 'Leverling', '5-555-5555', '5000-6254-987', 'DB'),
(4,'Margaret', 'Peacock', '3-333-3333', '5011-6333-987', 'CR'),
(5,'Steven', 'Buchanan', '2-222-2222', '5002-6254-987', 'CR'),
(6,'Michael', 'Suyama', 'PE-111-1111', '5001-6254-987', 'CR'),
(7,'Robert', 'King', 'N-11-111', '5033-6254-988', 'CR'),
(8,'Laura', 'Callahan', 'EE-777-777', '5091-6254-999', 'CR'),
(9,'Anne', 'Dodsworth', '8-555-55', '5001-6254-988', 'CR');
SET IDENTITY_INSERT Clientes OFF;

SET IDENTITY_INSERT Planes ON;--se lo puedes quitar solo le quitas el ID_Plan y los id

INSERT INTO Planes (ID_Plan, Nombre_Plan, Costo)--insertar tabla planes 
VALUES
(1, 'Básico', 9.00),
(2, 'Estándar', 14.00),
(3, 'Ultra', 16.00);

SET IDENTITY_INSERT Planes OFF;

SET IDENTITY_INSERT Contratos ON;
INSERT INTO Contratos (ID_Contrato, ID_Cliente, ID_Plan, Fecha_Inicio)--insertar tabla contrato
VALUES
(69584714, 1, 1, '1997-11-23'),
(65858745, 2, 2, '2010-11-24'),
(65552525, 1, 3, '2010-11-24'),
(67777777, 7, 1, '2011-12-12'),
(63216547, 4, 2, '2015-01-21'),
(69141111, 5, 3, '1998-05-15'),
(69321111, 5, 1, '2016-08-30'),
(68281245, 8, 2, '2017-05-12'),
(66982232, 9, 3, '2017-12-25'),
(66772395, 3, 1, '2018-02-05'),
(67275689, 6, 2, '2018-12-31'),
(69873625, 1, 3, '2019-03-30');
SET IDENTITY_INSERT Contratos OFF;


INSERT INTO Pagos (ID_Contrato, Fecha_Pago, Monto)--inserta tabla informacionDePago
VALUES
(69584714, '2021-07-23', 9.00),
(65858745, '2021-07-24', 14.00),
(65552525, '2021-07-24', 16.00),
(67777777, '2021-07-12', 9.00),
(63216547, '2021-07-21', 14.00),
(69141111, '2021-06-15', 16.00),
(69321111, '2021-06-30', 9.00),
(68281245, '2021-07-12', 14.00),
(66982232, '2021-06-25', 16.00),
(66772395, '2020-02-05', 9.00),
(67275689, '2021-06-30', 14.00),
(69873625, '2021-05-30', 16.00),
(69584714, '2021-07-25', 9.00),
(65858745, '2021-06-18', 14.00);

SET IDENTITY_INSERT Programas On;
INSERT INTO Programas (ID_Programa, Nombre_Programa, Duracion, Ano_Inicio, Edad_Recomendada, Genero)--inserta programa 
VALUES
(1000, 'comercial', 230, 1990, 'mayores de 18', 'CO'),
(1001, 'presencial', 120, 2005, 'mayores de 18', 'PR'),
(1002, 'telemedicina', 100, 2012, 'menores de 10', 'TE'),
(1003, 'telemedicina', 90, 2015, 'menores de 10', 'TE'),
(1004, 'telemedicina', 120, 2008, '11 a 17', 'TE'),
(1005, 'comercial', 135, 1998, 'mayores de 18', 'CO'),
(1006, 'presencial', 150, 2000, '11 a 17', 'PR'),
(1007, 'comercial', 175, 2003, '11 a 17', 'CO'),
(1008, 'telemedicina', 120, 2010, 'mayores de 18', 'TE'),
(1009, 'telemedicina', 90, 2009, 'menores de 10', 'TE'),
(1010, 'comercial', 160, 2004, '11 a 17', 'CO'),
(1011, 'comercial', 75, 2007, '11 a 17', 'CO'),
(1012, 'presencial', 175, 2013, '11 a 17', 'PR'),
(1013, 'presencial', 120, 2011, 'mayores de 18', 'PR'),
(1014, 'presencial', 120, 2014, '11 a 17', 'PR'),
(1015, 'comercial', 125, 2016, '11 a 17', 'CO'),
(1016, 'telemedicina', 200, 2017, '11 a 17', 'TE'),
(1017, 'telemedicina', 100, 2018, 'menores de 10', 'TE'),
(1018, 'comercial', 90, 2019, '11 a 17', 'CO'),
(1019, 'presencial', 65, 2020, 'mayores de 18', 'PR'),
(1020, 'presencial', 125, 2021, 'mayores de 18', 'PR'),
(1021, 'presencial', 87, 2022, 'menores de 10', 'PR'),
(1022, 'comercial', 95, 2023, 'menores de 10', 'CO'),
(1023, 'comercial', 90, 2024, 'menores de 10', 'CO');
SET IDENTITY_INSERT Programas OFF;


INSERT INTO Citas (ID_Cliente, ID_Programa, Numero_Consulta, Duracion, Descripcion, Fecha_Cita)--inserta tablas sitas 
VALUES
(1, 1000, 1, 90, 'Primera consulta', '2021-07-01'),
(2, 1001, 1, 90, 'Consulta de seguimiento', '2021-07-02'),
(3, 1002, 1, 90, 'Consulta inicial', '2021-07-03'),
(4, 1003, 1, 90, 'Consulta de control', '2021-07-04'),
(5, 1004, 1, 90, 'Consulta de rutina', '2021-07-05'),
(6, 1005, 1, 90, 'Consulta urgente', '2021-07-06'),
(7, 1006, 1, 90, 'Consulta preventiva', '2021-07-07'),
(8, 1007, 1, 90, 'Consulta especializada', '2021-07-08'),
(9, 1008, 1, 90, 'Consulta a distancia', '2021-07-09'),
(1, 1009, 1, 90, 'Consulta telefónica', '2021-07-10'),
(1, 1010, 8, 90, 'Consulta adicional', '2021-07-11'),
(2, 1011, 5, 75, 'Consulta programada', '2021-07-12'),
(3, 1012, 7, 90, 'Consulta urgente', '2021-07-13'),
(4, 1013, 4, 90, 'Consulta de seguimiento', '2021-07-14'),
(5, 1014, 6, 90, 'Consulta rutinaria', '2021-07-15'),
(6, 1015, 1, 90, 'Consulta inicial', '2021-07-16'),
(7, 1016, 1, 90, 'Consulta de control', '2021-07-17'),
(8, 1017, 1, 90, 'Consulta preventiva', '2021-07-18'),
(9, 1018, 1, 90, 'Consulta especializada', '2021-07-19'),
(1, 1019, 1, 65, 'Consulta a distancia', '2021-07-20'),
(1, 1020, 1, 90, 'Consulta telefónica', '2021-07-21'),
(2, 1021, 1, 87, 'Consulta adicional', '2021-07-22'),
(3, 1022, 1, 90, 'Consulta programada', '2021-07-23'),
(4, 1023, 1, 90, 'Consulta urgente', '2021-07-24');
go

--3
-- Suelte el disparador anterior si existe
IF EXISTS (SELECT * FROM sys.triggers WHERE name = 't_paz_y_salvo')
    DROP TRIGGER t_paz_y_salvo;
GO
-- Crea el nuevo trigger
CREATE TRIGGER t_paz_y_salvo
ON Programas
INSTEAD OF INSERT
AS
BEGIN
    DECLARE @ID_Cliente INT;
    DECLARE @Paz_Y_Salvo BIT;
    -- Compruebe si hay alguna fila insertada
    IF EXISTS (SELECT 1 FROM inserted)
    BEGIN
        -- Recuperar el ID_Cliente de las filas insertadas
        SELECT @ID_Cliente = @ID_Cliente
        FROM inserted;
        -- Compruebe si la cliente está en buen estado (paz y salvo)
        SELECT @Paz_Y_Salvo = CASE 
                                WHEN EXISTS (
                                    SELECT 1
                                    FROM Contratos c
                                    INNER JOIN Pagos p ON c.ID_Contrato = p.ID_Contrato
                                    WHERE c.ID_Cliente = @ID_Cliente
                                ) THEN 1
                                ELSE 0
                              END;
        -- Si no paz y salvo, rechaza el inserto.
        IF @Paz_Y_Salvo = 0
        BEGIN
            RAISERROR ('Su servicio está suspendido por morosidad', 16, 1);
            ROLLBACK TRANSACTION;
            RETURN;
        END;
    END;
    -- Insertar permitida si la verificación de paz y salvo pasó
    INSERT INTO Programas (Nombre_Programa, Duracion, Ano_Inicio, Edad_Recomendada, Genero)
    SELECT Nombre_Programa, Duracion, Ano_Inicio, Edad_Recomendada, Genero
    FROM inserted;
END;
GO


--4
-- Dejar el procedimiento si existe
IF EXISTS (SELECT * FROM sys.procedures WHERE name = 'sp_make_payment')
    DROP PROCEDURE sp_make_payment;
GO
-- Crear el procedimiento almacenado para la validación de informacionDePago.
CREATE PROCEDURE sp_make_payment
    @ID_Contrato INT,
    @Monto Money
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @ID_Plan INT;
    DECLARE @Costo_Plan Money;

    -- Recuperar el Plano y Costo correspondiente al Contrato
    SELECT @ID_Plan = c.ID_Plan, @Costo_Plan = p.Costo
    FROM Contratos c
    INNER JOIN Planes p ON c.ID_Plan = p.ID_Plan
    WHERE c.ID_Contrato = @ID_Contrato;
    -- Compruebe si el ID del plan coincide
    IF @ID_Plan IS NULL
    BEGIN
        RAISERROR ('El cliente no tiene ese plan contratado.', 16, 1);
        RETURN;
    END;
    -- Verifique si el monto pagado coincide con el costo del plan
    IF @Monto <> @Costo_Plan
    BEGIN
        RAISERROR ('El monto pagado no corresponde al costo del plan.', 16, 1);
        RETURN;
    END;
    -- Si pasan las validaciones, proceder con el pago (acción simulada)
    INSERT INTO Pagos (ID_Contrato, Fecha_Pago, Monto)
    VALUES (@ID_Contrato, GETDATE(), @Monto);

    PRINT 'Pago realizado exitosamente.';
END;
GO
--5
-- Ver para informacionDePlanes por género
CREATE VIEW V_genero AS
SELECT *
FROM Programas
WHERE Genero IN ('TE', 'CO', 'PRE');
go
-- Ver para informacionDePlanes por edad
CREATE VIEW V_edad AS
SELECT *
FROM Programas
WHERE Edad_Recomendada IN ('menores de 10', '11 a 17', 'mayores de 18');
go
-- Crear o modificar la vista para informacionDePlanes por médico.
CREATE OR ALTER VIEW V_doctor AS
SELECT p.*, d.Nombre AS Doctor_Nombre
FROM Programas p
JOIN Citas c ON p.ID_Programa = c.ID_Programa
JOIN Doctores d ON c.ID_Doctor = d.ID_Doctor;
go
--6
CREATE PROCEDURE p_busqueda
    @tipo_busqueda INT
AS
BEGIN
    IF @tipo_busqueda = 1
    BEGIN
        SELECT * FROM V_genero;
    END
    ELSE IF @tipo_busqueda = 2
    BEGIN
        SELECT * FROM V_edad;
    END
    ELSE IF @tipo_busqueda = 3
    BEGIN
        SELECT * FROM V_doctor;
    END
    ELSE
    BEGIN
        RAISERROR('Tipo de búsqueda no válido', 16, 1);
    END
END;
go
--7	Cuando un cliente solicita un nuevo plan
CREATE PROCEDURE p_validar_cliente--creacion del proceso para validar 
    @nombre VARCHAR(50),--nombre del cliente 
    @apellido VARCHAR(50),--apellido del cliente
    @id_personal VARCHAR(20)--cedula o id del cliente
AS
BEGIN
    BEGIN TRY
        DECLARE @ID_cliente INT;--variable para almacenar el id o cedula 

        --verifica si el clinete existe 
        SELECT @ID_cliente = ID_cliente 
        FROM Clientes 
        WHERE Nombre = @nombre AND Apellido = @apellido AND ID_Personal = @id_personal;

        IF @ID_cliente IS NOT NULL --verifica si tiene valores la variable
        BEGIN
            -- si existe imprime su codico 
            PRINT 'El cliente ya existe. Código del cliente: ' + CAST(@ID_cliente AS VARCHAR);
        END
        ELSE
        BEGIN--si no existe lo
            -- insertar nuevo cliente
            INSERT INTO Clientes (Nombre, Apellido, ID_Personal)--se ingresa un nuevo cliente con los datos ingresados 
            VALUES (@nombre, @apellido, @id_personal);

            -- se optiene el ID del cliente 
        SELECT @ID_cliente = SCOPE_IDENTITY();
        PRINT 'Nuevo cliente registrado. Código del cliente: ' + CAST(@ID_cliente AS VARCHAR);--imprime el codigo del nuevo cliente
        END
    END TRY
    BEGIN CATCH
        -- manejo de errores punto#10
        PRINT 'Ocurrió un error: ' + ERROR_MESSAGE();
    END CATCH
END;

--8 definir las preferencias de un cliente particular
CREATE PROCEDURE p_preferencia_cliente-- crea el procedimineto Id del cliente
    @ID_cliente INT
AS
BEGIN
    BEGIN TRY
        DECLARE @genero_preferido CHAR(3);--variable para almacenar el genero preferido 

        -- determinar genero preferido
        SELECT TOP 1 @genero_preferido = Genero
        FROM Citas c
        JOIN Programas p ON c.ID_Programa = p.ID_Programa
        WHERE c.ID_Cliente = @ID_cliente
        GROUP BY Genero
		HAVING COUNT(*) >= 3 --debe tener al menos 3 citas del mismo género
        ORDER BY COUNT(*) DESC;-- ordenar por el género más frecuente

        IF @genero_preferido IS NOT NULL
        BEGIN
            -- listar todos los programas del genero preferido
            SELECT * 
            FROM Programas
            WHERE Genero = @genero_preferido;
        END
        ELSE
        BEGIN--si no encuentra el genero preferido
            PRINT 'El cliente no tiene preferencias definidas.';
        END
    END TRY
    BEGIN CATCH
        -- manejo de errores punto#10
        PRINT 'Ocurrió un error: ' + ERROR_MESSAGE();
    END CATCH
END;
--9 para saber cuales son los generos mas reservados 
DECLARE c_cuenta_genero CURSOR FOR--declara el cursor
SELECT Genero, COUNT(*) AS Total
FROM Programas
GROUP BY Genero;

DECLARE @Genero CHAR(3);
DECLARE @Total INT;

BEGIN TRY
    -- abre el cursor 
    OPEN c_cuenta_genero;

    -- obtene los datos de la primra fila 
    FETCH NEXT FROM c_cuenta_genero INTO @Genero, @Total;

    -- recorrer el cursor si hay filas para procesar
    WHILE @@FETCH_STATUS = 0
    BEGIN--imprime el genero y el total de programas
        PRINT 'Género: ' + @Genero + ', Total: ' + CAST(@Total AS VARCHAR);
        FETCH NEXT FROM c_cuenta_genero INTO @Genero, @Total; -- obtener la siguiente fila
    END;

    -- Cerrar cursor
    CLOSE c_cuenta_genero;
    DEALLOCATE c_cuenta_genero;-- liberar los recursos del cursor creo
END TRY
BEGIN CATCH
    -- manejo de errores punto#10
    IF CURSOR_STATUS('global', 'c_cuenta_genero') >= 0
    BEGIN
        CLOSE c_cuenta_genero; --cierra el cursor si está abierto.
        DEALLOCATE c_cuenta_genero;--libera los recursos del cursor si aún no han sido liberados.
    END
END CATCH;
