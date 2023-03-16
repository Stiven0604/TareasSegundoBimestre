
package Paquete1;


public class Pesqueros extends Comerciales {
    double cap_carga;

    public Pesqueros(double cap_carga) {
        this.cap_carga = cap_carga;
    }
    
    
    @Override
    public  void Transportar(){
        System.out.println("Transporta pescados / Su capacidad de carga : "+cap_carga+" kg \n");
    }
}
