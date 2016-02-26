
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //Ciclo de vida del thread sin contar pausa
        //1.Creado
        MiPrimerThread t1=new MiPrimerThread();
        //Otro Thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //El thread t2 tiene que hacer que se inprima del 1 al 10 con
        //una diferencia de 5 segundos entre cada impresion.
        //t3 tiene que hacer que se imprima la frase 
        //"todos vamos a morir!!" hasta el final de los tiempos 
        //cada segundo 
         t1.setName("Chana");
        t2.setName("juana");
        t3.setName("pedro");
        //2. Inicializado
       
        t1.start();
        t2.start();
        t3.start();
        //3.En Ejecucion (cuando corras este programa!! y se active 
        //su metodo run
        //5.Muerte cuando complete la tarea que tiene del 
        //metodo run.
    }
    @Override
    public void run() {
       //Primero preguntamos si es el thread 2 y si es que imprima del 1 al 10
       if(Thread.currentThread().getName().equals("juana")){
           int x=1;
           for(int i=0;i<=30;i++){
              System.out.println(x++);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           
       }if(Thread.currentThread().getName().equals("pedro")){
           while(true){
               System.out.println("Todos vamos a morir!!");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       } 
    }
    
}
