
package Paquete1;

public class Submarinosnucleares extends Submilitares{
    int cap_armas_nucleares;

    public Submarinosnucleares(int cap_armas_nucleares) {
        this.cap_armas_nucleares = cap_armas_nucleares;
    }
    
    @Override
   public  void Transportar(){
        System.out.println("Los autos transporta armas nucleares \n Su capacidad de armas es de: "+cap_armas_nucleares+" \n");
    }
}
