
package Paquete1;

public class TransaccionTransferencia extends TransaccionATM {
    
    public double saldo;
    public int numero_cuenta;

    public TransaccionTransferencia(double saldo, int numero_cuenta, int IDdetransaccion, String Fecha, String tipo) {
        super(IDdetransaccion, Fecha, tipo);
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    @Override
    public int getIDdetransaccion() {
        return IDdetransaccion;
    }

    @Override
    public void setIDdetransaccion(int IDdetransaccion) {
        this.IDdetransaccion = IDdetransaccion;
    }

    @Override
    public String getFecha() {
        return Fecha;
    }

    @Override
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
