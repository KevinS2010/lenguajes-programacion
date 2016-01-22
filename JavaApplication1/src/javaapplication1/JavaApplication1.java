
package javaapplication1;

import javax.swing.JFrame;

public class JavaApplication1 {
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Dame mi punto");
        /*
        Ejercicio No. 1 Crear una ventana y personalizar el titulo 
        con un constructor
        */
        JFrame ventana=new JFrame("Hola mundo");
               ventana.setSize(350, 350);
               ventana.setVisible(true);
               
    }
    
}
