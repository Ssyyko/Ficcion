package com.mycompany.ficcion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.imageio.ImageIO;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Crea imagenes sencillas para series y peliculas.
 */
public class ImageFactory {

    /**
     * Crea una imagen sencilla con titulo.
     *
     * @param carpeta carpeta destino
     * @param nombreArchivo nombre del archivo
     * @param titulo texto a escribir
     * @param color color de fondo
     * @return ruta del archivo generado
     */
    public static String createImage(Path carpeta, String nombreArchivo, String titulo, Color color) {
        try {
            Files.createDirectories(carpeta);
            Path ruta = carpeta.resolve(nombreArchivo);
            if (!Files.exists(ruta)) {
                BufferedImage imagen = new BufferedImage(320, 200, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2 = imagen.createGraphics();
                g2.setColor(color);
                g2.fillRect(0, 0, 320, 200);
                g2.setColor(Color.WHITE);
                g2.setFont(new Font("Arial", Font.BOLD, 28));
                g2.drawString(titulo, 20, 105);
                g2.dispose();
                ImageIO.write(imagen, "png", ruta.toFile());
            }
            return ruta.toString();
        } catch (IOException e) {
            return "";
        }
    }
}
