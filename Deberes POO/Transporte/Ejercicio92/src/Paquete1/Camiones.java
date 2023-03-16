
package Paquete1;


public class Camiones extends Pesados {
    double cap_carga;
    double peso;

    public Camiones(double cap_carga, double peso) {
        this.cap_carga = cap_carga;
        this.peso = peso;
    }
    
    @Override
    public  void Transportar(){
        System.out.println("Los Camiones transportan productos \n Su capacidad de carga es de :"+cap_carga+"\n Su peso es de : "+peso+" kg\n");
    }
}
