
package Paquete1;

public class Camionetas extends Livianos {
    double peso;
    double coste;

    public Camionetas(double peso, double coste) {
        this.peso = peso;
        this.coste = coste;
    }
    
    
    @Override
    public void Transportar(){
        System.out.println("Las Camionetas transportan Comida \n Tienes un costo alrededor de : "+coste+"$ \n El peso es de "+peso+"kg\n");
    }
}
