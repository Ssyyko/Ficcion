package com.mycompany.ficcion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Clase principal de la aplicacion.
 */
public class FiccionApp {

    private static final List<Serie> series = new ArrayList<>();
    private static final List<Pelicula> peliculas = new ArrayList<>();
    private static final List<Cliente> clientes = new ArrayList<>();
    private static final List<Actor> actores = new ArrayList<>();

    /**
     * Inicia la aplicacion.
     *
     * @param args argumentos de linea
     */
    public static void main(String[] args) {
        crearObjetosIniciales();
        pedirInformacionInicial();
        mostrarAtributosConsola();
        SwingUtilities.invokeLater(() -> new LoginFrame(series, peliculas).setVisible(true));
    }

    /**
     * Crea objetos iniciales para la aplicacion.
     */
    public static void crearObjetosIniciales() {
        String imgBreaking = "imagenes/breakingbad.jpg";
        String imgDark = "imagenes/dark.jpg";
        String imgOrigen = "imagenes/origen.jpg";
        String imgInterstellar = "imagenes/interestelar.jpg";

        series.add(new Serie("S1", "Breaking Bad", 5, new int[]{7, 13, 13, 13, 16}, new int[]{58, 48, 47, 46, 49}, imgBreaking));
        series.add(new Serie("S2", "Dark", 3, new int[]{10, 8, 8}, new int[]{52, 55, 60}, imgDark));
        peliculas.add(new Pelicula("P1", "Origen", 148, imgOrigen));
        peliculas.add(new Pelicula("P2", "Interstellar", 169, imgInterstellar));
        clientes.add(new Cliente("C1", "Gabriel", 22, TipoCliente.PREMIUM, imgOrigen));
        clientes.add(new Cliente("C2", "Lucia", 20, TipoCliente.BASICO, imgDark));
        actores.add(new Actor("A1", "Bryan Cranston", 68, imgBreaking));
        actores.add(new Actor("A2", "Matthew McConaughey", 55, imgInterstellar));
    }

    /**
     * Pide al usuario que informacion quiere ver al inicio.
     */
    public static void pedirInformacionInicial() {
        String[] opciones = {"Series", "Peliculas", "Clientes", "Actores"};
        String eleccion = (String) JOptionPane.showInputDialog(
                null,
                "Que informacion quieres ver al iniciar?",
                "Ficcion",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (eleccion == null) {
            return;
        }

        String mensaje;
        switch (eleccion) {
            case "Peliculas" -> mensaje = peliculas.get(0).getNombre() + " y " + peliculas.get(1).getNombre();
            case "Clientes" -> mensaje = clientes.get(0).getNombre() + " y " + clientes.get(1).getNombre();
            case "Actores" -> mensaje = actores.get(0).getNombre() + " y " + actores.get(1).getNombre();
            default -> mensaje = series.get(0).getNombre() + " y " + series.get(1).getNombre();
        }
        JOptionPane.showMessageDialog(null, "Seleccion inicial: " + mensaje);
    }

    /**
     * Muestra por consola atributos e ids.
     */
    public static void mostrarAtributosConsola() {
        for (Serie serie : series) {
            serie.mostrarId();
            serie.mostrarAtributos();
        }
        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarId();
            pelicula.mostrarAtributos();
        }
        for (Cliente cliente : clientes) {
            cliente.mostrarId();
            cliente.mostrarAtributos();
        }
        for (Actor actor : actores) {
            actor.mostrarId();
            actor.mostrarAtributos();
        }
    }
}
