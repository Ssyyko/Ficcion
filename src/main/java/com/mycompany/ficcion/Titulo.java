package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Clase base para los titulos de ficcion.
 */
public class Titulo {

    private String nombre;

    /**
     * Crea un titulo con el nombre indicado.
     *
     * @param nombre nombre del titulo
     */
    public Titulo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del titulo.
     *
     * @return nombre del titulo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del titulo.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
