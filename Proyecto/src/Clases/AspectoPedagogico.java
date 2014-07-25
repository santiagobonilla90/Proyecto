/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * @author santiago
 */
public class AspectoPedagogico {
    
    private int IdAspectoPedagogico;

    /**
     * Get the value of IdAspectoPedagogico
     *
     * @return the value of IdAspectoPedagogico
     */
    public int getIdAspectoPedagogico() {
        return IdAspectoPedagogico;
    }

    /**
     * Set the value of IdAspectoPedagogico
     *
     * @param IdAspectoPedagogico new value of IdAspectoPedagogico
     */
    public void setIdAspectoPedagogico(int IdAspectoPedagogico) {
        this.IdAspectoPedagogico = IdAspectoPedagogico;
    }

    private String MateriaProblema;

    /**
     * Get the value of MateriaProblema
     *
     * @return the value of MateriaProblema
     */
    public String getMateriaProblema() {
        return MateriaProblema;
    }

    /**
     * Set the value of MateriaProblema
     *
     * @param MateriaProblema new value of MateriaProblema
     */
    public void setMateriaProblema(String MateriaProblema) {
        this.MateriaProblema = MateriaProblema;
    }

    private String MateriaPreferida;

    /**
     * Get the value of MateriaPreferida
     *
     * @return the value of MateriaPreferida
     */
    public String getMateriaPreferida() {
        return MateriaPreferida;
    }

    /**
     * Set the value of MateriaPreferida
     *
     * @param MateriaPreferida new value of MateriaPreferida
     */
    public void setMateriaPreferida(String MateriaPreferida) {
        this.MateriaPreferida = MateriaPreferida;
    }

    public AspectoPedagogico(int IdAspectoPedagogico, String MateriaProblema, String MateriaPreferida) {
        this.IdAspectoPedagogico = IdAspectoPedagogico;
        this.MateriaProblema = MateriaProblema;
        this.MateriaPreferida = MateriaPreferida;
    }    
}
