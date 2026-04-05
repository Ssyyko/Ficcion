package com.mycompany.ficcion;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Ventana para ver peliculas.
 */
public class PeliculasFrame extends JFrame {

    /**
     * Crea la ventana de peliculas.
     *
     * @param menuFrame ventana de menu
     * @param peliculas lista de peliculas
     */
    public PeliculasFrame(MenuFrame menuFrame, List<Pelicula> peliculas) {
        setTitle("Peliculas");
        setSize(700, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JList<Pelicula> lista = new JList<>(peliculas.toArray(new Pelicula[0]));
        JTextArea info = new JTextArea();
        info.setEditable(false);
        JLabel imagen = new JLabel();

        lista.addListSelectionListener(e -> {
            Pelicula pelicula = lista.getSelectedValue();
            if (pelicula != null) {
                info.setText("Nombre: " + pelicula.getNombre()
                        + "\nDuracion: " + pelicula.getDuracion() + " minutos");
                ImageLoader.ponerImagen(imagen, pelicula.getRutaImagen());
            }
        });

        add(new JScrollPane(lista), BorderLayout.WEST);
        add(new JScrollPane(info), BorderLayout.CENTER);
        JPanel panelImagen = new JPanel(new BorderLayout());
        panelImagen.add(imagen, BorderLayout.CENTER);
        add(panelImagen, BorderLayout.EAST);

        JButton btnVolver = new BotonPersonalizado("Volver al menu");
        btnVolver.addActionListener(e -> {
            dispose();
            menuFrame.setVisible(true);
        });
        add(btnVolver, BorderLayout.SOUTH);
    }

}
