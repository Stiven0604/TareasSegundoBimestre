
package Polimorfismo;

import javax.swing.JOptionPane;
public class Main {
     public static void main(String []args){
         String m;
         String[] opc ={"Rectangulo","Circulo","Triangulo","Salir"};
         int s=1;
         while(s==1){
             m=" ";
              int op=JOptionPane.showOptionDialog(null, "Elegir la Figura que deseo conocer su area","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opc,opc[0]);
              if(op==0){
                  double a,b;
                  a=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura"));
                  b=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base"));
                  Figura rec = new Rectangulo(a,b); 
                  m=m+"El area es : "+rec.CalcularArea();
                  JOptionPane.showMessageDialog(null,m,"Area de un Rectangulo",JOptionPane.PLAIN_MESSAGE);

              }else{
                  if (op==1) {
                      double r;
                      r=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el radio"));
                      Figura cir = new Circuferencia(r);
                      m=m+"El area es : "+cir.CalcularArea();
                      JOptionPane.showMessageDialog(null,m,"Area de un circulo",JOptionPane.PLAIN_MESSAGE);
                  }else{
                      if (op==2) {
                          double a,b;
                          a=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura"));
                          b=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base"));
                          Figura tri = new Triangulo(a,b);
                          m=m+"El area es : "+tri.CalcularArea();
                          JOptionPane.showMessageDialog(null,m,"Area de un triangulo",JOptionPane.PLAIN_MESSAGE); 
                      }else{
                          if (op==3) {
                              s=0;
                              JOptionPane.showMessageDialog(null,"Muchas gracias");
                          }
                      }
                  }
              }
         }
                
                    
         
     }
}
