package com.mycompany.ficcion;

/**
 * <span style="display:none">No mostrar en el resumen.</span>
 * Representa un cliente de la plataforma.
 */
public class Cliente extends Persona implements MostrableId {

    private String id;
    private TipoCliente tipoCliente;
    private String rutaImagen;

    /**
     * Crea un cliente.
     *
     * @param id identificador del cliente
     * @param nombre nombre del cliente
     * @param edad edad del cliente
     * @param tipoCliente tipo de cliente
     * @param rutaImagen ruta de imagen
     */
    public Cliente(String id, String nombre, int edad, TipoCliente tipoCliente, String rutaImagen) {
        super(nombre, edad);
        this.id = id;
        this.tipoCliente = tipoCliente;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Muestra por pantalla todos los atributos del cliente.
     */
    public void mostrarAtributos() {
        System.out.println("Cliente{id=" + id + ", nombre=" + getNombre() + ", edad=" + getEdad()
                + ", tipo=" + tipoCliente + ", rutaImagen=" + rutaImagen + "}");
    }

    @Override
    public String getIdentificador() {
        return id;
    }
}
