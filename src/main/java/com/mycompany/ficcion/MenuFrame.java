package com.mycompany.ficcion;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Ventana para elegir entre series y peliculas.
 */
public class MenuFrame extends JFrame {

    private final LoginFrame loginFrame;

    /**
     * Crea el menu principal.
     *
     * @param loginFrame ventana de login
     * @param series lista de series
     * @param peliculas lista de peliculas
     */
    public MenuFrame(LoginFrame loginFrame, List<Serie> series, List<Pelicula> peliculas) {
        this.loginFrame = loginFrame;
        setTitle("Menu principal");
        setSize(320, 230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        BotonPersonalizado btnSeries = new BotonPersonalizado("Series");
        BotonPersonalizado btnPeliculas = new BotonPersonalizado("Peliculas");
        BotonPersonalizado btnVolver = new BotonPersonalizado("Volver al login");

        add(btnSeries);
        add(btnPeliculas);
        add(btnVolver);

        btnSeries.addActionListener(e -> {
            setVisible(false);
            new SeriesFrame(this, series).setVisible(true);
        });

        btnPeliculas.addActionListener(e -> {
            setVisible(false);
            new PeliculasFrame(this, peliculas).setVisible(true);
        });

        btnVolver.addActionListener(e -> {
            dispose();
            loginFrame.setVisible(true);
        });
    }
}
