package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Representa un actor.
 */
public class Actor extends Persona implements MostrableId {

    private String id;
    private String rutaImagen;

    /**
     * Crea un actor.
     *
     * @param id identificador del actor
     * @param nombre nombre del actor
     * @param edad edad del actor
     * @param rutaImagen ruta de la imagen
     */
    public Actor(String id, String nombre, int edad, String rutaImagen) {
        super(nombre, edad);
        this.id = id;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Muestra por pantalla todos los atributos del actor.
     */
    public void mostrarAtributos() {
        System.out.println("Actor{id=" + id + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", rutaImagen=" + rutaImagen + "}");
    }

    @Override
    public String getIdentificador() {
        return id;
    }
}
