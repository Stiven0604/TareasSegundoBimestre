
package Paquete1;


public class Portaaviones extends Militares {
    int cap_aviones;

    public Portaaviones(int cap_aviones) {
        this.cap_aviones = cap_aviones;
    }
    
    @Override
    public void Transportar(){
        System.out.println("Transporta aviones \n Su capacidad de aviones es : "+cap_aviones+" \n");
    }
}
