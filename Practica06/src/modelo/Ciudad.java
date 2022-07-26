/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario iTC
 */
public class Ciudad {
    private Integer id;
    private String nombre;
    private Integer habitantes;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the habitantes
     */
    public Integer getHabitantes() {
        return habitantes;
    }

    /**
     * @param habitantes the habitantes to set
     */
    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
