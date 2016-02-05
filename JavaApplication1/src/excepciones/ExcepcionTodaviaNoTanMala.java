/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //Declaramos un arrglo de enteros y lo inicializamos 
        int x[]={1,34,6,8};
      float m[]=new float[4];
        for(int i=0;i<m.length;i++){
        m[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del arreglo"));
            System.out.println(m[i]);
        }
        //Ciclo for each
         int u=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del arreglo"));
         float y[]=new float[u];
           for(float w:y){
            //y[w]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del arreglo"));
            System.out.println(w);
        }
        float z;
        //Todos los arreglos son tratados por el compilador como objetos
        A objeto=new A();
        //System.out.println(objeto.m);
        //System.out.println(x[2]);
        //System.out.println(y[0]);
    }
  
}
class A{
    float m;
}
