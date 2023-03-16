
package Paquete1;

public class Yates extends Privados {
    int cap_pasajeros;

    public Yates(int cap_pasajeros) {
        this.cap_pasajeros = cap_pasajeros;
    }
    
    @Override
    public void Transportar(){
        System.out.println("El yate transporta personas \n Su capacidad de : "+cap_pasajeros+" pasajeros \n");
    }
}
