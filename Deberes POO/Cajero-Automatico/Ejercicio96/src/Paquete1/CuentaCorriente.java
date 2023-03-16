
package Paquete1;

public class CuentaCorriente extends Cuenta{
    
    public int numero_cuenta;
    public double saldo;

    public CuentaCorriente(int numero_cuenta, double saldo, String tipo, String propietario) {
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

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }



    
    public void debito(double d){
        
        saldo=saldo-d;
        
    }
    public void credito(double c){
        
        saldo=saldo+c;
    }
    
}
