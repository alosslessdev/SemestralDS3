CREATE TABLE Usuarios (
    IDUsuario INT PRIMARY KEY IDENTITY(1,1),
    NombreUsuario VARCHAR(50) UNIQUE NOT NULL,
    Contraseña VARCHAR(255) NOT NULL,
    IntentosLogin INT DEFAULT 0,
    EstaBloqueado BIT DEFAULT 0
);

-- Trigger
CREATE TRIGGER tr_IntentoLogin
ON Usuarios
AFTER UPDATE
AS
BEGIN
    IF UPDATE(IntentosLogin)
    BEGIN
        UPDATE Usuarios
        SET EstaBloqueado = CASE 
            WHEN IntentosLogin >= 3 THEN 1 
            ELSE 0 
        END
        WHERE IDUsuario IN (SELECT IDUsuario FROM inserted);
    END
END;

-- Procedimiento para intentar login
CREATE PROCEDURE sp_IntentarLogin
    @NombreUsuario VARCHAR(50),
    @Contraseña VARCHAR(255),
    @Resultado INT OUTPUT
AS
BEGIN
    DECLARE @IDUsuario INT, @EstaBloqueado BIT, @ContraseñaCorrecta VARCHAR(255);

    SELECT @IDUsuario = IDUsuario, @EstaBloqueado = EstaBloqueado, @ContraseñaCorrecta = Contraseña
    FROM Usuarios
    WHERE NombreUsuario = @NombreUsuario;

    IF @IDUsuario IS NULL
    BEGIN
        SET @Resultado = 0; -- Usuario no encontrado
        RETURN;
    END

    IF @EstaBloqueado = 1
    BEGIN
        SET @Resultado = -1; -- Cuenta bloqueada
        RETURN;
    END

    IF @Contraseña = @ContraseñaCorrecta
    BEGIN
        SET @Resultado = 1; -- Login exitoso
        UPDATE Usuarios SET IntentosLogin = 0 WHERE IDUsuario = @IDUsuario;
    END
    ELSE
    BEGIN
        UPDATE Usuarios SET IntentosLogin = IntentosLogin + 1 WHERE IDUsuario = @IDUsuario;
        SET @Resultado = -2; -- Contraseña incorrecta
    END
END;

-- Procedimiento para resetear intentos (modificado)
CREATE PROCEDURE sp_ResetearIntentosLogin
    @NombreUsuario VARCHAR(50),
    @Resultado INT OUTPUT,
AS
BEGIN
    IF EXISTS (SELECT 1 FROM Usuarios WHERE NombreUsuario = @NombreUsuario)
    BEGIN
        UPDATE Usuarios
        SET IntentosLogin = 0, EstaBloqueado = 0
        WHERE NombreUsuario = @NombreUsuario;

        SET @Resultado = 1;
        PRINT 'Intentos de login reseteados para el usuario: ' + @NombreUsuario;
    END
    ELSE
    BEGIN
        SET @Resultado = 0;
        PRINT 'Usuario no encontrado';
    END
END;

-- Procedimiento para agregar un nuevo usuario (modificado)
CREATE PROCEDURE sp_AgregarUsuario
    @NombreUsuario VARCHAR(50),
    @Contraseña VARCHAR(255),
    @Resultado INT OUTPUT

AS
BEGIN
    IF NOT EXISTS (SELECT 1 FROM Usuarios WHERE NombreUsuario = @NombreUsuario)
    BEGIN
        INSERT INTO Usuarios (NombreUsuario, Contraseña)
        VALUES (@NombreUsuario, @Contraseña);

        SET @Resultado = 1;
        PRINT 'Usuario agregado exitosamente';
    END
    ELSE
    BEGIN
        SET @Resultado = 0;
        PRINT 'El nombre de usuario ya existe';
    END
END;