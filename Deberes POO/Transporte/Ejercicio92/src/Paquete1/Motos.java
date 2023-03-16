
package Paquete1;


public class Motos {
    double peso;
    double coste;

    public Motos(double peso, double coste) {
        this.peso = peso;
        this.coste = coste;
    }
    
    public  void Transportar(){
        System.out.println("Las motos transportan personas\n Tienes un costo alrededor de : "+coste+" $ \n El peso es de "+peso+"kg\n");
    }
}
