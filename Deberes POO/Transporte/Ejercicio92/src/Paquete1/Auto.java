
package Paquete1;


public class Auto {
    double peso;
    double coste;

    public Auto(double peso, double coste) {
        this.peso = peso;
        this.coste = coste;
    }
    
    public  void Transportar(){
        System.out.println("Los autos transporta personas \n Tienes un costo alrededor de : "+coste+" $ \n El peso es de "+peso+"kg\n");
    }
}
