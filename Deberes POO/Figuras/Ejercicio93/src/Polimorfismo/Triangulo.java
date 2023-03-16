
package Polimorfismo;


public class Triangulo extends Figura {
    
     protected double altura;
     protected double ancho;
     protected double area;

    public Triangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }
     
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
     
     @Override
     public double CalcularArea(){
         area=(ancho*altura)/2;
         return area;
     }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
     
      
}

