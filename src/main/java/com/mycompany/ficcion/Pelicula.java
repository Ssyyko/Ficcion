package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Representa una pelicula.
 */
public class Pelicula extends Titulo implements MostrableId {

    private String id;
    private int duracion;
    private String rutaImagen;

    /**
     * Crea una pelicula.
     *
     * @param id identificador de la pelicula
     * @param nombre nombre de la pelicula
     * @param duracion duracion en minutos
     * @param rutaImagen ruta de la imagen
     */
    public Pelicula(String id, String nombre, int duracion, String rutaImagen) {
        super(nombre);
        this.id = id;
        this.duracion = duracion;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Muestra por pantalla todos los atributos de la pelicula.
     */
    public void mostrarAtributos() {
        System.out.println("Pelicula{id=" + id + ", nombre=" + getNombre() + ", duracion=" + duracion + ", rutaImagen=" + rutaImagen + "}");
    }

    @Override
    public String getIdentificador() {
        return id;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
