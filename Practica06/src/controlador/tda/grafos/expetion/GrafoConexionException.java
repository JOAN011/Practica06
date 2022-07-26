package controlador.tda.grafos.expetion;

/**
 *
 * @author patob
 */
public class GrafoConexionException extends Exception{


    public GrafoConexionException() {
    }

    /**
     * Constructs an instance of <code>GrafoConexionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GrafoConexionException(String msg) {
        super(msg);
    }
}
