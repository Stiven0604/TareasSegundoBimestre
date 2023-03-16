
package Paquete1;

public class Lanchas extends Privados{
    int cap_pasajeros;

    public Lanchas(int cap_pasajeros) {
        this.cap_pasajeros = cap_pasajeros;
    }
    
    
    @Override
    public void Transportar(){
        System.out.println("La lancha transporta personas \n Su capacidad de pasajeros :"+cap_pasajeros);
    }
}
