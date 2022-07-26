/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Ciudad;

import controlador.tda.grafos.GrafoDE;
import modelo.NombreCiudad;
import modelo.Ciudad;

/**
 *
 * @author Usuario iTC
 */
public class CiudadGrafoController {
    private GrafoDE<Ciudad> gde;
    private Ciudad ciudad;

    public CiudadGrafoController(Integer nroVertices) {
        gde = new GrafoDE<>(nroVertices, Ciudad.class);
        NombreCiudad[] nombre = NombreCiudad.values();
        for (int i = 1; i <= nroVertices; i++) {
            Ciudad c = new Ciudad();
            c.setId(i);
            c.setNombre(String.valueOf(nombre[i - 1]));
            c.setHabitantes((int) (Math.random()*(5000-1000)) + 1000);
            gde.etiquetarVertice(i, c);
        }
    }

    /**
     * @return the gde
     */
    public GrafoDE<Ciudad> getGde() {
        return gde;
    }

    /**
     * @param gde the gde to set
     */
    public void setGde(GrafoDE<Ciudad> gde) {
        this.gde = gde;
    }

    /**
     * @return the ciudad
     */
    public Ciudad getCiudad() {
        if(ciudad == null)
            ciudad = new Ciudad();        
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
