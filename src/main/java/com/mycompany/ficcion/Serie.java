package com.mycompany.ficcion;

import java.util.Arrays;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Representa una serie de ficcion.
 */
public class Serie extends Titulo implements MostrableId {

    private String id;
    private int numeroTemporadas;
    private int[] capitulosPorTemporada;
    private int[] duracionEpisodios;
    private String rutaImagen;

    /**
     * Crea una serie con sus datos principales.
     *
     * @param id identificador de la serie
     * @param nombre nombre de la serie
     * @param numeroTemporadas numero de temporadas
     * @param capitulosPorTemporada capitulos por temporada
     * @param duracionEpisodios duracion de episodios
     * @param rutaImagen ruta de la imagen
     */
    public Serie(String id, String nombre, int numeroTemporadas, int[] capitulosPorTemporada, int[] duracionEpisodios, String rutaImagen) {
        super(nombre);
        this.id = id;
        this.numeroTemporadas = numeroTemporadas;
        this.capitulosPorTemporada = capitulosPorTemporada;
        this.duracionEpisodios = duracionEpisodios;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Suma la duracion de todos los capitulos.
     *
     * @return duracion total en minutos
     */
    public int sumarDuracionTotal() {
        int total = 0;
        for (int duracion : duracionEpisodios) {
            total += duracion;
        }
        return total;
    }

    /**
     * Muestra por pantalla todos los atributos de la serie.
     */
    public void mostrarAtributos() {
        System.out.println("Serie{id=" + id + ", nombre=" + getNombre() + ", temporadas=" + numeroTemporadas
                + ", capitulos=" + Arrays.toString(capitulosPorTemporada)
                + ", duraciones=" + Arrays.toString(duracionEpisodios)
                + ", rutaImagen=" + rutaImagen + "}");
    }

    @Override
    public String getIdentificador() {
        return id;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
}
