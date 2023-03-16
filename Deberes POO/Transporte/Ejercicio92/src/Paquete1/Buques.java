
package Paquete1;


public class Buques extends Comerciales{
    int cap_contenedores;

    public Buques(int cap_contenedores) {
        this.cap_contenedores = cap_contenedores;
    }
    
    @Override
    public  void Transportar(){
        System.out.println("Los Buques transportan contenedores \n Su capacidad es de :"+cap_contenedores+"\n");
    }
}
