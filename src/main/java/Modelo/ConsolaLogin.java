package Modelo;

import java.util.Scanner;

public class ConsolaLogin {
    Scanner scanner = new Scanner(System.in);
    DatosLogin datos = new DatosLogin();
    Login login = new Login();

    public void menu() {
        String opcion;
        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (!opcion.equals("2"));
    }

    private void mostrarOpciones() {
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                manejarLogin();
                break;
            case "2":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void manejarLogin() {
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();

        if (login.autenticar(usuario, clave, datos)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }
    }
}//a
