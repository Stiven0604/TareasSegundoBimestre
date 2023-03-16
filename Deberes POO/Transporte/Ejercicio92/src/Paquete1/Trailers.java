
package Paquete1;


public class Trailers {
    double cap_carga;
    double peso;

    public Trailers(double cap_carga, double peso) {
        this.cap_carga = cap_carga;
        this.peso = peso;
    }
    
    
    public  void Transportar(){
        System.out.println("Los trailers transportan contenedores \n Tienes un capacidad de carga de : "+cap_carga+" cotenedores \n El peso es de "+peso+"kg\n");
    }
}
