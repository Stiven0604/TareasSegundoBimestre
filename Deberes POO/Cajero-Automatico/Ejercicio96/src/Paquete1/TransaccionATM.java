
package Paquete1;

import java.util.ArrayList;


public class TransaccionATM {
    
    public int IDdetransaccion;
    public String Fecha;
    public String tipo;
    public Cuenta  cuenta;

    public TransaccionATM(int IDdetransaccion, String Fecha, String tipo) {
        this.IDdetransaccion = IDdetransaccion;
        this.Fecha = Fecha;
        this.tipo = tipo;
    }

    public int getIDdetransaccion() {
        return IDdetransaccion;
    }

    public void setIDdetransaccion(int IDdetransaccion) {
        this.IDdetransaccion = IDdetransaccion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }  
    
    public void modifica(){
    }
    
    
}
