/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Toshiba
 */
public class Viviendas {
    
    
    
    
    
   

    /**
     * @return the IdVivienda
     */
    public int getIdVivienda() {
        return IdVivienda;
    }

    /**
     * @param IdVivienda the IdVivienda to set
     */
    public void setIdVivienda(int IdVivienda) {
        this.IdVivienda = IdVivienda;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the IdResidente
     */
    public int getIdResidente() {
        return IdResidente;
    }

    /**
     * @param IdResidente the IdResidente to set
     */
    public void setIdResidente(int IdResidente) {
        this.IdResidente = IdResidente;
    }

    /**
     * @return the IdMembresia
     */
    public int getIdMembresia() {
        return IdMembresia;
    }

    /**
     * @param IdMembresia the IdMembresia to set
     */
    public void setIdMembresia(int IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    /**
     * @return the IdDueno
     */
    public int getIdDueno() {
        return IdDueno;
    }

    /**
     * @param IdDueno the IdDueno to set
     */
    public void setIdDueno(int IdDueno) {
        this.IdDueno = IdDueno;
    }

    public Viviendas(int IdVivienda, String Estado, int IdResidente, int IdMembresia, int IdDueno) {
        this.IdVivienda = IdVivienda;
        this.Estado = Estado;
        this.IdResidente = IdResidente;
        this.IdMembresia = IdMembresia;
        this.IdDueno = IdDueno;
    }
    
    
    private int IdVivienda;
    private String Estado;
    private int IdResidente;
    private int IdMembresia;
    private int IdDueno;
    
    
    
    
}
