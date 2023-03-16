
package Polimorfismo;



public class Circuferencia extends Figura {
    
    protected double radio;
    protected double area;
    public Circuferencia(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea(){
         area=Math.PI*Math.pow(radio, 2);
         return area;
     }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
