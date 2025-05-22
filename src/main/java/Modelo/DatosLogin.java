package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatosLogin {
    public ArrayList<String> credenciales = new ArrayList<>();

    public DatosLogin() {
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/login.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(";")) {
                    credenciales.add(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}//a
