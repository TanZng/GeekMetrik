CREATE DATABASE IF NOT EXISTS GeekMetrik DEFAULT CHARACTER SET UTF8MB4;
USE GeekMetrik;

-- -----------------------------------------------------
-- Tabla Usuarios
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Usuario (
  Nombre CHAR(15) NOT NULL,
  ApellidoP CHAR(15) NULL,
  ApellidoM CHAR(15) NULL,
  Correo CHAR(50) NOT NULL,
  ImagenPerfil LONGBLOB NULL,
  Contra CHAR(50) NOT NULL,
  Username CHAR(50) NOT NULL PRIMARY KEY,
  TipoUsuario NUMERIC(1) NOT NULL);

-- -----------------------------------------------------
-- Tabla Geeks
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Geek (
  EstrellasTotales INT NULL,
  Biografia VARCHAR(500) NULL,
  Username CHAR(50) NOT NULL PRIMARY KEY,
  CONSTRAINT Username
    FOREIGN KEY (Username)
    REFERENCES GeekMetrik.Usuario (Username)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Tabla Admin
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Admin (
  Alias CHAR(50) NOT NULL PRIMARY KEY,
  Rol ENUM('Editor', 'Moderador', 'Community Manager', 'Super admin') NOT NULL,
  CONSTRAINT Alias
    FOREIGN KEY (Alias)
    REFERENCES GeekMetrik.Usuario (Username)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Tabla Videojuegos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Videojuego (
  ID_Videojuego INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Titulo CHAR(50) NOT NULL,
  Estrellas DOUBLE NULL,
  Descripción VARCHAR(500) NOT NULL,
  Genero VARCHAR(50) NOT NULL,
  Alias_Admin CHAR(50),
  Imagen LONGBLOB NULL,
  Destacado TINYINT NULL,
  CONSTRAINT Alias_Admin
    FOREIGN KEY (Alias_Admin)
    REFERENCES GeekMetrik.Admin (Alias)
    ON DELETE SET NULL
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Tabla códigos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Codigo (
  Código CHAR(30) NOT NULL,
  Username_Geek CHAR(50) NOT NULL,
  FechaExpiración DATE NOT NULL,
  ID_Videojuego INT NOT NULL PRIMARY KEY,
  Uso TINYINT NOT NULL,
  CONSTRAINT Username_Geek
    FOREIGN KEY (Username_Geek)
    REFERENCES GeekMetrik.Geek (Username)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT ID_Videojuego
    FOREIGN KEY (ID_Videojuego)
    REFERENCES GeekMetrik.Videojuego (ID_Videojuego)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Tabla Red Social
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.RedSocial (
  Nombre CHAR(30) NOT NULL,
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  URL CHAR(250) NOT NULL,
  Logo LONGBLOB NOT NULL);

-- -----------------------------------------------------
-- Tabla Reseñas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS GeekMetrik.Reseñas (
    ID_Reseña INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ID_Vid INT NOT NULL,
    UsernameGeek INT NOT NULL,
    Titulo CHAR(30) NOT NULL,
    Reseña VARCHAR(500) NOT NULL,
    Calificacion NUMERIC(5) NOT NULL,
    CONSTRAINT ID_Vid FOREIGN KEY (ID_Vid)
        REFERENCES GeekMetrik.Videojuego (ID_Videojuego)
        ON DELETE CASCADE ON UPDATE CASCADE,
);
