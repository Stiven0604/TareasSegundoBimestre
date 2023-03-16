
package Paquete1;


public class TransaccionValidacionPIN extends TransaccionATM {
    
    public int PINanterior;
    public int PINnuevo;

    public TransaccionValidacionPIN(int PINanterior, int PINnuevo, int IDdetransaccion, String Fecha, String tipo) {
        super(IDdetransaccion, Fecha, tipo);
        this.PINanterior = PINanterior;
        this.PINnuevo = PINnuevo;
    }

 
    
    public int getPINanterior() {
        return PINanterior;
    }

    public void setPINanterior(int PINanterior) {
        this.PINanterior = PINanterior;
    }

    public int getPINnuevo() {
        return PINnuevo;
    }

    public void setPINnuevo(int PINnuevo) {
        this.PINnuevo = PINnuevo;
    }
    
    public void CambioPIN(){
        PINanterior=PINnuevo;
    }
    
}
