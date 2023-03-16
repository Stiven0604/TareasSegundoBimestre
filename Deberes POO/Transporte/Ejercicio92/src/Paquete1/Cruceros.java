
package Paquete1;


public class Cruceros extends Comerciales{
    int capci_pasajeros;

    public Cruceros(int capci_pasajeros) {
        this.capci_pasajeros = capci_pasajeros;
    }
   
    
    @Override
    public  void Transportar(){
        System.out.println("Un crucero transporta persona \n Su capacidad de pasajeros es :"+capci_pasajeros+" personas \n");
    }
}
