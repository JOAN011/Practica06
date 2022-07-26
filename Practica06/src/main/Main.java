/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Usuario iTC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        m.CaminoMinimo(0);
        m.caminoMinimos();
        m.recuperaCamino(1);
    }

    //public class CaminoMinimo {
    private int[][] Pesos;
    private int[] ultimo;
    private int[] D;
    private boolean[] F;
    private int s, n; // vértice origen y número de vértices

    public void CaminoMinimo(int origen) {
        n = 4;
        s = origen;
        Pesos = matriz();
        ultimo = new int[n];
        D = new int[n];
        F = new boolean[n];
    }

    public void caminoMinimos() {
        // valores iniciales
        for (int i = 0; i < n; i++) {
            F[i] = false;
            D[i] = Pesos[s][i];
            ultimo[i] = s;
        }
        F[s] = true;
        D[s] = 0;
        // Pasos para marcar los n-1 vértices 
        for (int i = 1; i < n; i++) {
            int v = minimo();
            /* selecciona vértice no marcado 
de menor distancia */
            F[v] = true;
            // actualiza distancia de vértices no marcados 
            for (int w = 1; w < n; w++) {
                if (!F[w]) {
                    if ((D[v] + Pesos[v][w]) < D[w]) {
                        D[w] = D[v] + Pesos[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
        for (int i = 0; i < ultimo.length; i++) {
            System.out.print(ultimo[i] + " ");
        }
    }

    private int minimo() {
        int mx = 100;
        int v = 1;
        for (int j = 1; j < n; j++) {
            if (!F[j] && (D[j] <= mx)) {
                mx = D[j];
                v = j;
            }
        }
        return v;
    }

    private int[][] matriz() {
        int[][] GrafMatPeso = new int[4][4];

        GrafMatPeso[0][0] = 100;
        GrafMatPeso[0][1] = 0;
        GrafMatPeso[0][2] = 0;
        GrafMatPeso[0][3] = 0;
        //GrafMatPeso[0][4] = 3;
        //GrafMatPeso[0][5] = 100;
        GrafMatPeso[1][0] = 0;
        GrafMatPeso[1][1] = 100;
        GrafMatPeso[1][2] = 0;
        GrafMatPeso[1][3] = 0;
        //GrafMatPeso[1][4] = 5;
        //GrafMatPeso[1][5] = 100;
        GrafMatPeso[2][0] = 0;
        GrafMatPeso[2][1] = 0;
        GrafMatPeso[2][2] = 100;
        GrafMatPeso[2][3] = 0;
        //GrafMatPeso[2][4] = 3;
        //GrafMatPeso[2][5] = 100;
        GrafMatPeso[3][0] = 0;
        GrafMatPeso[3][1] = 0;
        GrafMatPeso[3][2] = 0;
        GrafMatPeso[3][3] = 100;
        //GrafMatPeso[3][4] = 100;
        //GrafMatPeso[3][5] = 100;
//        GrafMatPeso[4][0] = 100;
//        GrafMatPeso[4][1] = 100;
//        GrafMatPeso[4][2] = 100;
//        GrafMatPeso[4][3] = 7;
        //GrafMatPeso[4][4] = 100;
        //GrafMatPeso[4][5] = 3;
//        GrafMatPeso[5][0] = 100;
//        GrafMatPeso[5][1] = 100;
//        GrafMatPeso[5][2] = 100;
//        GrafMatPeso[5][3] = 2;
        //GrafMatPeso[5][4] = 100;
        //GrafMatPeso[5][5] = 100;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ GrafMatPeso[i][j] + "]" + "\t");
            }
            System.out.println("\n");
        }
        return GrafMatPeso;
    }

    public void recuperaCamino(int v) {
        int anterior = ultimo[v];
        if (v != s) {
            recuperaCamino(anterior); // vuelve al último del último
            System.out.print(" -> V" + (v + 1));
        } else {
            System.out.print("V" + (s + 1));
        }
    }
    //}

}
