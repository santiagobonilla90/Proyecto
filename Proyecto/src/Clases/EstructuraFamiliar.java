/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * @author santiago
 */
public class EstructuraFamiliar {
    
    private int IdEstructuraFamiliar;

    /**
     * Get the value of IdEstructuraFamiliar
     * @return the value of IdEstructuraFamiliar
     */
    public int getIdEstructuraFamiliar() {
        return IdEstructuraFamiliar;
    }

    /**
     * Set the value of IdEstructuraFamiliar
     * @param IdEstructuraFamiliar new value of IdEstructuraFamiliar
     */
    public void setIdEstructuraFamiliar(int IdEstructuraFamiliar) {
        this.IdEstructuraFamiliar = IdEstructuraFamiliar;
    }

    private String Nombres;

    /**
     * Get the value of Nombres
     * @return the value of Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * Set the value of Nombres
     * @param Nombres new value of Nombres
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
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

    private String Relacion;

    /**
     * Get the value of Relacion
     * @return the value of Relacion
     */
    public String getRelacion() {
        return Relacion;
    }

    /**
     * Set the value of Relacion
     * @param Relacion new value of Relacion
     */
    public void setRelacion(String Relacion) {
        this.Relacion = Relacion;
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

    private int Edad;

    /**
     * Get the value of Edad
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    private String Instruccion;

    /**
     * Get the value of Instruccion
     * @return the value of Instruccion
     */
    public String getInstruccion() {
        return Instruccion;
    }

    /**
     * Set the value of Instruccion
     * @param Instruccion new value of Instruccion
     */
    public void setInstruccion(String Instruccion) {
        this.Instruccion = Instruccion;
    }

    private String Ocupacion;

    /**
     * Get the value of Ocupacion
     * @return the value of Ocupacion
     */
    public String getOcupacion() {
        return Ocupacion;
    }

    /**
     * Set the value of Ocupacion
     * @param Ocupacion new value of Ocupacion
     */
    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    private int Bono;

    /**
     * Get the value of Bono
     * @return the value of Bono
     */
    public int getBono() {
        return Bono;
    }

    /**
     * Set the value of Bono
     * @param Bono new value of Bono
     */
    public void setBono(int Bono) {
        this.Bono = Bono;
    }

    public EstructuraFamiliar(int IdEstructuraFamiliar, String Nombres, String Apellido, String Relacion, String Cedula, int Edad, String Instruccion, String Ocupacion, int Bono) {
        this.IdEstructuraFamiliar = IdEstructuraFamiliar;
        this.Nombres = Nombres;
        this.Apellido = Apellido;
        this.Relacion = Relacion;
        this.Cedula = Cedula;
        this.Edad = Edad;
        this.Instruccion = Instruccion;
        this.Ocupacion = Ocupacion;
        this.Bono = Bono;
    }    
}
