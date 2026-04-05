package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Clase base para personas de la aplicacion.
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * Crea una persona con nombre y edad.
     *
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }
}
