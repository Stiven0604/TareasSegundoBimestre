
package Paquete1;


public class Buses extends Pesados{
    double capac_pasajeros;
    double peso;

    public Buses(double capac_pasajeros, double peso) {
        this.capac_pasajeros = capac_pasajeros;
        this.peso = peso;
    }
    
    @Override
    public void Transportar(){
        System.out.println("Los buses transportan personas \n  Su capacidad de pasajeros es : "+capac_pasajeros+"\n Su peso es de : "+peso+" kg\n");
    }
}
