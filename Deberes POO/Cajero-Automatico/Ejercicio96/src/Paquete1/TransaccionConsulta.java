
package Paquete1;

import javax.swing.JOptionPane;

public class TransaccionConsulta extends TransaccionATM {
    
    public String consulta;

    public TransaccionConsulta(String consulta, int IDdetransaccion, String Fecha, String tipo) {
        super(IDdetransaccion, Fecha, tipo);
        this.consulta = consulta;
    }
    
    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
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

    
    public void Procesamientodeconsultas(String h){
        
        JOptionPane.showMessageDialog(null, h, "Consulta de Transaccion", JOptionPane.PLAIN_MESSAGE);
        
    }
}
