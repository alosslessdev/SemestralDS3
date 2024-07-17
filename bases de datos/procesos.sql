Información de clientes y sus planes:
--Listar todos los clientes y sus planes actuales
SELECT c.ID_cliente, c.Nombre, c.Apellido, p.Nombre_Plan, p.Costo, co.Fecha_Inicio
FROM Clientes c
JOIN Contratos co ON c.ID_cliente = co.ID_Cliente
JOIN Planes p ON co.ID_Plan = p.ID_Plan
ORDER BY c.ID_cliente;
--Buscar clientes por nombre, apellido o ID personal:
CREATE PROCEDURE BuscarCliente
    @busqueda VARCHAR(50)
AS
BEGIN
    SELECT ID_cliente, Nombre, Apellido, ID_Personal
    FROM Clientes
    WHERE Nombre LIKE '%' + @busqueda + '%'
       OR Apellido LIKE '%' + @busqueda + '%'
       OR ID_Personal LIKE '%' + @busqueda + '%'
END
-- EJEMPLO DE COMO USARLO
EXEC BuscarCliente @busqueda = 'Andrew';

--para filtrar clientes por plan 
CREATE PROCEDURE FiltrarClientesPorPlan
    @NombrePlan VARCHAR(20) = NULL
AS
BEGIN
    SELECT 
        c.ID_cliente,
        c.Nombre,
        c.Apellido,
        c.ID_Personal,
        p.Nombre_Plan,
        p.Costo,
        co.Fecha_Inicio
    FROM 
        Clientes c
    JOIN Contratos co ON c.ID_cliente = co.ID_Cliente
    JOIN Planes p ON co.ID_Plan = p.ID_Plan
    WHERE 
        @NombrePlan IS NULL OR p.Nombre_Plan = @NombrePlan
    ORDER BY 
        CASE WHEN @NombrePlan IS NULL THEN p.Nombre_Plan ELSE c.Apellido END,
        c.Nombre
END
--ver todos los clientes con sus planes
EXEC FiltrarClientesPorPlan

--para filtrar clientes por un plan especifico
EXEC FiltrarClientesPorPlan @NombrePlan = 'Básico'

Información sobre pagos:
--ver el historial de pagos de un cliente específico
CREATE PROCEDURE HistorialPagosCliente
    @ID_Cliente INT
AS
BEGIN
    SELECT 
        c.ID_cliente,
        c.Nombre,
        c.Apellido,
        co.ID_Contrato,
        p.ID_Pago,
        p.Fecha_Pago,
        p.Monto,
        pl.Nombre_Plan
    FROM 
        Clientes c
    JOIN Contratos co ON c.ID_cliente = co.ID_Cliente
    JOIN Pagos p ON co.ID_Contrato = p.ID_Contrato
    JOIN Planes pl ON co.ID_Plan = pl.ID_Plan
    WHERE 
        c.ID_cliente = @ID_Cliente
    ORDER BY 
        p.Fecha_Pago DESC
END
-- como usar
EXEC HistorialPagosCliente @ID_Cliente = 1;

 CREATE PROCEDURE ClientesConPagosAtrasados
AS
BEGIN
    DECLARE @FechaActual DATE = GETDATE();
    DECLARE @FechaLimite DATE = DATEADD(MONTH, -1, @FechaActual);

    SELECT DISTINCT
        c.ID_cliente,
        c.Nombre,
        c.Apellido,
        co.ID_Contrato,
        pl.Nombre_Plan,
        MAX(p.Fecha_Pago) AS UltimoPago
    FROM 
        Clientes c
    JOIN Contratos co ON c.ID_cliente = co.ID_Cliente
    JOIN Planes pl ON co.ID_Plan = pl.ID_Plan
    LEFT JOIN Pagos p ON co.ID_Contrato = p.ID_Contrato
    GROUP BY
        c.ID_cliente, c.Nombre, c.Apellido, co.ID_Contrato, pl.Nombre_Plan
    HAVING
        MAX(p.Fecha_Pago) IS NULL OR MAX(p.Fecha_Pago) < @FechaLimite
    ORDER BY
        MAX(p.Fecha_Pago)
END  --como usar 
EXEC ClientesConPagosAtrasados
Programas médicos:
--Listar de programas disponibles
 CREATE PROCEDURE ListarProgramasDisponibles
AS
BEGIN
    SELECT 
        ID_Programa,
        Nombre_Programa,
        Duracion,
        Ano_Inicio,
        Edad_Recomendada,
        CASE 
            WHEN Genero = 'TE' THEN 'Telemedicina'
            WHEN Genero = 'CO' THEN 'Comercial'
            WHEN Genero = 'PR' THEN 'Presencial'
            ELSE 'Desconocido'
        END AS Tipo_Programa
    FROM 
        Programas
    ORDER BY 
        Nombre_Programa
