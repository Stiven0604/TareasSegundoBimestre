
package Paquete1;




public class TransaccionRetiro extends TransaccionATM {
    
    public double monto;

    public TransaccionRetiro(double monto, int IDdetransaccion, String Fecha, String tipo) {
        super(IDdetransaccion, Fecha, tipo);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public void extraccion(double r){
        monto=monto-r;
    }
}
