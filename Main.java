import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Cual es tu direccion de correo electronico? ");
            String correo = scanner.nextLine();

            try {
                validarCorreo(correo);
                System.out.println("Hemos recibido tu direccion de correo electronico: " + correo);
                break;
            } catch (CorreoInvalido e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public static void validarCorreo(String correo) throws CorreoInvalido {
        if (correo.length() > 16) {
            throw new CorreoInvalido("Tu correo electronico es un poco largo." +
                    "Por favor, intenta que no supere los 16 caracteres.");
        }

        if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new CorreoInvalido("El formato de la direccion de correo electronico que " +
                    "ingresaste no es valido.Por favor, asegurate de seguir el formato correcto.");
        }

        int countMayusculas = 0;
        int countSignos = 0;

        for (char c : correo.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countMayusculas++;
            }
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '@') {
                countSignos++;
            }
        }

        if (countMayusculas > 2) {
            throw new CorreoInvalido("Las direcciones de correo electronico " +
                    "no deben tener mas de dos mayusculas.");
        }

        if (countSignos > 0) {
            throw new CorreoInvalido("Parece que hay uno o mas caracter no validos " +
                    "en tu direccion de correo electronico.");
        }
    }
}

class CorreoInvalido extends Exception {
    public CorreoInvalido(String message) {
        super(message);
    }
}
