/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author santiago
 */
public class Estudiante {
    
    private int IdEstudiante;
    /**
     * Get the value of IdEstudiante     
     * @return the value of IdEstudiante
     */
    public int getIdEstudiante() {
        return IdEstudiante;
    }

    /**
     * Set the value of IdEstudiante
     * @param IdEstudiante new value of IdEstudiante
     */
    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }
    
        private String Cedula;

    /**
     * Get the value of Cedula
     * @return the value of Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * Set the value of Cedula
     * @param Cedula new value of Cedula
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    private String Nombre;

    /**
     * Get the value of Nombre
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Apellido;

    /**
     * Get the value of Apellido
     * @return the value of Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Set the value of Apellido
     * @param Apellido new value of Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    private String Telefono;

    /**
     * Get the value of Telefono
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    private String Direccion;

    /**
     * Get the value of Direccion
     * @return the value of Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Set the value of Direccion
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    private boolean Estado;

    /**
     * Get the value of Estado
     * @return the value of Estado
     */
    public boolean Estado() {
        return Estado;
    }

    /**
     * Set the value of Estado    
     * @param Estado new value of Estado
     */
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}