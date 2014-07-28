/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * @author 
 */
public class Aspecto {

    private int IdAspecto;

    /**
     * Get the value of IdAspecto
     *
     * @return the value of IdAspecto
     */
    public int getIdAspecto() {
        return IdAspecto;
    }

    /**
     * Set the value of IdAspecto
     *
     * @param IdAspecto new value of IdAspecto
     */
    public void setIdAspecto(int IdAspecto) {
        this.IdAspecto = IdAspecto;
    }

        private String Descripcion;

    /**
     * Get the value of Descripcion
     *
     * @return the value of Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Set the value of Descripcion
     *
     * @param Descripcion new value of Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Aspecto(int IdAspecto, String Descripcion) {
        this.IdAspecto = IdAspecto;
        this.Descripcion = Descripcion;
    }

}
