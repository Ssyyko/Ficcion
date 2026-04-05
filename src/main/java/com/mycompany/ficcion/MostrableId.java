package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Interfaz para mostrar el identificador principal de un elemento.
 */
public interface MostrableId {

    /**
     * Devuelve el identificador principal del objeto.
     *
     * @return identificador en formato texto
     */
    String getIdentificador();

    /**
     * Muestra por pantalla el identificador del objeto.
     */
    default void mostrarId() {
        System.out.println("ID: " + getIdentificador());
    }
}