END 
--como usar 
EXEC ListarProgramasDisponibles

--filtrar programas por genero
 CREATE PROCEDURE FiltrarProgramasPorGenero
    @Genero CHAR(2)
AS
BEGIN
    IF @Genero NOT IN ('TE', 'CO', 'PR')
    BEGIN
        RAISERROR('Género no válido. Use TE, CO o PR.', 16, 1)
        RETURN
    END

    SELECT 
        ID_Programa,
        Nombre_Programa,
        Duracion,
        Ano_Inicio,
        Edad_Recomendada,
        CASE 
            WHEN Genero = 'TE' THEN 'Telemedicina'
            WHEN Genero = 'CO' THEN 'Comercial'
            WHEN Genero = 'PR' THEN 'Presencial'
        END AS Tipo_Programa
    FROM 
        Programas
    WHERE 
        Genero = @Genero
    ORDER BY 
        Nombre_Programa
END 
--como usar
EXEC FiltrarProgramasPorGenero @Genero = 'TE'

--buscar programas por edad 
 CREATE PROCEDURE BuscarProgramasPorEdad
    @EdadRecomendada VARCHAR(20)
AS
BEGIN
    IF @EdadRecomendada NOT IN ('menores de 10', '11 a 17', 'mayores de 18')
    BEGIN
        RAISERROR('Edad recomendada no válida. Use "menores de 10", "11 a 17" o "mayores de 18".', 16, 1)
        RETURN
    END

    SELECT 
        ID_Programa,
        Nombre_Programa,
        Duracion,
        Ano_Inicio,
        Edad_Recomendada,
        CASE 
            WHEN Genero = 'TE' THEN 'Telemedicina'
            WHEN Genero = 'CO' THEN 'Comercial'
            WHEN Genero = 'PR' THEN 'Presencial'
        END AS Tipo_Programa
    FROM 
        Programas
    WHERE 
        Edad_Recomendada = @EdadRecomendada
    ORDER BY 
        Nombre_Programa
	END 
	--como usarlo
	EXEC BuscarProgramasPorEdad @EdadRecomendada = '11 a 17'

Citas:
--ver todas las citas programadas para un cliente 
 CREATE PROCEDURE CitasClienteEspecif
    @ID_Cliente INT
AS
BEGIN
    SELECT 
        c.ID_Cita,
        cl.Nombre AS NombreCliente,
        cl.Apellido AS ApellidoCliente,
        p.Nombre_Programa,
        c.Numero_Consulta,
        c.Duracion,
        c.Descripcion,
        c.Fecha_Cita,
        d.Nombre AS NombreDoctor
    FROM 
        Citas c
    JOIN Clientes cl ON c.ID_Cliente = cl.ID_cliente
    JOIN Programas p ON c.ID_Programa = p.ID_Programa
    LEFT JOIN Doctores d ON c.ID_Doctor = d.ID_Doctor
    WHERE 
        c.ID_Cliente = @ID_Cliente
    ORDER BY 
        c.Fecha_Cita ASC
END 
--como usar
EXEC CitasClienteEspecif @ID_Cliente = 1

--Listar citas por fecha o rango de fecha
 CREATE PROCEDURE CitasPorRango
    @FechaInicio DATE,
    @FechaFin DATE = NULL
AS
BEGIN
    IF @FechaFin IS NULL
        SET @FechaFin = @FechaInicio

    SELECT 
        c.ID_Cita,
        cl.Nombre AS NombreCliente,
        cl.Apellido AS ApellidoCliente,
        p.Nombre_Programa,
        c.Numero_Consulta,
        c.Duracion,
        c.Descripcion,
        c.Fecha_Cita,
        d.Nombre AS NombreDoctor
    FROM 
        Citas c
    JOIN Clientes cl ON c.ID_Cliente = cl.ID_cliente
    JOIN Programas p ON c.ID_Programa = p.ID_Programa
    LEFT JOIN Doctores d ON c.ID_Doctor = d.ID_Doctor
    WHERE 
        c.Fecha_Cita BETWEEN @FechaInicio AND @FechaFin
    ORDER BY 
        c.Fecha_Cita ASC
END 
--maneras de usarlo 
--para un día específico
EXEC CitasPorRango @FechaInicio = '2021-07-01'

--para un rango de fechas
EXEC CitasPorRango @FechaInicio = '2021-07-21', @FechaFin = '2023-07-31'
