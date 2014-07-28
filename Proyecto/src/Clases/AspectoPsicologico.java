/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.util.Date;

/**
 * @author
 */
public class AspectoPsicologico {
    
    private int IdAspectoPsicologico;

    /**
     * Get the value of IdAspectoPsicologico
     * @return the value of IdAspectoPsicologico
     */
    public int getIdAspectoPsicologico() {
        return IdAspectoPsicologico;
    }

    /**
     * Set the value of IdAspectoPsicologico
     * @param IdAspectoPsicologico new value of IdAspectoPsicologico
     */
    public void setIdAspectoPsicologico(int IdAspectoPsicologico) {
        this.IdAspectoPsicologico = IdAspectoPsicologico;
    }

    private String Prueba;

    /**
     * Get the value of Prueba
     * @return the value of Prueba
     */
    public String getPrueba() {
        return Prueba;
    }

    /**
     * Set the value of Prueba
     * @param Prueba new value of Prueba
     */
    public void setPrueba(String Prueba) {
        this.Prueba = Prueba;
    }

    private Date Fecha;

    /**
     * Get the value of Fecha
     * @return the value of Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * Set the value of Fecha
     * @param Fecha new value of Fecha
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    private String Apreciacion;

    /**
     * Get the value of Apreciacion
     * @return the value of Apreciacion
     */
    public String getApreciacion() {
        return Apreciacion;
    }

    /**
     * Set the value of Apreciacion
     * @param Apreciacion new value of Apreciacion
     */
    public void setApreciacion(String Apreciacion) {
        this.Apreciacion = Apreciacion;
    }

    public AspectoPsicologico(int IdAspectoPsicologico, String Prueba, Date Fecha, String Apreciacion) {
        this.IdAspectoPsicologico = IdAspectoPsicologico;
        this.Prueba = Prueba;
        this.Fecha = Fecha;
        this.Apreciacion = Apreciacion;
    }

}
