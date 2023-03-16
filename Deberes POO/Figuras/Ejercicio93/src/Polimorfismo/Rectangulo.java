
package Polimorfismo;



public class Rectangulo extends Figura{
    
    protected double largo;
    protected double ancho;
    protected double area;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    
    
    @Override
     public double CalcularArea(){
         area=largo*ancho;
         
         return area;
     }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
     
}
