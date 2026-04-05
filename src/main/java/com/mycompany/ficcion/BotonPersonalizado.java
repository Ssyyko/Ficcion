package com.mycompany.ficcion;

import java.awt.Color;
import javax.swing.JButton;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Boton personalizado con colores por defecto.
 */
public class BotonPersonalizado extends JButton {

    /**
     * Crea un boton con estilo propio.
     *
     * @param texto texto del boton
     */
    public BotonPersonalizado(String texto) {
        super(texto);
        setBackground(new Color(201, 214, 255));
        setForeground(Color.BLACK);
        setFocusPainted(false);
    }
}
