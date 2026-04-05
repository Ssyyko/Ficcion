package com.mycompany.ficcion;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Utilidad para cargar imagenes desde internet o desde disco.
 */
public class ImageLoader {

    /**
     * Coloca una imagen escalada en un label.
     *
     * @param label etiqueta destino
     * @param ruta ruta local o URL
     */
    public static void ponerImagen(JLabel label, String ruta) {
        try {
            ImageIcon icono;
            if (ruta.startsWith("http://") || ruta.startsWith("https://")) {
                icono = new ImageIcon(new URL(ruta));
            } else {
                icono = new ImageIcon(ruta);
            }
            Image escalada = icono.getImage().getScaledInstance(220, 140, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(escalada));
            label.setText("");
        } catch (Exception e) {
            label.setIcon(null);
            label.setText("No se pudo cargar la imagen");
        }
    }
}
