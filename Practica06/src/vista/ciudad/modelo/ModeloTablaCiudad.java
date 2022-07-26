/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ciudad.modelo;

import controlador.tda.grafos.GrafoDE;
import javax.swing.table.AbstractTableModel;
import modelo.Ciudad;

/**
 *
 * @author sebastian
 */
public class ModeloTablaCiudad extends AbstractTableModel {

    private GrafoDE<Ciudad> grafo;

    public GrafoDE<Ciudad> getGrafo() {
        return grafo;
    }

    public void setGrafo(GrafoDE<Ciudad> grafo) {
        this.grafo = grafo;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return grafo.numVertices();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Ciudad";
            case 2:
                return "Habitantes";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        try {
            Ciudad c = grafo.obtenerEtiqueta(arg0 + 1);
            switch (arg1) {
                case 0:
                    return (arg0+1);
                case 1:
                    return c.getNombre();
                case 2:
                    return c.getHabitantes();
                default:
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Error en listado");
            return null;
        }
    }

}
