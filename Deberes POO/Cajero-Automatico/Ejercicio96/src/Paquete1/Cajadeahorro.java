
package Paquete1;

public class Cajadeahorro extends Cuenta  {
    
    public int numero_cuenta;
    public double saldo;
    

    public Cajadeahorro(int numero_cuenta, double saldo, String tipo, String propietario) {
        super(tipo, propietario);
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    
    
    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void debito(double d){      
        saldo=saldo-d;
    }
    public void credito(double c){
        saldo=saldo+c;
    }
    
}
