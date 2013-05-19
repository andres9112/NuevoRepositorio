/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion.cuadrantica;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class EcuacionCuadrantica {
  String x,y,z;
  double a,b,c,x1,x2;  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EcuacionCuadrantica ecuacion1 =new EcuacionCuadrantica();
         ecuacion1.x =JOptionPane.showInputDialog("Ingrese el valor de a: ");
       ecuacion1.y=JOptionPane.showInputDialog("Ingrese el valor de b: ");
       ecuacion1.z=JOptionPane.showInputDialog("Ingrese el valor de c: ");
       ecuacion1.a=Integer.parseInt( ecuacion1.x);
       ecuacion1.b=Integer.parseInt( ecuacion1.y);
       ecuacion1.c=Integer.parseInt(ecuacion1.z);
 if(ecuacion1.a==0){
     JOptionPane.showMessageDialog
        (null,"a=!0","ERROR!",JOptionPane.INFORMATION_MESSAGE);
 }else if(ecuacion1.b==0){
          JOptionPane.showMessageDialog
        (null,"LA SOLUCION NO EXISTE O ES TRIVIAL","SOLUCIÓN",JOptionPane.INFORMATION_MESSAGE);
       } else{
ecuacion1.x1=((-ecuacion1.b)-Math.sqrt(Math.pow(ecuacion1.b,2)-(4*ecuacion1.a*ecuacion1.c)))/(2*ecuacion1.a);
ecuacion1.x2=((-ecuacion1.b)+Math.sqrt(Math.pow(ecuacion1.b,2)-(4*ecuacion1.a*ecuacion1.c)))/(2*ecuacion1.a);
 JOptionPane.showMessageDialog
        (null,"x1: "+ecuacion1.x1,"SOLUCION",JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog
        (null,"x2: "+ecuacion1.x2,"SOLUCION",JOptionPane.INFORMATION_MESSAGE);
 }   
 
 }
}
