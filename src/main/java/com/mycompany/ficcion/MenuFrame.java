package com.mycompany.ficcion;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Ventana para elegir entre series y peliculas.
 */
public class MenuFrame extends JFrame {

    /**
     * Crea el menu principal.
     *
     * @param series lista de series
     * @param peliculas lista de peliculas
     */
    public MenuFrame(List<Serie> series, List<Pelicula> peliculas) {
        setTitle("Menu principal");
        setSize(320, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1, 10, 10));

        BotonPersonalizado btnSeries = new BotonPersonalizado("Series");
        BotonPersonalizado btnPeliculas = new BotonPersonalizado("Peliculas");

        add(btnSeries);
        add(btnPeliculas);

        btnSeries.addActionListener(e -> {
            dispose();
            new SeriesFrame(series).setVisible(true);
        });

        btnPeliculas.addActionListener(e -> {
            dispose();
            new PeliculasFrame(peliculas).setVisible(true);
        });
    }
}
