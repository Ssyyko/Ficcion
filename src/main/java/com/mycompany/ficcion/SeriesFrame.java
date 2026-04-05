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
 * Ventana para ver series.
 */
public class SeriesFrame extends JFrame {

    /**
     * Crea la ventana de series.
     *
     * @param menuFrame ventana de menu
     * @param series lista de series
     */
    public SeriesFrame(MenuFrame menuFrame, List<Serie> series) {
        setTitle("Series");
        setSize(700, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JList<Serie> lista = new JList<>(series.toArray(new Serie[0]));
        JTextArea info = new JTextArea();
        info.setEditable(false);
        JLabel imagen = new JLabel();

        lista.addListSelectionListener(e -> {
            Serie serie = lista.getSelectedValue();
            if (serie != null) {
                info.setText("Nombre: " + serie.getNombre()
                        + "\nTemporadas: " + serie.getNumeroTemporadas()
                        + "\nDuracion total: " + serie.sumarDuracionTotal() + " minutos");
                ImageLoader.ponerImagen(imagen, serie.getRutaImagen());
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
