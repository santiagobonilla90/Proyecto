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
public class FichaCabecera {
    
    private int IdFicha;

    /**
     * Get the value of IdFicha
     *
     * @return the value of IdFicha
     */
    public int getIdFicha() {
        return IdFicha;
    }

    /**
     * Set the value of IdFicha
     *
     * @param IdFicha new value of IdFicha
     */
    public void setIdFicha(int IdFicha) {
        this.IdFicha = IdFicha;
    }

    private Date FechaRegistro;

    /**
     * Get the value of FechaRegistro
     *
     * @return the value of FechaRegistro
     */
    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    /**
     * Set the value of FechaRegistro
     *
     * @param FechaRegistro new value of FechaRegistro
     */
    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    private String Observacion;

    /**
     * Get the value of Observacion
     *
     * @return the value of Observacion
     */
    public String getObservacion() {
        return Observacion;
    }

    /**
     * Set the value of Observacion
     *
     * @param Observacion new value of Observacion
     */
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    private int Estado;

    /**
     * Get the value of Estado
     *
     * @return the value of Estado
     */
    public int getEstado() {
        return Estado;
    }

    /**
     * Set the value of Estado
     *
     * @param Estado new value of Estado
     */
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    private String Procedencia;

    /**
     * Get the value of Procedencia
     *
     * @return the value of Procedencia
     */
    public String getProcedencia() {
        return Procedencia;
    }

    /**
     * Set the value of Procedencia
     *
     * @param Procedencia new value of Procedencia
     */
    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    public FichaCabecera(int IdFicha, Date FechaRegistro, String Observacion, int Estado, String Procedencia) {
        this.IdFicha = IdFicha;
        this.FechaRegistro = FechaRegistro;
        this.Observacion = Observacion;
        this.Estado = Estado;
        this.Procedencia = Procedencia;
    }

}
