# Validador de Correo Electrónico

Este es un programa simple en Java que valida la entrada del usuario como una dirección de correo electrónico según ciertas condiciones. Si la entrada del usuario no cumple con los requisitos especificados, se lanzan excepciones personalizadas para manejar los errores.

## Requisitos del Sistema

- Java JDK 8 o superior instalado en el sistema.

## Ejecución

1. Clona o descarga este repositorio en tu máquina local.
2. Abre una terminal o línea de comandos y navega hasta el directorio donde se encuentra el archivo `ValidarCorreo.java`.
3. Compila el programa ejecutando el siguiente comando:
   ```
   javac Main.java
   ```
4. Después de compilar, ejecuta el programa con el siguiente comando:
   ```
   java Main
   ```
5. Sigue las instrucciones en pantalla para ingresar tu dirección de correo electrónico y observa cómo el programa valida la entrada.

## Funcionalidades

- Verifica que la dirección de correo electrónico tenga el formato correcto (nombre de usuario seguido de `@` y un dominio).
- Limita la longitud del correo electrónico a un máximo de 16 caracteres.
- Controla el número de mayúsculas en el nombre de usuario, permitiendo un máximo de dos mayúsculas.
- Detecta la presencia de signos no permitidos en el correo electrónico.
