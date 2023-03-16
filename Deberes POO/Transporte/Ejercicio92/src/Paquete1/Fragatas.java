
package Paquete1;

public class Fragatas extends Militares {
    int cap_misiles;

    public Fragatas(int cap_misiles) {
        this.cap_misiles = cap_misiles;
    }
    
    @Override
    public void Transportar(){
        System.out.println("Transporta misiles \n Capacidad de misiles : "+cap_misiles+"\n");
    }
}
