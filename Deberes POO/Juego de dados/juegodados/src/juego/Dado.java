
package juego;

/**
 *
 * @author Edison Córdoba
 */
public class Dado {
    private int numero;
    private boolean volverALanzar;
    
    //constructor

    public Dado(int numero, boolean volverALanzar) {
        this.numero = numero;
        this.volverALanzar = volverALanzar;
    }
    // metodos get y seet

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean isVolverALanzar() {
        return volverALanzar;
    }

    public void setVolverALanzar(boolean volverALanzar) {
        this.volverALanzar = volverALanzar;
    } 
    
    //metodo
    public void mostrar(){
        System.out.println(numero + " ");
    }
}
