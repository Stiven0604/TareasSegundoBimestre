
package Paquete1;

public class Cuenta {
    
    public String tipo;
    public String propietario;
    public TarjetaDebito tarje;
    public Cliente cliente;

    public Cuenta(String tipo, String propietario) {
        this.tipo = tipo;
        this.propietario = propietario;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public TarjetaDebito getTarje() {
        return tarje;
    }

    public void setTarje(TarjetaDebito tarje) {
        this.tarje = tarje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
            
}
